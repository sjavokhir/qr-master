package uz.javokhir.qr.master.ui.components

//@Composable
//fun rememberQrDrawable(
//    content: String,
//    customize: QRCustomizeModel,
//    ownLogo: Drawable? = null
//): Drawable {
//    val context = LocalContext.current
//
//    val qrOptions = remember(content, customize, ownLogo) {
//        createQrVectorOptions {
//            padding = .12f
//
//            background {
//                color = QrVectorColor.Solid(Color.parseColor("#${customize.patternBackgroundHex}"))
//            }
//
//            if (customize.selectedLogo.isNotEmpty()) {
//                context.drawableId(customize.selectedLogo)?.let {
//                    logo {
//                        drawable = ContextCompat.getDrawable(context, it)
//                        size = .2f
//                        padding = QrVectorLogoPadding.Natural(.1f)
//                        shape = QrVectorLogoShape.Circle
//                    }
//                }
//            } else if (ownLogo != null) {
//                logo {
//                    drawable = ownLogo
//                    size = .2f
//                    padding = QrVectorLogoPadding.Natural(.1f)
//                    shape = QrVectorLogoShape.Default
//                }
//            }
//
//            colors {
//                dark = QrVectorColor.Solid(Color.parseColor("#${customize.patternDotHex}"))
//                frame = QrVectorColor.Solid(Color.parseColor("#${customize.frameHex}"))
//                ball = QrVectorColor.Solid(Color.parseColor("#${customize.frameDotHex}"))
//            }
//
//            shapes {
//                darkPixel = when (customize.selectedPattern) {
//                    QRPatternMode.Default -> QrVectorPixelShape.Default
//                    QRPatternMode.Rounded -> QrVectorPixelShape.RoundCorners(.25f)
//                    QRPatternMode.ExtraRounded -> QrVectorPixelShape.RoundCorners(.5f)
//                    QRPatternMode.Circle -> QrVectorPixelShape.Circle()
//                    QRPatternMode.CirclePadding -> QrVectorPixelShape.Circle(.85f)
//                    QRPatternMode.Horizontal -> QrVectorPixelShape.RoundCornersHorizontal()
//                    QRPatternMode.Vertical -> QrVectorPixelShape.RoundCornersVertical()
//                    QRPatternMode.Rhombus -> QrVectorPixelShape.Rhombus()
//                    QRPatternMode.Star -> QrVectorPixelShape.Star
//                    QRPatternMode.Classy -> QrVectorPixelShape.Classy(.25f)
//                    QRPatternMode.ClassyRounded -> QrVectorPixelShape.Classy(.5f)
//                }
//                frame = when (customize.selectedCorner) {
//                    QRCornerMode.Default -> QrVectorFrameShape.Default
//                    QRCornerMode.Rounded -> QrVectorFrameShape.RoundCorners(.25f)
//                    QRCornerMode.Circle -> QrVectorFrameShape.Circle()
//                    QRCornerMode.Two -> QrVectorFrameShape.RoundCorners(
//                        corner = .3f,
//                        topLeft = false,
//                        bottomRight = false
//                    )
//
//                    QRCornerMode.Three -> QrVectorFrameShape.RoundCorners(
//                        corner = .3f,
//                        bottomRight = false
//                    )
//
//                    QRCornerMode.Dots -> QrVectorFrameShape.AsPixelShape(
//                        QrVectorPixelShape.Circle()
//                    )
//
//                    QRCornerMode.DotsPadding -> QrVectorFrameShape.AsPixelShape(
//                        QrVectorPixelShape.Circle(.85f)
//                    )
//
//                    QRCornerMode.Rhombus -> QrVectorFrameShape.AsPixelShape(
//                        QrVectorPixelShape.Rhombus()
//                    )
//                }
//                ball = when (customize.selectedDot) {
//                    QRDotMode.Default -> QrVectorBallShape.Default
//                    QRDotMode.Rounded -> QrVectorBallShape.RoundCorners(.25f)
//                    QRDotMode.Circle -> QrVectorBallShape.Circle()
//                    QRDotMode.Rhombus -> QrVectorBallShape.Rhombus()
//                    QRDotMode.CornerTwo -> QrVectorBallShape.RoundCorners(
//                        radius = .25f,
//                        topLeft = false,
//                        bottomRight = false
//                    )
//
//                    QRDotMode.CornerThree -> QrVectorBallShape.RoundCorners(
//                        radius = .25f,
//                        bottomRight = false
//                    )
//
//                    QRDotMode.Dots -> QrVectorBallShape.AsPixelShape(
//                        QrVectorPixelShape.Circle()
//                    )
//
//                    QRDotMode.DotsPadding -> QrVectorBallShape.AsPixelShape(
//                        QrVectorPixelShape.Circle(.85f)
//                    )
//
//                    QRDotMode.Horizontal -> QrVectorBallShape.AsPixelShape(
//                        QrVectorPixelShape.RoundCornersHorizontal()
//                    )
//
//                    QRDotMode.Vertical -> QrVectorBallShape.AsPixelShape(
//                        QrVectorPixelShape.RoundCornersVertical()
//                    )
//                }
//            }
//        }
//    }
//
//    val qrDrawable by remember(content, customize, qrOptions) {
//        mutableStateOf(QrCodeDrawable(QrData.Text(content), qrOptions))
//    }
//
//    return qrDrawable
//}