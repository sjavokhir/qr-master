package uz.javokhir.qr.master.data.utils

sealed class UiState<out T> where T : Any? {
    data class Success<T>(val data: T? = null) : UiState<T>()
    data class Failure(val message: String) : UiState<Nothing>()

    companion object {
        fun <T> success(data: T? = null): Success<T> = Success(data)

        fun failure(message: String) = Failure(message)
    }
}

infix fun <T> UiState<T>.onSuccess(onSuccess: UiState.Success<T>.() -> Unit): UiState<T> {
    return when (this) {
        is UiState.Success -> {
            onSuccess(this)
            this
        }

        else -> this
    }
}

infix fun <T> UiState<T>.onFailure(onFailure: UiState.Failure.() -> Unit): UiState<T> {
    return when (this) {
        is UiState.Failure -> {
            onFailure(this)
            this
        }

        else -> this
    }
}