package uz.javokhir.qr.master.data.model.mode

import androidx.compose.ui.graphics.vector.ImageVector
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

enum class GenerateMode(
    val title: String,
    val icon: ImageVector,
    val header: GenerateHeader,
) {
    Text(AppStrings.text, AppIcons.qrText, GenerateHeader.Web),
    Website(AppStrings.website, AppIcons.qrWebsite, GenerateHeader.Web),
    Sms(AppStrings.sms, AppIcons.qrSms, GenerateHeader.Communication),
    PhoneNumber(AppStrings.phoneNumber, AppIcons.qrPhone, GenerateHeader.Communication),
    EmailAddress(AppStrings.emailAddress, AppIcons.qrEmail, GenerateHeader.Communication),
    Wifi(AppStrings.wifi, AppIcons.qrWifi, GenerateHeader.Other),
    ContactVCard(AppStrings.contactVCard, AppIcons.qrContact, GenerateHeader.Other),
    CalendarEvent(AppStrings.calendarEvent, AppIcons.qrEvent, GenerateHeader.Other),
    BizCard(AppStrings.bizCard, AppIcons.qrContact, GenerateHeader.Other),
    BusinessVCard(AppStrings.businessVCard, AppIcons.qrBusiness, GenerateHeader.Other),
    Location(AppStrings.location, AppIcons.qrLocation, GenerateHeader.Other),
    Youtube(AppStrings.youtube, AppIcons.qrYoutube, GenerateHeader.SocialMedia),
    WhatsApp(AppStrings.whatsApp, AppIcons.qrWhatsapp, GenerateHeader.SocialMedia),
    Instagram(AppStrings.instagram, AppIcons.qrInstagram, GenerateHeader.SocialMedia),
    Facebook(AppStrings.facebook, AppIcons.qrFacebook, GenerateHeader.SocialMedia),
    Twitter(AppStrings.twitter, AppIcons.qrTwitter, GenerateHeader.SocialMedia),
    TikTok(AppStrings.tiktok, AppIcons.qrTiktok, GenerateHeader.SocialMedia),
    Telegram(AppStrings.telegram, AppIcons.qrTelegram, GenerateHeader.SocialMedia),
    VKontakte(AppStrings.vkontakte, AppIcons.qrVkontakte, GenerateHeader.SocialMedia),
    Twitch(AppStrings.twitch, AppIcons.qrTwitch, GenerateHeader.SocialMedia),
    LinkedIn(AppStrings.linkedin, AppIcons.qrLinkedin, GenerateHeader.SocialMedia),
    Github(AppStrings.github, AppIcons.qrGithub, GenerateHeader.SocialMedia),
    Medium(AppStrings.medium, AppIcons.qrMedium, GenerateHeader.SocialMedia),
    Dribbble(AppStrings.dribbble, AppIcons.qrDribble, GenerateHeader.SocialMedia),
    Behance(AppStrings.behance, AppIcons.qrBehance, GenerateHeader.SocialMedia),
}

enum class GenerateHeader {
    Web,
    Communication,
    SocialMedia,
    Other
}

fun Long.toGenerateMode(): GenerateMode {
    return GenerateMode.entries
        .firstOrNull { it.ordinal.toLong() == this } ?: GenerateMode.Text
}