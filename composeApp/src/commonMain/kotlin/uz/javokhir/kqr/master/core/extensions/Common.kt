package uz.javokhir.kqr.master.core.extensions

fun Int.az(): String = if (this >= 10) "" + this else "0$this"

fun Double.roundLast5(): Double {
    val scale = 100000.0 // 10^5
    return kotlin.math.round(this * scale) / scale
}