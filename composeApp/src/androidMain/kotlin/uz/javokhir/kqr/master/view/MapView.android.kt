package uz.javokhir.kqr.master.view

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.google.android.gms.location.CurrentLocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.rememberCameraPositionState
import uz.javokhir.kqr.master.data.model.common.GeoPosition

@OptIn(ExperimentalPermissionsApi::class)
@Composable
actual fun MapView(
    modifier: Modifier,
    currentPosition: MutableState<GeoPosition>,
) {
    val context = LocalContext.current
    val cameraPermissionState = rememberMultiplePermissionsState(
        listOf(
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION
        )
    )
    var currentLocation by remember { mutableStateOf(GeoPosition()) }

    if (cameraPermissionState.allPermissionsGranted) {
        getLocation(context) { location ->
            currentLocation = location
        }

        MapViewWithGrantedPermission(
            modifier = modifier,
            currentLocation = currentLocation,
            currentPosition = currentPosition
        )
    } else {
        LaunchedEffect(Unit) {
            cameraPermissionState.launchMultiplePermissionRequest()
        }
    }
}

@Composable
private fun MapViewWithGrantedPermission(
    modifier: Modifier,
    currentLocation: GeoPosition,
    currentPosition: MutableState<GeoPosition>,
) {
    val cameraPositionState = rememberCameraPositionState()

    LaunchedEffect(currentLocation) {
        cameraPositionState.position = CameraPosition.fromLatLngZoom(
            LatLng(currentLocation.latitude, currentLocation.longitude),
            16f
        )
    }

    LaunchedEffect(cameraPositionState.position to cameraPositionState.isMoving) {
        if (!cameraPositionState.isMoving) {
            currentPosition.value = GeoPosition(
                latitude = cameraPositionState.position.target.latitude,
                longitude = cameraPositionState.position.target.longitude,
            )
        }
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        GoogleMap(
            modifier = modifier.fillMaxSize(),
            properties = MapProperties(
                isMyLocationEnabled = true,
                mapType = MapType.NORMAL,
                mapStyleOptions = MapStyleOptions(DARK_MODE_MAP)
            ),
            cameraPositionState = cameraPositionState
        )
    }
}

@SuppressLint("MissingPermission")
private fun getLocation(
    context: Context,
    onLocationReceived: (GeoPosition) -> Unit,
) {
    LocationServices.getFusedLocationProviderClient(context)
        .getCurrentLocation(CurrentLocationRequest.Builder().build(), null)
        .apply {
            addOnSuccessListener {
                onLocationReceived(GeoPosition(it.latitude, it.longitude))
            }
            addOnFailureListener {
                onLocationReceived(GeoPosition(0.0, 0.0))
            }
        }
}

private const val DARK_MODE_MAP = """[
  {
    "elementType": "geometry",
    "stylers": [
      {
        "color": "#242f3e"
      }
    ]
  },
  {
    "elementType": "labels.text.fill",
    "stylers": [
      {
        "color": "#746855"
      }
    ]
  },
  {
    "elementType": "labels.text.stroke",
    "stylers": [
      {
        "color": "#242f3e"
      }
    ]
  },
  {
    "featureType": "administrative.locality",
    "elementType": "labels.text.fill",
    "stylers": [
      {
        "color": "#d59563"
      }
    ]
  },
  {
    "featureType": "poi",
    "elementType": "labels.text.fill",
    "stylers": [
      {
        "color": "#d59563"
      }
    ]
  },
  {
    "featureType": "poi.park",
    "elementType": "geometry",
    "stylers": [
      {
        "color": "#263c3f"
      }
    ]
  },
  {
    "featureType": "poi.park",
    "elementType": "labels.text.fill",
    "stylers": [
      {
        "color": "#6b9a76"
      }
    ]
  },
  {
    "featureType": "road",
    "elementType": "geometry",
    "stylers": [
      {
        "color": "#38414e"
      }
    ]
  },
  {
    "featureType": "road",
    "elementType": "geometry.stroke",
    "stylers": [
      {
        "color": "#212a37"
      }
    ]
  },
  {
    "featureType": "road",
    "elementType": "labels.text.fill",
    "stylers": [
      {
        "color": "#9ca5b3"
      }
    ]
  },
  {
    "featureType": "road.highway",
    "elementType": "geometry",
    "stylers": [
      {
        "color": "#746855"
      }
    ]
  },
  {
    "featureType": "road.highway",
    "elementType": "geometry.stroke",
    "stylers": [
      {
        "color": "#1f2835"
      }
    ]
  },
  {
    "featureType": "road.highway",
    "elementType": "labels.text.fill",
    "stylers": [
      {
        "color": "#f3d19c"
      }
    ]
  },
  {
    "featureType": "transit",
    "elementType": "geometry",
    "stylers": [
      {
        "color": "#2f3948"
      }
    ]
  },
  {
    "featureType": "transit.station",
    "elementType": "labels.text.fill",
    "stylers": [
      {
        "color": "#d59563"
      }
    ]
  },
  {
    "featureType": "water",
    "elementType": "geometry",
    "stylers": [
      {
        "color": "#17263c"
      }
    ]
  },
  {
    "featureType": "water",
    "elementType": "labels.text.fill",
    "stylers": [
      {
        "color": "#515c6d"
      }
    ]
  },
  {
    "featureType": "water",
    "elementType": "labels.text.stroke",
    "stylers": [
      {
        "color": "#17263c"
      }
    ]
  }
]"""