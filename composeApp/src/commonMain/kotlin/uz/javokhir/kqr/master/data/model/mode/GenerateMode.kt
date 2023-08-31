package uz.javokhir.kqr.master.data.model.mode

import uz.javokhir.kqr.master.ui.localization.AppStrings

enum class GenerateMode(
    val title: String,
    val icon: String,
    val header: GenerateHeader,
) {
    Text(AppStrings.text, "ic_qr_text", GenerateHeader.Web),
    Website(AppStrings.website, "ic_qr_website", GenerateHeader.Web),
    Sms(AppStrings.sms, "ic_qr_sms", GenerateHeader.Communication),
    PhoneNumber(AppStrings.phoneNumber, "ic_qr_phone", GenerateHeader.Communication),
    EmailAddress(AppStrings.emailAddress, "ic_qr_email", GenerateHeader.Communication),
    Wifi(AppStrings.wifi, "ic_qr_wifi", GenerateHeader.Other),
    ContactVCard(AppStrings.contactVCard, "ic_qr_contact", GenerateHeader.Other),
    CalendarEvent(AppStrings.calendarEvent, "ic_qr_event", GenerateHeader.Other),
    BizCard(AppStrings.bizCard, "ic_qr_biz", GenerateHeader.Other),
    BusinessVCard(AppStrings.businessVCard, "ic_qr_business", GenerateHeader.Other),
    Location(AppStrings.location, "ic_qr_location", GenerateHeader.Other),
    Youtube(AppStrings.youtube, "ic_qr_youtube", GenerateHeader.SocialMedia),
    WhatsApp(AppStrings.whatsApp, "ic_qr_whatsapp", GenerateHeader.SocialMedia),
    Instagram(AppStrings.instagram, "ic_qr_instagram", GenerateHeader.SocialMedia),
    Facebook(AppStrings.facebook, "ic_qr_facebook", GenerateHeader.SocialMedia),
    Twitter(AppStrings.twitter, "ic_qr_twitter", GenerateHeader.SocialMedia),
    TikTok(AppStrings.tiktok, "ic_qr_tiktok", GenerateHeader.SocialMedia),
    Telegram(AppStrings.telegram, "ic_qr_telegram", GenerateHeader.SocialMedia),
    VKontakte(AppStrings.vkontakte, "ic_qr_vkontakte", GenerateHeader.SocialMedia),
    Twitch(AppStrings.twitch, "ic_qr_twitch", GenerateHeader.SocialMedia),
    LinkedIn(AppStrings.linkedin, "ic_qr_linkedin", GenerateHeader.SocialMedia),
    Github(AppStrings.github, "ic_qr_github", GenerateHeader.SocialMedia),
    Medium(AppStrings.medium, "ic_qr_medium", GenerateHeader.SocialMedia),
    Dribbble(AppStrings.dribbble, "ic_qr_dribbble", GenerateHeader.SocialMedia),
    Behance(AppStrings.behance, "ic_qr_behance", GenerateHeader.SocialMedia),
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