package uz.javokhir.qr.master.screens.pickerColor.picker

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.screens.pickerColor.data.ColorRange
import uz.javokhir.qr.master.screens.pickerColor.data.Colors
import uz.javokhir.qr.master.screens.pickerColor.extensions.blue
import uz.javokhir.qr.master.screens.pickerColor.extensions.green
import uz.javokhir.qr.master.screens.pickerColor.extensions.moveColorTo
import uz.javokhir.qr.master.screens.pickerColor.extensions.red
import uz.javokhir.qr.master.screens.pickerColor.helpers.ColorPickerHelper
import kotlin.math.roundToInt

@Composable
fun ColorPicker(
    modifier: Modifier = Modifier,
    darkMode: Boolean,
    showBrightnessBar: Boolean = true,
    showAlphaBar: Boolean = false,
    onPickedColor: (Color) -> Unit
) {
    var brightness by remember { mutableFloatStateOf(0f) }
    var alpha by remember { mutableFloatStateOf(1f) }
    var rangeColor by remember {
        mutableStateOf(if (darkMode) Color.White else Color.Black)
    }
    var color by remember {
        mutableStateOf(if (darkMode) Color.White else Color.Black)
    }

    LaunchedEffect(rangeColor, alpha, brightness) {
        color = Color(
            rangeColor.red().moveColorTo(darkMode, brightness),
            rangeColor.green().moveColorTo(darkMode, brightness),
            rangeColor.blue().moveColorTo(darkMode, brightness),
            alpha = (255 * alpha).roundToInt()
        )
    }

    LaunchedEffect(color) {
        onPickedColor(color)
    }

    Box(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            ColorSlideBar(colors = Colors.gradientColors) {
                val (rangeProgress, range) = ColorPickerHelper.calculateRangeProgress(it.toDouble())
                val red: Int
                val green: Int
                val blue: Int

                when (range) {
                    ColorRange.RedToYellow -> {
                        red = 255
                        green = (255 * rangeProgress).roundToInt()
                        blue = 0
                    }

                    ColorRange.YellowToGreen -> {
                        red = (255 * (1 - rangeProgress)).roundToInt()
                        green = 255
                        blue = 0
                    }

                    ColorRange.GreenToCyan -> {
                        red = 0
                        green = 255
                        blue = (255 * rangeProgress).roundToInt()
                    }

                    ColorRange.CyanToBlue -> {
                        red = 0
                        green = (255 * (1 - rangeProgress)).roundToInt()
                        blue = 255
                    }

                    ColorRange.BlueToPurple -> {
                        red = (255 * rangeProgress).roundToInt()
                        green = 0
                        blue = 255
                    }

                    ColorRange.PurpleToRed -> {
                        red = 255
                        green = 0
                        blue = (255 * (1 - rangeProgress)).roundToInt()
                    }
                }
                rangeColor = Color(red, green, blue)
            }

            if (showBrightnessBar) {
                Spacer(Modifier.height(20.dp))

                ColorSlideBar(
                    colors = listOf(
                        if (darkMode) Color.White else Color.Black,
                        rangeColor
                    )
                ) {
                    brightness = 1 - it
                }
            }

            if (showAlphaBar) {
                Spacer(Modifier.height(20.dp))

                ColorSlideBar(
                    colors = listOf(Color.Transparent, rangeColor)
                ) {
                    alpha = it
                }
            }
        }
    }
}