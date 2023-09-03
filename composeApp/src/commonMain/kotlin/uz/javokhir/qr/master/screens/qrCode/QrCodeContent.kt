package uz.javokhir.qr.master.screens.qrCode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.creator.biz.toBizContent
import uz.javokhir.qr.master.domain.creator.business.toBusinessContent
import uz.javokhir.qr.master.domain.creator.contact.toContactContent
import uz.javokhir.qr.master.domain.creator.email.toEmailContent
import uz.javokhir.qr.master.domain.creator.event.toEventContent
import uz.javokhir.qr.master.domain.creator.location.toLocationContent
import uz.javokhir.qr.master.domain.creator.phone.toPhoneContent
import uz.javokhir.qr.master.domain.creator.sms.toSmsContent
import uz.javokhir.qr.master.domain.creator.wifi.toWifiContent
import uz.javokhir.qr.master.shared.platform.addContact
import uz.javokhir.qr.master.shared.platform.addToCalendar
import uz.javokhir.qr.master.shared.platform.connectToWifi
import uz.javokhir.qr.master.shared.platform.copyToClipboard
import uz.javokhir.qr.master.shared.platform.dial
import uz.javokhir.qr.master.shared.platform.openUrl
import uz.javokhir.qr.master.shared.platform.saveQrImage
import uz.javokhir.qr.master.shared.platform.searchGoogle
import uz.javokhir.qr.master.shared.platform.sendMail
import uz.javokhir.qr.master.shared.platform.sendSms
import uz.javokhir.qr.master.shared.platform.shareQrImage
import uz.javokhir.qr.master.shared.platform.showAddress
import uz.javokhir.qr.master.shared.platform.showLocation
import uz.javokhir.qr.master.shared.ui.rememberQrBitmap
import uz.javokhir.qr.master.ui.components.AppIcon
import uz.javokhir.qr.master.ui.components.QrImage
import uz.javokhir.qr.master.ui.extensions.clickableSingle
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun QrDetailContent(
    dateTime: String,
    generateMode: GenerateMode,
    encoded: String,
    decoded: String,
    customize: QrCustomizeModel,
    editable: Boolean = false,
    deletable: Boolean = false,
    chromeCustomTabsEnabled: Boolean = false,
    onCustomize: (QrCustomizeModel) -> Unit,
    onEdit: () -> Unit = {},
    onDelete: () -> Unit = {},
) {
    val qrBitmap = rememberQrBitmap(
        content = encoded,
        customize = customize,
    )

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(20.dp)
    ) {
        item {
            CustomizeContent {
                onCustomize(customize)
            }
        }
        qrBitmap?.let {
            item { QrImage(it) }
        }
        item {
            when (generateMode) {
                GenerateMode.Text -> {
                    TextContent(encoded, decoded, dateTime, chromeCustomTabsEnabled)
                }

                GenerateMode.Website -> {
                    WebsiteContent(encoded, decoded, dateTime, chromeCustomTabsEnabled)
                }

                GenerateMode.Sms -> SmsContent(encoded, decoded, dateTime)
                GenerateMode.PhoneNumber -> PhoneContent(encoded, decoded, dateTime)
                GenerateMode.EmailAddress -> EmailContent(encoded, decoded, dateTime)
                GenerateMode.Wifi -> WifiContent(encoded, decoded, dateTime)
                GenerateMode.ContactVCard -> ContactContent(encoded, decoded, dateTime)
                GenerateMode.CalendarEvent -> EventContent(encoded, decoded, dateTime)
                GenerateMode.BizCard -> {
                    BizCardContent(encoded, decoded, dateTime, chromeCustomTabsEnabled)
                }

                GenerateMode.BusinessVCard -> {
                    BusinessContent(encoded, decoded, dateTime, chromeCustomTabsEnabled)
                }

                GenerateMode.Location -> LocationContent(encoded, decoded, dateTime)
                else -> {
                    WebsiteContent(encoded, decoded, dateTime, chromeCustomTabsEnabled)
                }
            }
        }
        item {
            ActionsContent(
                editable = editable,
                deletable = deletable,
                onSave = {
                    saveQrImage(qrBitmap)
                },
                onShare = {
                    shareQrImage(qrBitmap)
                },
                onCopy = {
                    copyToClipboard(encoded)
                },
                onEdit = onEdit,
                onDelete = onDelete
            )
        }
    }
}

