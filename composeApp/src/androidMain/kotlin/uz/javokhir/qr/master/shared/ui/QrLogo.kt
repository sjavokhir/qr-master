package uz.javokhir.qr.master.shared.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import uz.javokhir.qr.master.R
import uz.javokhir.qr.master.data.model.common.QrLogo

@Composable
actual fun rememberQrLogos(): List<QrLogo> {
    val logos = listOf(
        QrLogo("amazon", ImageVector.vectorResource(R.drawable.amazon)),
        QrLogo("apple", ImageVector.vectorResource(R.drawable.apple)),
        QrLogo("behance", ImageVector.vectorResource(R.drawable.behance)),
        QrLogo("chrome", ImageVector.vectorResource(R.drawable.chrome)),
        QrLogo("discord", ImageVector.vectorResource(R.drawable.discord)),
        QrLogo("dribbble", ImageVector.vectorResource(R.drawable.dribbble)),
        QrLogo("drive", ImageVector.vectorResource(R.drawable.drive)),
        QrLogo("facebook", ImageVector.vectorResource(R.drawable.facebook)),
        QrLogo("figma", ImageVector.vectorResource(R.drawable.figma)),
        QrLogo("github", ImageVector.vectorResource(R.drawable.github)),
        QrLogo("gmail", ImageVector.vectorResource(R.drawable.gmail)),
        QrLogo("google", ImageVector.vectorResource(R.drawable.google)),
        QrLogo("instagram", ImageVector.vectorResource(R.drawable.instagram)),
        QrLogo("linkedin", ImageVector.vectorResource(R.drawable.linkedin)),
        QrLogo("medium", ImageVector.vectorResource(R.drawable.medium)),
        QrLogo("messenger", ImageVector.vectorResource(R.drawable.messenger)),
        QrLogo("microsoft", ImageVector.vectorResource(R.drawable.microsoft)),
        QrLogo("netflix", ImageVector.vectorResource(R.drawable.netflix)),
        QrLogo("notion", ImageVector.vectorResource(R.drawable.notion)),
        QrLogo("patreon", ImageVector.vectorResource(R.drawable.patreon)),
        QrLogo("pintrest", ImageVector.vectorResource(R.drawable.pintrest)),
        QrLogo("play", ImageVector.vectorResource(R.drawable.play)),
        QrLogo("reddit", ImageVector.vectorResource(R.drawable.reddit)),
        QrLogo("share", ImageVector.vectorResource(R.drawable.share)),
        QrLogo("sketch", ImageVector.vectorResource(R.drawable.sketch)),
        QrLogo("slack", ImageVector.vectorResource(R.drawable.slack)),
        QrLogo("snapchat", ImageVector.vectorResource(R.drawable.snapchat)),
        QrLogo("soundcloud", ImageVector.vectorResource(R.drawable.soundcloud)),
        QrLogo("spotify", ImageVector.vectorResource(R.drawable.spotify)),
        QrLogo("stackoverflow", ImageVector.vectorResource(R.drawable.stackoverflow)),
        QrLogo("telegram", ImageVector.vectorResource(R.drawable.telegram)),
        QrLogo("trello", ImageVector.vectorResource(R.drawable.trello)),
        QrLogo("tumblr", ImageVector.vectorResource(R.drawable.tumblr)),
        QrLogo("twitch", ImageVector.vectorResource(R.drawable.twitch)),
        QrLogo("twitter", ImageVector.vectorResource(R.drawable.twitter)),
        QrLogo("whatsapp", ImageVector.vectorResource(R.drawable.whatsapp)),
        QrLogo("wifi", ImageVector.vectorResource(R.drawable.wifi)),
        QrLogo("wikipedia", ImageVector.vectorResource(R.drawable.wikipedia)),
        QrLogo("yahoo", ImageVector.vectorResource(R.drawable.yahoo)),
        QrLogo("youtube", ImageVector.vectorResource(R.drawable.youtube)),
    )
    return remember(logos) { logos }
}