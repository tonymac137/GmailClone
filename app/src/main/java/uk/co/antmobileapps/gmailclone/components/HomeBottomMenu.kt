package uk.co.antmobileapps.gmailclone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import uk.co.antmobileapps.gmailclone.model.BottonMenuData

@Composable
fun HomeBottomMenu() {
    val items = listOf(
        BottonMenuData.Mail,
        BottonMenuData.Meet
    )

    BottomNavigation(backgroundColor = Color.White, contentColor =  Color.Black) {
        items.forEach {
            BottomNavigationItem(
                label = {Text(text = it.title)},
                alwaysShowLabel = true,
                selected = false,
                onClick = {/*TODO*/},
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) }

                )
        }
    }
}