@Composable
private fun CustomizeContent(
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        Row(
            modifier = Modifier
                .clip(MaterialTheme.shapes.medium)
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
                    shape = MaterialTheme.shapes.medium
                )
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f))
                .clickableSingle(onClick = onClick)
                .padding(
                    horizontal = 14.dp,
                    vertical = 10.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppIcon(
                imageVector = AppIcons.customize,
                color = MaterialTheme.colorScheme.primary
            )

            Text(
                text = AppStrings.customize,
                style = MaterialTheme.typography.titleMedium,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Composable
private fun TextContent(
    encoded: String,
    decoded: String,
    dateTime: String,
    chromeCustomTabsEnabled: Boolean,
) {
    DecodeContent(decoded, dateTime) {
        ContentActionButton(AppStrings.searchOnWeb, AppIcons.search) {
            searchGoogle(encoded, chromeCustomTabsEnabled)
        }
    }
}

@Composable
private fun WebsiteContent(
    encoded: String,
    decoded: String,
    dateTime: String,
    chromeCustomTabsEnabled: Boolean,
) {
    DecodeContent(decoded, dateTime) {
        ContentActionButton(AppStrings.openWebsite, AppIcons.openWebsite) {
            openUrl(encoded, chromeCustomTabsEnabled)
        }
    }
}

@Composable
private fun SmsContent(
    encoded: String,
    decoded: String,
    dateTime: String,
) {
    val content = remember(encoded) { encoded.toSmsContent() }
    val phone = remember(content) { content?.phone.orEmpty() }
    val message = remember(content) { content?.message.orEmpty() }

    DecodeContent(decoded, dateTime) {
        if (phone.isNotEmpty()) {
            if (message.isNotEmpty()) {
                ContentActionButton(AppStrings.sendSms, AppIcons.sms) {
                    sendSms(phone, message)
                }
            }

            ContentActionButton(AppStrings.addContact, AppIcons.addContact) {
                addContact(phone)
            }

            ContentActionButton(AppStrings.dial(phone), AppIcons.call) {
                dial(phone)
            }
        }
    }
}

@Composable
private fun PhoneContent(
    encoded: String,
    decoded: String,
    dateTime: String,
) {
    val phone = remember(encoded) { encoded.toPhoneContent()?.phone.orEmpty() }

    DecodeContent(decoded, dateTime) {
        if (phone.isNotEmpty()) {
            ContentActionButton(AppStrings.addContact, AppIcons.addContact) {
                addContact(phone)
            }

            ContentActionButton(AppStrings.dial(phone), AppIcons.call) {
                dial(phone)
            }
        }
    }
}

@Composable
private fun EmailContent(
    encoded: String,
    decoded: String,
    dateTime: String,
) {
    val content = remember(encoded) { encoded.toEmailContent() }
    val email = remember(content) { content?.email.orEmpty() }
    val subject = remember(content) { content?.subject.orEmpty() }
    val message = remember(content) { content?.message.orEmpty() }

    DecodeContent(decoded, dateTime) {
        if (email.isNotEmpty()) {
            ContentActionButton(AppStrings.sendEmail, AppIcons.mail) {
                sendMail(email, subject, message)
            }
        }
    }
}

@Composable
private fun LocationContent(
    encoded: String,
    decoded: String,
    dateTime: String,
) {
    val content = remember(encoded) { encoded.toLocationContent() }
    val latitude = remember(content) { content?.latitude.orEmpty() }
    val longitude = remember(content) { content?.longitude.orEmpty() }

    DecodeContent(decoded, dateTime) {
        if (latitude.isNotEmpty() && longitude.isNotEmpty()) {
            ContentActionButton(AppStrings.showLocation, AppIcons.showLocation) {
                showLocation(latitude, longitude)
            }
        }
    }
}

@Composable
private fun WifiContent(
    encoded: String,
    decoded: String,
    dateTime: String,
) {
    val content = remember(encoded) { encoded.toWifiContent() }
    val networkName = remember(content) { content?.networkName.orEmpty() }
    val password = remember(content) { content?.password.orEmpty() }
    val hidden = remember(content) { content?.hidden ?: false }

    DecodeContent(decoded, dateTime) {
        ContentActionButton(AppStrings.connectToWifi, AppIcons.wifi) {
            connectToWifi(
                networkName,
                password,
                hidden
            )
        }

        if (networkName.isNotEmpty()) {
            ContentActionButton(AppStrings.copyNetworkName, AppIcons.copy) {
                copyToClipboard(networkName)
            }
        }

        if (password.isNotEmpty()) {
            ContentActionButton(AppStrings.copyPassword, AppIcons.copy) {
                copyToClipboard(password)
            }
        }
    }
}

@Composable
private fun ContactContent(
    encoded: String,
    decoded: String,
    dateTime: String,
) {
    val content = remember(encoded) { encoded.toContactContent() }
    val name = remember(content) { content?.name.orEmpty() }
    val phone = remember(content) { content?.phone.orEmpty() }
    val email = remember(content) { content?.email.orEmpty() }
    val address = remember(content) { content?.address.orEmpty() }

    DecodeContent(decoded, dateTime) {
        if (phone.isNotEmpty()) {
            ContentActionButton(AppStrings.addContact, AppIcons.addContact) {
                addContact(
                    phone = phone,
                    name = name,
                    email = email,
                    address = address
                )
            }

            ContentActionButton(AppStrings.dial(phone), AppIcons.call) {
                dial(phone)
            }
        }

        if (email.isNotEmpty()) {
            ContentActionButton(AppStrings.sendEmail, AppIcons.mail) {
                sendMail(email)
            }
        }

        if (address.isNotEmpty()) {
            ContentActionButton(AppStrings.viewAddress, AppIcons.showLocation) {
                showAddress(address)
            }
        }
    }
}

@Composable
private fun BusinessContent(
    encoded: String,
    decoded: String,
    dateTime: String,
    chromeCustomTabsEnabled: Boolean,
) {
    val content = remember(encoded) { encoded.toBusinessContent() }
    val name = remember(content) { content?.name.orEmpty() }
    val industry = remember(content) { content?.industry.orEmpty() }
    val phone = remember(content) { content?.phone.orEmpty() }
    val email = remember(content) { content?.email.orEmpty() }
    val website = remember(content) { content?.website.orEmpty() }
    val address = remember(content) { content?.address.orEmpty() }

    DecodeContent(decoded, dateTime) {
        if (phone.isNotEmpty()) {
            ContentActionButton(AppStrings.addContact, AppIcons.addContact) {
                addContact(
                    phone = phone,
                    name = name,
                    company = industry,
                    email = email,
                    address = address
                )
            }

            ContentActionButton(AppStrings.dial(phone), AppIcons.call) {
                dial(phone)
            }
        }

        if (email.isNotEmpty()) {
            ContentActionButton(AppStrings.sendEmail, AppIcons.mail) {
                sendMail(email)
            }
        }

        if (website.isNotEmpty()) {
            ContentActionButton(AppStrings.openWebsite, AppIcons.openWebsite) {
                openUrl(website, chromeCustomTabsEnabled)
            }
        }

        if (address.isNotEmpty()) {
            ContentActionButton(AppStrings.viewAddress, AppIcons.showLocation) {
                showAddress(address)
            }
        }
    }
}

@Composable
private fun BizCardContent(
    encoded: String,
    decoded: String,
    dateTime: String,
    chromeCustomTabsEnabled: Boolean,
) {
    val content = remember(encoded) { encoded.toBizContent() }
    val firstName = remember(content) { content?.firstName.orEmpty() }
    val lastName = remember(content) { content?.lastName.orEmpty() }
    val company = remember(content) { content?.company.orEmpty() }
    val job = remember(content) { content?.job.orEmpty() }
    val phone = remember(content) { content?.phone.orEmpty() }
    val email = remember(content) { content?.email.orEmpty() }
    val website = remember(content) { content?.website.orEmpty() }
    val address = remember(content) { content?.address.orEmpty() }

    DecodeContent(decoded, dateTime) {
        if (phone.isNotEmpty()) {
            ContentActionButton(AppStrings.addContact, AppIcons.addContact) {
                addContact(
                    phone = phone,
                    name = "$firstName $lastName".trim(),
                    company = company,
                    job = job,
                    email = email,
                    address = address
                )
            }

            ContentActionButton(AppStrings.dial(phone), AppIcons.call) {
                dial(phone)
            }
        }

        if (email.isNotEmpty()) {
            ContentActionButton(AppStrings.sendEmail, AppIcons.mail) {
                sendMail(email)
            }
        }

        if (website.isNotEmpty()) {
            ContentActionButton(AppStrings.openWebsite, AppIcons.openWebsite) {
                openUrl(website, chromeCustomTabsEnabled)
            }
        }

        if (address.isNotEmpty()) {
            ContentActionButton(AppStrings.viewAddress, AppIcons.showLocation) {
                showAddress(address)
            }
        }
    }
}

@Composable
private fun EventContent(
    encoded: String,
    decoded: String,
    dateTime: String,
) {
    val content = remember(encoded) { encoded.toEventContent() }

    DecodeContent(decoded, dateTime) {
        ContentActionButton(AppStrings.addToCalendar, AppIcons.today) {
            addToCalendar(
                name = content?.name.orEmpty(),
                location = content?.location.orEmpty(),
                description = content?.description.orEmpty(),
                allDay = content?.allDay ?: false,
                startMillis = content?.startTimestamp,
                endMillis = content?.endTimestamp
            )
        }
    }
}

@Composable
private fun DecodeContent(
    decoded: String,
    dateTime: String,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = decoded,
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = dateTime,
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.outline
            )
        }

        content()
    }
}

