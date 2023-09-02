package uz.javokhir.qr.master.screens.qrCode

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.base.UiEvent
import uz.javokhir.qr.master.domain.qrCode.QrCodeEvent
import uz.javokhir.qr.master.domain.qrCode.QrCodeScreenModel
import uz.javokhir.qr.master.screens.base.BaseScreenWrapper
import uz.javokhir.qr.master.screens.creator.addContent.AddContentScreen
import uz.javokhir.qr.master.screens.customize.CustomizeScreen

data class QrCodeScreen(
    val id: String,
    val dateTime: String,
    val scanned: Boolean,
    val generateMode: GenerateMode,
    val encoded: String,
    val decoded: String,
    val customize: QrCustomizeModel,
    val editable: Boolean,
    val deletable: Boolean,
) : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { QrCodeScreenModel() }
        val state by screenModel.state.collectAsState()

        val coroutineScope = rememberCoroutineScope()

        var customizeModel by rememberSaveable { mutableStateOf(customize) }
        var encodedContent by rememberSaveable { mutableStateOf(encoded) }
        var decodedContent by rememberSaveable { mutableStateOf(decoded) }

        if (!editable) {
            LaunchedEffect(id, encoded, state.saved) {
                if (!state.saved) {
                    screenModel.onEvent(
                        QrCodeEvent.Insert(
                            id = id,
                            scanned = scanned,
                            mode = generateMode,
                            encoded = encodedContent,
                            decoded = decodedContent,
                            customize = customizeModel
                        )
                    )
                }
            }
        }

        BaseScreenWrapper(screenModel) {
            QrDetailContent(
                dateTime = dateTime,
                generateMode = generateMode,
                encoded = encodedContent,
                decoded = decodedContent,
                customize = customizeModel,
                editable = editable,
                deletable = deletable,
                chromeCustomTabsEnabled = state.chromeCustomTabsEnabled,
                onCustomize = { customize ->
                    screenModel.sendEvent(
                        UiEvent.Navigate(
                            CustomizeScreen(customize) {
                                customizeModel = it

                                screenModel.onEvent(
                                    QrCodeEvent.Insert(
                                        id = id,
                                        scanned = scanned,
                                        mode = generateMode,
                                        encoded = encodedContent,
                                        decoded = decodedContent,
                                        customize = it
                                    )
                                )
                            }
                        )
                    )
                },
                onEdit = {
                    screenModel.sendEvent(
                        UiEvent.Navigate(
                            AddContentScreen(
                                id = id,
                                generateMode = generateMode,
                                encoded = encodedContent,
                                editable = editable,
                                onEditContent = {
                                    encodedContent = it.encoded
                                    decodedContent = it.decoded

                                    screenModel.onEvent(
                                        QrCodeEvent.Insert(
                                            id = id,
                                            scanned = scanned,
                                            mode = generateMode,
                                            encoded = encodedContent,
                                            decoded = decodedContent,
                                            customize = customizeModel
                                        )
                                    )
                                }
                            )
                        )
                    )
                },
                onDelete = {
                    screenModel.onEvent(QrCodeEvent.Delete(id))

                    coroutineScope.launch {
                        delay(100L)
                        screenModel.sendEvent(UiEvent.NavigateUp)
                    }
                }
            )
        }
    }
}