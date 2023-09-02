package uz.javokhir.qr.master.shared.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.UIKitView
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.useContents
import platform.CoreLocation.CLLocation
import platform.CoreLocation.CLLocationCoordinate2DMake
import platform.CoreLocation.CLLocationManager
import platform.CoreLocation.kCLLocationAccuracyBest
import platform.MapKit.MKCoordinateRegionMakeWithDistance
import platform.MapKit.MKMapView
import uz.javokhir.qr.master.data.model.common.GeoPosition

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun MapView(
    modifier: Modifier,
    onMovePosition: (GeoPosition) -> Unit,
) {
    val locationManager = remember {
        CLLocationManager().apply {
            desiredAccuracy = kCLLocationAccuracyBest
            requestWhenInUseAuthorization()
        }
    }
    val location = remember(locationManager.location) {
        val position = locationManager.location?.toGeo() ?: GeoPosition()
        onMovePosition(position)
        CLLocationCoordinate2DMake(position.latitude, position.longitude)
    }
    val mkMapView = remember {
        MKMapView().apply {
            setShowsCompass(true)
            setShowsUserLocation(true)
            setRotateEnabled(true)
        }
    }

    UIKitView(
        modifier = modifier.fillMaxSize(),
        factory = {
            mkMapView
        },
        update = {
            mkMapView.setRegion(
                MKCoordinateRegionMakeWithDistance(
                    centerCoordinate = location,
                    latitudinalMeters = 1_000.0,
                    longitudinalMeters = 1_000.0
                ),
                animated = true
            )
        }
    )
}

@OptIn(ExperimentalForeignApi::class)
private fun CLLocation.toGeo() =
    GeoPosition(
        latitude = coordinate.useContents { latitude },
        longitude = coordinate.useContents { longitude }
    )