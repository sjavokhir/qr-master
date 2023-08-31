package uz.javokhir.qr.master.domain.creator.wifi

sealed class WifiContentEvent {
    data class Encoded(val value: String) : WifiContentEvent()
    data class NetworkNameChanged(val name: String) : WifiContentEvent()
    data class PasswordChanged(val password: String) : WifiContentEvent()
    data class SelectAuthentication(
        val authentication: WifiContentState.Authentication
    ) : WifiContentEvent()

    data class HiddenChecked(val hidden: Boolean) : WifiContentEvent()
}
