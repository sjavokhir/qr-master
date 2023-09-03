package uz.javokhir.qr.master.shared.ui

import androidx.compose.runtime.Composable
import uz.javokhir.qr.master.data.model.common.QrLogo

@Composable
expect fun rememberQrLogos(): List<QrLogo>