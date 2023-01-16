package uk.co.antmobileapps.gmailclone.components
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GmailFab(scrollState: ScrollState) {

    if (scrollState.value > 100) {
        ExtendedFloatingActionButton(
            text = {
                   Text(text = "Compose", fontSize = 16.sp, modifier = Modifier.padding(start = 16.dp))},
             onClick = { /*TODO*/ },
            icon =  {
                Icon(imageVector = Icons.Default.Edit, "")
            },


            backgroundColor = MaterialTheme.colors.surface,

        )
    }

    FloatingActionButton(onClick = { /*TODO*/ },
    backgroundColor = MaterialTheme.colors.surface,
    ) {
        Icon(imageVector = Icons.Default.Edit, "")
    }

}

