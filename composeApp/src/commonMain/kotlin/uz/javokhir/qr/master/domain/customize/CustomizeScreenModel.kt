package uz.javokhir.qr.master.domain.customize

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.data.model.common.QrLogo
import uz.javokhir.qr.master.data.model.mode.QrCornerMode
import uz.javokhir.qr.master.data.model.mode.QrDotMode
import uz.javokhir.qr.master.data.model.mode.QrPatternMode
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class CustomizeScreenModel :
    BaseScreenModel<CustomizeState, CustomizeEvent>(CustomizeState()) {

    init {
        fetchCustomizations()
    }

    override fun onEvent(event: CustomizeEvent) {
        when (event) {
            is CustomizeEvent.Customize -> customize(event.customize)
            is CustomizeEvent.SelectPattern -> selectPattern(event.pattern)
            is CustomizeEvent.SelectCorner -> selectCorner(event.corner)
            is CustomizeEvent.SelectDot -> selectDot(event.dot)
            is CustomizeEvent.SelectColor -> selectColor(event.hex.uppercase())
            is CustomizeEvent.SelectLogo -> selectLogo(event.logo)
            is CustomizeEvent.ShowColorPicker -> showColorPicker(event.mode)
            CustomizeEvent.DismissColorPicker -> dismissColorPicker()
            is CustomizeEvent.ShowHidePreview -> showHidePreview(event.show)
        }
    }

    private fun fetchCustomizations() {
        val patterns = QrPatternMode.entries
        val corners = QrCornerMode.entries
        val dots = QrDotMode.entries

        stateData.update {
            it.copy(
                patterns = patterns,
                corners = corners,
                dots = dots,
            )
        }
    }

    private fun customize(customize: QrCustomizeModel) {
        stateData.update {
            it.copy(
                selectedPattern = customize.selectedPattern,
                selectedCorner = customize.selectedCorner,
                selectedDot = customize.selectedDot,
                patternDotHex = customize.patternDotHex,
                patternBackgroundHex = customize.patternBackgroundHex,
                frameHex = customize.frameHex,
                frameDotHex = customize.frameDotHex,
                selectedLogo = customize.selectedLogo,
            )
        }
    }

    private fun selectPattern(pattern: QrPatternMode) {
        stateData.update { it.copy(selectedPattern = pattern) }
    }

    private fun selectCorner(corner: QrCornerMode) {
        stateData.update { it.copy(selectedCorner = corner) }
    }

    private fun selectDot(dot: QrDotMode) {
        stateData.update { it.copy(selectedDot = dot) }
    }

    private fun selectColor(hex: String) {
        stateData.update {
            when (it.colorPickerMode) {
                ColorPickerMode.PatternDotColor -> {
                    it.copy(
                        showColorPicker = false,
                        patternDotHex = hex
                    )
                }

                ColorPickerMode.PatternBackgroundColor -> {
                    it.copy(
                        showColorPicker = false,
                        patternBackgroundHex = hex
                    )
                }

                ColorPickerMode.FrameColor -> {
                    it.copy(
                        showColorPicker = false,
                        frameHex = hex
                    )
                }

                ColorPickerMode.FrameDotColor -> {
                    it.copy(
                        showColorPicker = false,
                        frameDotHex = hex
                    )
                }
            }
        }
    }

    private fun selectLogo(logo: QrLogo) {
        stateData.update {
            it.copy(
                selectedLogo = if (logo.name == it.selectedLogo) "" else logo.name
            )
        }
    }

    private fun showColorPicker(mode: ColorPickerMode) {
        stateData.update {
            it.copy(
                showColorPicker = true,
                colorPickerMode = mode
            )
        }
    }

    private fun dismissColorPicker() {
        stateData.update { it.copy(showColorPicker = false) }
    }

    private fun showHidePreview(show: Boolean) {
        stateData.update { it.copy(showPreview = show) }
    }
}