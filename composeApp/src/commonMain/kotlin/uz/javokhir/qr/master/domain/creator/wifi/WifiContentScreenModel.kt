package uz.javokhir.qr.master.domain.creator.wifi

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class WifiContentScreenModel :
    BaseScreenModel<WifiContentState, WifiContentEvent>(WifiContentState()) {

    override fun onEvent(event: WifiContentEvent) {
        when (event) {
            is WifiContentEvent.Encoded -> onEncoded(event.value)
            is WifiContentEvent.NetworkNameChanged -> onValueChanged(networkName = event.name)
            is WifiContentEvent.PasswordChanged -> onValueChanged(password = event.password)
            is WifiContentEvent.SelectAuthentication -> onValueChanged(authentication = event.authentication)
            is WifiContentEvent.HiddenChecked -> onValueChanged(hidden = event.hidden)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        val content = value.toWifiContent() ?: return

        onValueChanged(
            networkName = content.networkName,
            password = content.password,
            authentication = content.authentication,
            hidden = content.hidden
        )
    }

    private fun onValueChanged(
        networkName: String? = null,
        password: String? = null,
        authentication: WifiContentState.Authentication? = null,
        hidden: Boolean? = null,
    ) {
        stateData.update {
            val mNetworkName = networkName ?: it.networkName
            val mPassword = password ?: it.password

            it.copy(
                networkName = mNetworkName,
                password = mPassword,
                authentication = authentication ?: it.authentication,
                hidden = hidden ?: it.hidden,
                enabled = when (authentication ?: it.authentication) {
                    WifiContentState.Authentication.WEP -> {
                        mNetworkName.isNotEmpty() && mPassword.isNotEmpty()
                    }

                    WifiContentState.Authentication.WPA_WPA2 -> {
                        mNetworkName.isNotEmpty() && mPassword.length >= 8
                    }

                    WifiContentState.Authentication.OPEN -> {
                        mNetworkName.isNotEmpty()
                    }
                },
                setEncoded = true
            )
        }
    }
}