package uz.javokhir.qr.master.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun AppFilledButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    small: Boolean = false,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    textStyle: TextStyle = if (small) {
        MaterialTheme.typography.titleSmall
    } else {
        MaterialTheme.typography.titleMedium
    },
    shape: CornerBasedShape = MaterialTheme.shapes.large,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = if (small) {
            modifier
                .fillMaxWidth()
                .heightIn(min = AppButtonDefaults.SmallButtonHeight)
        } else {
            modifier
                .fillMaxWidth()
                .heightIn(min = AppButtonDefaults.NormalButtonHeight)
        },
        enabled = enabled,
        colors = AppButtonDefaults.filledButtonColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        shape = shape,
        contentPadding = AppButtonDefaults.buttonContentPadding(
            small = small,
            leadingIcon = leadingIcon != null,
            trailingIcon = trailingIcon != null
        ),
        content = {
            ProvideTextStyle(value = textStyle) {
                ButtonContent(
                    text = text,
                    leadingIcon = leadingIcon,
                    trailingIcon = trailingIcon,
                    contentColor = contentColor
                )
            }
        }
    )
}

@Composable
fun AppOutlinedButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    small: Boolean = false,
    containerColor: Color = Color.Transparent,
    contentColor: Color = MaterialTheme.colorScheme.onBackground,
    textStyle: TextStyle = if (small) {
        MaterialTheme.typography.titleSmall
    } else {
        MaterialTheme.typography.titleMedium
    },
    shape: CornerBasedShape = MaterialTheme.shapes.large,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    onClick: () -> Unit,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = if (small) {
            modifier
                .fillMaxWidth()
                .heightIn(min = AppButtonDefaults.SmallButtonHeight)
        } else {
            modifier
                .fillMaxWidth()
                .heightIn(min = AppButtonDefaults.NormalButtonHeight)
        },
        enabled = enabled,
        colors = AppButtonDefaults.textButtonColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        shape = shape,
        border = BorderStroke(
            width = 1.dp,
            color = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
        ),
        contentPadding = AppButtonDefaults.buttonContentPadding(
            small = small,
            leadingIcon = leadingIcon != null,
            trailingIcon = trailingIcon != null
        ),
        content = {
            ProvideTextStyle(value = textStyle) {
                ButtonContent(
                    text = text,
                    leadingIcon = leadingIcon,
                    trailingIcon = trailingIcon,
                    contentColor = contentColor
                )
            }
        }
    )
}

@Composable
private fun RowScope.ButtonContent(
    text: String,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    contentColor: Color,
) {
    if (leadingIcon != null) {
        Box(
            modifier = Modifier.sizeIn(maxHeight = AppButtonDefaults.ButtonIconSize)
        ) {
            AppIcon(
                imageVector = leadingIcon,
                color = contentColor
            )
        }
    }

    Box(
        modifier = Modifier
            .weight(1f, fill = false)
            .padding(
                start = if (leadingIcon != null) {
                    AppButtonDefaults.ButtonContentSpacing
                } else {
                    0.dp
                },
                end = if (trailingIcon != null) {
                    AppButtonDefaults.ButtonContentSpacing
                } else {
                    0.dp
                }
            )
    ) {
        Text(text = text)
    }

    if (trailingIcon != null) {
        Box(
            modifier = Modifier.sizeIn(maxHeight = AppButtonDefaults.ButtonIconSize)
        ) {
            AppIcon(
                imageVector = trailingIcon,
                color = contentColor
            )
        }
    }
}

private object AppButtonDefaults {

    val SmallButtonHeight = 36.dp
    val NormalButtonHeight = 48.dp

    private const val DisabledButtonContainerAlpha = 0.12f
    private const val DisabledButtonContentAlpha = 0.38f

    private val ButtonHorizontalPadding = 24.dp
    private val SmallButtonHorizontalPadding = 16.dp

    val ButtonContentSpacing = 12.dp
    val ButtonIconSize = 24.dp

    @Composable
    fun filledButtonColors(
        containerColor: Color = MaterialTheme.colorScheme.primary,
        contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    ) = ButtonDefaults.buttonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = MaterialTheme.colorScheme.onBackground.copy(
            alpha = DisabledButtonContainerAlpha
        ),
        disabledContentColor = MaterialTheme.colorScheme.onBackground.copy(
            alpha = DisabledButtonContentAlpha
        )
    )

    @Composable
    fun textButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.colorScheme.onBackground,
    ) = ButtonDefaults.textButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = containerColor,
        disabledContentColor = contentColor.copy(
            alpha = DisabledButtonContentAlpha
        )
    )

    fun buttonContentPadding(
        small: Boolean,
        leadingIcon: Boolean = false,
        trailingIcon: Boolean = false,
    ): PaddingValues {
        return PaddingValues(
            start = when {
                small && leadingIcon -> SmallButtonHorizontalPadding
                small -> SmallButtonHorizontalPadding
                else -> ButtonHorizontalPadding
            },
            top = 0.dp,
            end = when {
                small && trailingIcon -> SmallButtonHorizontalPadding
                small -> SmallButtonHorizontalPadding
                else -> ButtonHorizontalPadding
            },
            bottom = 0.dp
        )
    }
}