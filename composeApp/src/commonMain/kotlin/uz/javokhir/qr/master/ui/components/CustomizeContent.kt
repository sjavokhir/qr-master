package uz.javokhir.qr.master.ui.components

//@Composable
//fun CustomizeContent(
//    customize: QRCustomizeModel,
//    onNavigate: (Direction) -> Unit
//) {
//    val strings = LocalStrings.current
//
//    Box(
//        modifier = Modifier.fillMaxWidth(),
//        contentAlignment = Alignment.TopEnd
//    ) {
//        Row(
//            modifier = Modifier
//                .clip(MaterialTheme.shapes.medium)
//                .border(
//                    width = 1.dp,
//                    color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
//                    shape = MaterialTheme.shapes.medium
//                )
//                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f))
//                .clickableSingle {
//                    if (hasSubscription) {
//                        onNavigate(CustomizeScreenDestination(customize))
//                    } else {
//                        onNavigate(PremiumScreenDestination)
//                    }
//                }
//                .padding(
//                    horizontal = 14.dp,
//                    vertical = 10.dp
//                ),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.spacedBy(16.dp)
//        ) {
//            AppIcon(
//                painter = painterResource(id = R.drawable.ic_customize),
//                color = MaterialTheme.colorScheme.primary
//            )
//
//            Text(
//                text = strings.customize,
//                style = MaterialTheme.typography.titleMedium,
//                fontSize = 17.sp,
//                fontWeight = FontWeight.SemiBold,
//                color = MaterialTheme.colorScheme.primary
//            )
//
//            if (!hasSubscription) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_subscription),
//                    contentDescription = null
//                )
//            }
//        }
//    }
//}