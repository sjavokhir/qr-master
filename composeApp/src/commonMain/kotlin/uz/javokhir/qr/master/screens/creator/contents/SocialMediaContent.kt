package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.creator.socialMedia.SocialMediaContentEvent
import uz.javokhir.qr.master.domain.creator.socialMedia.SocialMediaContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun SocialMediaContent(
    state: SocialMediaContentState,
    onEvent: (SocialMediaContentEvent) -> Unit,
    mode: GenerateMode,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(mode) {
        onEvent(SocialMediaContentEvent.SetGenerateMode(mode))
    }

    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(SocialMediaContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.username,
            onValueChange = {
                onEvent(SocialMediaContentEvent.UsernameChanged(it))
            },
            placeholder = mode.inputPlaceholder(),
            hint = mode.inputHint(),
            keyboardType = if (mode == GenerateMode.WhatsApp) {
                KeyboardType.Phone
            } else {
                KeyboardType.Text
            }
        )
    }
}

@Composable
private fun GenerateMode.inputHint(): String {
    return when (this) {
        GenerateMode.Instagram,
        GenerateMode.Facebook,
        GenerateMode.Twitter,
        GenerateMode.TikTok,
        GenerateMode.Telegram,
        GenerateMode.VKontakte,
        GenerateMode.Github,
        GenerateMode.Medium,
        -> AppStrings.socialMediaUsername(title)

        GenerateMode.Youtube,
        GenerateMode.Twitch,
        -> AppStrings.socialMediaChannel(title)

        GenerateMode.LinkedIn,
        GenerateMode.Dribbble,
        GenerateMode.Behance,
        -> AppStrings.socialMediaProfile(title)

        GenerateMode.WhatsApp -> AppStrings.whatsappNumber

        else -> AppStrings.text
    }
}

@Composable
private fun GenerateMode.inputPlaceholder(): String {
    return when (this) {
        GenerateMode.Instagram -> "e.g. cristiano"
        GenerateMode.Facebook -> "e.g. cristiano"
        GenerateMode.Twitter -> "e.g. elonmusk"
        GenerateMode.TikTok -> "e.g. khaby.lame"
        GenerateMode.Telegram -> "e.g. durov"
        GenerateMode.VKontakte -> "e.g. durov"
        GenerateMode.Github -> "e.g. freeCodeCamp"
        GenerateMode.Medium -> "e.g. swlh"
        GenerateMode.Youtube -> "e.g. MrBeast"
        GenerateMode.Twitch -> "e.g. ninja"
        GenerateMode.LinkedIn -> "e.g. williamhgates"
        GenerateMode.Dribbble -> "e.g. zhenyary"
        GenerateMode.Behance -> "e.g. zekadesign"
        GenerateMode.WhatsApp -> AppStrings.egPlaceholderPhone
        else -> AppStrings.enterValue
    }
}