package uz.javokhir.qr.master.screens.customize

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.javokhir.qr.master.domain.customize.ColorPickerMode
import uz.javokhir.qr.master.domain.customize.CustomizeEvent
import uz.javokhir.qr.master.domain.customize.CustomizeState
import uz.javokhir.qr.master.domain.customize.toModel
import uz.javokhir.qr.master.screens.pickerColor.extensions.toColor
import uz.javokhir.qr.master.screens.pickerColor.picker.ColorPickerDialog
import uz.javokhir.qr.master.ui.components.AppFilledButton
import uz.javokhir.qr.master.ui.components.AppOutlinedButton
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.components.DividerContent
import uz.javokhir.qr.master.ui.extensions.clickableSingle
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun CustomizeScreenContent(
    state: CustomizeState,
    onEvent: (CustomizeEvent) -> Unit,
    onCustomize: () -> Unit,
) {
    if (state.showColorPicker) {
        ColorPickerDialog(
            onDismissRequest = {
                onEvent(CustomizeEvent.DismissColorPicker)
            },
            onPickedColor = {
//                onEvent(CustomizeEvent.SelectColor(it.toHex()))
            }
        )
    }

    if (state.showPreview) {
        QrPreviewDialog(
            customize = state.toModel(),
            onDismissRequest = {
                onEvent(CustomizeEvent.ShowHidePreview(false))
            }
        )
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(28.dp),
            contentPadding = PaddingValues(vertical = 20.dp)
        ) {
            item {
                QRCodePatternContent(
                    state = state,
                    onEvent = onEvent
                )
            }
            item {
                DividerContent(
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
            }
            item {
                CornerStyleContent(
                    state = state,
                    onEvent = onEvent
                )
            }
            item {
                DividerContent(
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
            }
            item {
                AddLogoContent(
                    state = state,
                    onEvent = onEvent,
                )
            }
            item {
                Spacer(modifier = Modifier.height(70.dp))
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background)
                .align(Alignment.BottomCenter),
        ) {
            DividerContent()

            Row(
                modifier = Modifier.padding(
                    horizontal = 20.dp,
                    vertical = 16.dp
                ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                AppOutlinedButton(
                    text = AppStrings.preview,
                    onClick = {
                        onEvent(CustomizeEvent.ShowHidePreview(true))
                    },
                    modifier = Modifier.weight(1f)
                )

                AppFilledButton(
                    text = AppStrings.save,
                    onClick = onCustomize,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
private fun QRCodePatternContent(
    state: CustomizeState,
    onEvent: (CustomizeEvent) -> Unit,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            text = AppStrings.qrCodePattern,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(horizontal = 20.dp)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 20.dp)
        ) {
            items(state.patterns) { pattern ->
                SelectPatternContent(
                    icon = pattern.icon,
                    selected = pattern == state.selectedPattern,
                    onClick = {
                        onEvent(CustomizeEvent.SelectPattern(pattern))
                    }
                )
            }
        }

        Row(
            modifier = Modifier.padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppTextField(
                baseModifier = Modifier.weight(1f),
                modifier = Modifier.clickableSingle(
                    onClick = {
                        onEvent(CustomizeEvent.ShowColorPicker(ColorPickerMode.PatternDotColor))
                    },
                    hasIndication = false
                ),
                value = "#${state.patternDotHex}",
                onValueChange = {},
                hint = AppStrings.dotColor,
                trailingIcon = {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = CircleShape
                            )
                            .background(state.patternDotHex.toColor())
                    )
                },
                readOnly = true
            )

            AppTextField(
                baseModifier = Modifier.weight(1f),
                modifier = Modifier.clickableSingle(
                    onClick = {
                        onEvent(CustomizeEvent.ShowColorPicker(ColorPickerMode.PatternBackgroundColor))
                    },
                    hasIndication = false
                ),
                value = "#${state.patternBackgroundHex}",
                onValueChange = {},
                hint = AppStrings.backgroundColor,
                trailingIcon = {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = CircleShape
                            )
                            .background(state.patternBackgroundHex.toColor())
                    )
                },
                readOnly = true
            )
        }
    }
}

@Composable
private fun SelectPatternContent(
    icon: ImageVector,
    size: Dp = 80.dp,
    selected: Boolean,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .size(size)
            .clip(MaterialTheme.shapes.medium)
            .border(
                width = if (selected) (1.5).dp else 1.dp,
                color = if (selected) {
                    MaterialTheme.colorScheme.primary
                } else {
                    MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
                },
                shape = MaterialTheme.shapes.medium
            )
            .background(MaterialTheme.colorScheme.background)
            .clickableSingle(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Image(
            imageVector = icon,
            contentDescription = null,
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.outline)
        )
    }
}

@Composable
private fun CornerStyleContent(
    state: CustomizeState,
    onEvent: (CustomizeEvent) -> Unit,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            text = AppStrings.cornerStyle,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(horizontal = 20.dp)
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = AppStrings.frameStyle,
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 20.dp)
            ) {
                items(state.corners) { corner ->
                    SelectPatternContent(
                        icon = corner.icon,
                        size = 56.dp,
                        selected = corner == state.selectedCorner,
                        onClick = {
                            onEvent(CustomizeEvent.SelectCorner(corner))
                        }
                    )
                }
            }
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = AppStrings.dotsStyle,
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 20.dp)
            ) {
                items(state.dots) { dot ->
                    SelectPatternContent(
                        icon = dot.icon,
                        size = 56.dp,
                        selected = dot == state.selectedDot,
                        onClick = {
                            onEvent(CustomizeEvent.SelectDot(dot))
                        }
                    )
                }
            }
        }

        Row(
            modifier = Modifier.padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppTextField(
                baseModifier = Modifier.weight(1f),
                modifier = Modifier.clickableSingle(
                    onClick = {
                        onEvent(CustomizeEvent.ShowColorPicker(ColorPickerMode.FrameColor))
                    },
                    hasIndication = false
                ),
                value = "#${state.frameHex}",
                onValueChange = {},
                hint = AppStrings.frameColor,
                trailingIcon = {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = CircleShape
                            )
                            .background(state.frameHex.toColor())
                    )
                },
                readOnly = true
            )

            AppTextField(
                baseModifier = Modifier.weight(1f),
                modifier = Modifier.clickableSingle(
                    onClick = {
                        onEvent(CustomizeEvent.ShowColorPicker(ColorPickerMode.FrameDotColor))
                    },
                    hasIndication = false
                ),
                value = "#${state.frameDotHex}",
                onValueChange = {},
                hint = AppStrings.dotsColor,
                trailingIcon = {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = CircleShape
                            )
                            .background(state.frameDotHex.toColor())
                    )
                },
                readOnly = true
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun AddLogoContent(
    state: CustomizeState,
    onEvent: (CustomizeEvent) -> Unit,
) {
    Column {
        Text(
            text = AppStrings.addLogo,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(horizontal = 20.dp)
        )

        FlowRow(
            modifier = Modifier.padding(14.dp)
        ) {
            state.logos.forEach {
                Box(
                    modifier = Modifier
                        .size(52.dp)
                        .clip(CircleShape)
                        .border(
                            width = 2.dp,
                            color = if (it == state.selectedLogo) {
                                MaterialTheme.colorScheme.primary
                            } else {
                                Color.Transparent
                            },
                            shape = CircleShape
                        )
                        .clickableSingle { onEvent(CustomizeEvent.SelectLogo(it)) },
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        imageVector = it,
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                    )
                }
            }
        }
    }
}