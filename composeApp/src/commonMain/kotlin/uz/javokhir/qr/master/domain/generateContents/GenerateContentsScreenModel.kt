package uz.javokhir.qr.master.domain.generateContents

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class GenerateContentsScreenModel :
    BaseScreenModel<GenerateContentsState, GenerateContentEvent>(GenerateContentsState()) {

    init {
        fetchGenerateContents()
    }

    override fun onEvent(event: GenerateContentEvent) {
    }

    private fun fetchGenerateContents() {
        val contents = GenerateMode.entries.groupBy { it.header }

        stateData.update { it.copy(contents = contents) }
    }
}