package uz.javokhir.qr.master.domain.creator.website

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.core.extensions.isUrlValid
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class WebsiteContentScreenModel :
    BaseScreenModel<WebsiteContentState, WebsiteContentEvent>(WebsiteContentState()) {

    override fun onEvent(event: WebsiteContentEvent) {
        when (event) {
            is WebsiteContentEvent.Encoded -> onEncoded(event.value)
            is WebsiteContentEvent.WebsiteChanged -> onWebsiteChanged(event.website)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        onWebsiteChanged(value)
    }

    private fun onWebsiteChanged(website: String) {
        stateData.update {
            it.copy(
                website = website,
                enabled =  website.isUrlValid(),
                setEncoded = true
            )
        }
    }
}