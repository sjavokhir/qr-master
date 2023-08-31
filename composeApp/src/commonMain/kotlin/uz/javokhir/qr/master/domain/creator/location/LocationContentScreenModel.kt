package uz.javokhir.qr.master.domain.creator.location

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.core.extensions.tryCatch
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class LocationContentScreenModel :
    BaseScreenModel<LocationContentState, LocationContentEvent>(LocationContentState()) {

    override fun onEvent(event: LocationContentEvent) {
        when (event) {
            is LocationContentEvent.Encoded -> onEncoded(event.value)
            is LocationContentEvent.LocationChanged -> onLocationChanged(event.location)

            is LocationContentEvent.LatitudeChanged -> onValueChanged(
                latitude = event.latitude
            )

            is LocationContentEvent.LongitudeChanged -> onValueChanged(
                longitude = event.longitude
            )
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        val content = value.toLocationContent() ?: return

        onValueChanged(content.latitude, content.longitude)
    }

    private fun onLocationChanged(location: String) {
        tryCatch {
            val (latitude, longitude) = location.split(",")

            onValueChanged(latitude, longitude)
        }
    }

    private fun onValueChanged(
        latitude: String? = null,
        longitude: String? = null,
    ) {
        stateData.update {
            val mLatitude = latitude ?: it.latitude
            val mLongitude = longitude ?: it.longitude

            it.copy(
                latitude = mLatitude,
                longitude = mLongitude,
                enabled = mLatitude.isNotEmpty() && mLongitude.isNotEmpty(),
                setEncoded = true
            )
        }
    }
}