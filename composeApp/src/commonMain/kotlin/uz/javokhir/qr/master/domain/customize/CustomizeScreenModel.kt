package uz.javokhir.qr.master.domain.customize

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.data.model.mode.QRCornerMode
import uz.javokhir.qr.master.data.model.mode.QRDotMode
import uz.javokhir.qr.master.data.model.mode.QRPatternMode
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class CustomizeScreenModel :
    BaseScreenModel<CustomizeState, CustomizeEvent>(CustomizeState()) {

    init {
        fetchCustomizations()
    }

    override fun onEvent(event: CustomizeEvent) {
        when (event) {
            is CustomizeEvent.Customize -> customize(event.state)
            is CustomizeEvent.SelectPattern -> selectPattern(event.pattern)
            is CustomizeEvent.SelectCorner -> selectCorner(event.corner)
            is CustomizeEvent.SelectDot -> selectDot(event.dot)
            is CustomizeEvent.SelectColor -> selectColor(event.hex.uppercase())
            is CustomizeEvent.SelectLogo -> selectLogo(event.logo)
            is CustomizeEvent.ShowColorPicker -> showColorPicker(event.colorPickerType)
            CustomizeEvent.DismissColorPicker -> dismissColorPicker()
            is CustomizeEvent.ShowHidePreview -> showHidePreview(event.show)
        }
    }

    private fun fetchCustomizations() {
        val patterns = QRPatternMode.entries
        val corners = QRCornerMode.entries
        val dots = QRDotMode.entries

        stateData.update {
            it.copy(
                patterns = patterns,
                corners = corners,
                dots = dots,
            )
        }
    }

    private fun customize(state: CustomizeState) {
        stateData.update {
            it.copy(
                selectedPattern = state.selectedPattern,
                selectedCorner = state.selectedCorner,
                selectedDot = state.selectedDot,
                patternDotHex = state.patternDotHex,
                patternBackgroundHex = state.patternBackgroundHex,
                frameHex = state.frameHex,
                frameDotHex = state.frameDotHex,
                selectedLogo = state.selectedLogo,
            )
        }
    }

    private fun selectPattern(pattern: QRPatternMode) {
        stateData.update { it.copy(selectedPattern = pattern) }
    }

    private fun selectCorner(corner: QRCornerMode) {
        stateData.update { it.copy(selectedCorner = corner) }
    }

    private fun selectDot(dot: QRDotMode) {
        stateData.update { it.copy(selectedDot = dot) }
    }

    private fun selectColor(hex: String) {
        stateData.update {
            when (it.colorPickerType) {
                ColorPickerType.PatternDotColor -> {
                    it.copy(
                        showColorPicker = false,
                        patternDotHex = hex
                    )
                }

                ColorPickerType.PatternBackgroundColor -> {
                    it.copy(
                        showColorPicker = false,
                        patternBackgroundHex = hex
                    )
                }

                ColorPickerType.FrameColor -> {
                    it.copy(
                        showColorPicker = false,
                        frameHex = hex
                    )
                }

                ColorPickerType.FrameDotColor -> {
                    it.copy(
                        showColorPicker = false,
                        frameDotHex = hex
                    )
                }
            }
        }
    }

    private fun selectLogo(logo: String) {
        stateData.update {
            it.copy(
                selectedLogo = if (logo == it.selectedLogo) "" else logo
            )
        }
    }

    private fun showColorPicker(colorPickerType: ColorPickerType) {
        stateData.update {
            it.copy(
                showColorPicker = true,
                colorPickerType = colorPickerType
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