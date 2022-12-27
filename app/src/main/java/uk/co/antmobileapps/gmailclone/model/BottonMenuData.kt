package uk.co.antmobileapps.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottonMenuData (
    val icon: ImageVector,
    val title: String
) {
    object Mail: BottonMenuData(icon = Icons.Outlined.Mail, "Mail")
    object Meet: BottonMenuData(icon = Icons.Outlined.VideoCall, "Meet")

}
