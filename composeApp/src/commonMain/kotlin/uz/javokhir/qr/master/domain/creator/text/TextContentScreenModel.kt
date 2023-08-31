package uz.javokhir.qr.master.domain.creator.text

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class TextContentScreenModel :
    BaseScreenModel<TextContentState, TextContentEvent>(TextContentState()) {

    override fun onEvent(event: TextContentEvent) {
        when (event) {
            is TextContentEvent.Encoded -> onEncoded(event.value)
            is TextContentEvent.TextChanged -> onTextChanged(event.text)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        onTextChanged(value)
    }

    private fun onTextChanged(text: String) {
        stateData.update {
            it.copy(
                text = text,
                enabled = text.isNotEmpty(),
                setEncoded = true,
            )
        }
    }
}