@Composable
private fun ContentActionButton(
    text: String,
    icon: ImageVector,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier.clickableSingle(
            onClick = onClick,
            hasIndication = false
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Image(
            imageVector = icon,
            contentDescription = text,
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary)
                .padding(7.dp),
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onPrimary)
        )

        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ActionsContent(
    editable: Boolean,
    deletable: Boolean,
    onSave: () -> Unit,
    onShare: () -> Unit,
    onCopy: () -> Unit,
    onEdit: () -> Unit,
    onDelete: () -> Unit,
) {
    FlowRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(
            space = 4.dp,
            alignment = Alignment.CenterHorizontally
        ),
        verticalArrangement = Arrangement.spacedBy(
            space = 12.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        ActionButtonContent(
            text = AppStrings.save,
            icon = AppIcons.save,
            onClick = onSave
        )

        ActionButtonContent(
            text = AppStrings.share,
            icon = AppIcons.share,
            onClick = onShare
        )

        ActionButtonContent(
            text = AppStrings.copy,
            icon = AppIcons.copy,
            onClick = onCopy
        )

        if (editable) {
            ActionButtonContent(
                text = AppStrings.edit,
                icon = AppIcons.edit,
                onClick = onEdit
            )
        }

        if (deletable) {
            ActionButtonContent(
                text = AppStrings.delete,
                icon = AppIcons.delete,
                color = MaterialTheme.colorScheme.error,
                onClick = onDelete
            )
        }
    }
}

@Composable
private fun ActionButtonContent(
    text: String,
    icon: ImageVector,
    color: Color = MaterialTheme.colorScheme.onBackground,
    onClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .clip(MaterialTheme.shapes.small)
            .clickableSingle(onClick = onClick)
            .padding(
                horizontal = 12.dp,
                vertical = 4.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        AppIcon(
            imageVector = icon,
            color = color
        )

        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = color
        )
    }
}