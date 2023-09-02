package uz.javokhir.qr.master.screens.creator.addContent

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import uz.javokhir.qr.master.core.datetime.defaultDateTime
import uz.javokhir.qr.master.data.model.common.EditContent
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.creator.biz.BizContentScreenModel
import uz.javokhir.qr.master.domain.creator.business.BusinessContentScreenModel
import uz.javokhir.qr.master.domain.creator.contact.ContactContentScreenModel
import uz.javokhir.qr.master.domain.creator.email.EmailContentScreenModel
import uz.javokhir.qr.master.domain.creator.event.EventContentScreenModel
import uz.javokhir.qr.master.domain.creator.location.LocationContentScreenModel
import uz.javokhir.qr.master.domain.creator.phone.PhoneContentScreenModel
import uz.javokhir.qr.master.domain.creator.sms.SmsContentScreenModel
import uz.javokhir.qr.master.domain.creator.socialMedia.SocialMediaContentScreenModel
import uz.javokhir.qr.master.domain.creator.text.TextContentScreenModel
import uz.javokhir.qr.master.domain.creator.website.WebsiteContentScreenModel
import uz.javokhir.qr.master.domain.creator.wifi.WifiContentScreenModel
import uz.javokhir.qr.master.screens.creator.contents.BizContent
import uz.javokhir.qr.master.screens.creator.contents.BusinessContent
import uz.javokhir.qr.master.screens.creator.contents.ContactContent
import uz.javokhir.qr.master.screens.creator.contents.EmailContent
import uz.javokhir.qr.master.screens.creator.contents.EventContent
import uz.javokhir.qr.master.screens.creator.contents.LocationContent
import uz.javokhir.qr.master.screens.creator.contents.PhoneContent
import uz.javokhir.qr.master.screens.creator.contents.SmsContent
import uz.javokhir.qr.master.screens.creator.contents.SocialMediaContent
import uz.javokhir.qr.master.screens.creator.contents.TextContent
import uz.javokhir.qr.master.screens.creator.contents.WebsiteContent
import uz.javokhir.qr.master.screens.creator.contents.WifiContent
import uz.javokhir.qr.master.screens.qrCode.QrCodeScreen
import kotlin.jvm.Transient

data class AddContentScreen(
    val id: String,
    val generateMode: GenerateMode,
    val encoded: String = "",
    val editable: Boolean = false,
    @Transient val onEditContent: ((EditContent) -> Unit)? = null,
) : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        var encodedContent by remember { mutableStateOf("") }
        var decodedContent by remember { mutableStateOf("") }
        var enabled by remember { mutableStateOf(false) }

        val onContent: (Boolean, String, String) -> Unit = { isEnabled, encoded, decode ->
            enabled = isEnabled
            encodedContent = encoded
            decodedContent = decode
        }

        AddContentScreenContent(
            generateMode = generateMode,
            enabled = enabled,
            onClick = {
                if (editable) {
                    onEditContent?.let {
                        it.invoke(EditContent(encodedContent, decodedContent))
                        navigator.pop()
                    }
                } else {
                    navigator.push(
                        QrCodeScreen(
                            id = id,
                            dateTime = defaultDateTime(),
                            scanned = false,
                            generateMode = generateMode,
                            encoded = encodedContent,
                            decoded = decodedContent,
                            customize = QrCustomizeModel(),
                            editable = false,
                            deletable = false
                        )
                    )
                }
            }
        ) {
            when (generateMode) {
                GenerateMode.Text -> {
                    val screenModel = rememberScreenModel { TextContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    TextContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent,
                    )
                }

                GenerateMode.Website -> {
                    val screenModel = rememberScreenModel { WebsiteContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    WebsiteContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent
                    )
                }

                GenerateMode.Sms -> {
                    val screenModel = rememberScreenModel { SmsContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    SmsContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent
                    )
                }

                GenerateMode.PhoneNumber -> {
                    val screenModel = rememberScreenModel { PhoneContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    PhoneContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent
                    )
                }

                GenerateMode.EmailAddress -> {
                    val screenModel = rememberScreenModel { EmailContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    EmailContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent
                    )
                }

                GenerateMode.Wifi -> {
                    val screenModel = rememberScreenModel { WifiContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    WifiContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent
                    )
                }

                GenerateMode.ContactVCard -> {
                    val screenModel = rememberScreenModel { ContactContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    ContactContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent
                    )
                }

                GenerateMode.CalendarEvent -> {
                    val screenModel = rememberScreenModel { EventContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    EventContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        onNavigate = navigator::push,
                        encoded = encoded,
                        onContent = onContent,
                    )
                }

                GenerateMode.BizCard -> {
                    val screenModel = rememberScreenModel { BizContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    BizContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent
                    )
                }

                GenerateMode.BusinessVCard -> {
                    val screenModel = rememberScreenModel { BusinessContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    BusinessContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        encoded = encoded,
                        onContent = onContent
                    )
                }

                GenerateMode.Location -> {
                    val screenModel = rememberScreenModel { LocationContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    LocationContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        onNavigate = navigator::push,
                        encoded = encoded,
                        onContent = onContent,
                    )
                }

                else -> {
                    val screenModel = rememberScreenModel { SocialMediaContentScreenModel() }
                    val state by screenModel.state.collectAsState()

                    SocialMediaContent(
                        state = state,
                        onEvent = screenModel::onEvent,
                        mode = generateMode,
                        encoded = encoded,
                        onContent = onContent
                    )
                }
            }
        }
    }
}