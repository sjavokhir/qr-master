package uz.javokhir.qr.master.screens.pickerColor.extensions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import kotlin.math.roundToInt

/**
 * Returns an integer array for all color channels value.
 */
fun Color.argb(): Array<Int> {
    val argb = toArgb()
    val alpha = argb shr 24 and 0xff
    val red = argb shr 16 and 0xff
    val green = argb shr 8 and 0xff
    val blue = argb and 0xff
    return arrayOf(alpha, red, green, blue)
}

/**
 * Returns the red value as an integer.
 */
fun Color.red(): Int {
    return toArgb() shr 16 and 0xff
}

/**
 * Returns the green value as an integer.
 */
fun Color.green(): Int {
    return toArgb() shr 8 and 0xff
}

/**
 * Returns the blue value as an integer.
 */
fun Color.blue(): Int {
    return toArgb() and 0xff
}

/**
 * Returns the alpha value as an integer.
 */
fun Color.alpha(): Int {
    return toArgb() shr 24 and 0xff
}

fun Color.toHex(
    hexPrefix: Boolean = false,
    includeAlpha: Boolean = true,
): String {
    val (alpha, red, green, blue) = argb()
    return buildString {
        if (hexPrefix) {
            append("#")
        }
        if (includeAlpha) {
            append(alpha.toHex())
        }
        append(red.toHex())
        append(green.toHex())
        append(blue.toHex())
    }
}

fun Int.toHex() =
    if (this >= 16) this.toString(16)
    else "0${this.toString(16)}"

fun String.toColor(): Color {
    // Remove any leading '#' character if present
    val cleanedHex = if (startsWith("#")) substring(1) else this

    // Convert the cleaned hex string to a long value
    val colorValue = cleanedHex.toLong(radix = 16)

    // Create the Color object from the color value
    return Color(colorValue)
}

fun Int.lighten(lightness: Float): Int {
    return (this + (255 - this) * lightness).roundToInt()
}

fun Int.darken(darkness: Float): Int {
    return (this - this * darkness).roundToInt()
}

fun Int.moveColorTo(toWhite: Boolean, progress: Float): Int {
    return if (toWhite) {
        lighten(progress)
    } else {
        darken(progress)
    }
}