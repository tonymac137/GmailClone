package uk.co.antmobileapps.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import uk.co.antmobileapps.gmailclone.R

@Composable
fun AccountsDialog(openDialog:MutableState<Boolean>) {
    Dialog(onDismissRequest = {openDialog.value = false}) {
        AccountsDialogUI()

    }
}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier){
    Card() {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)) {
            Row(modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "")
                }
                Image(painter = painterResource(id = R.drawable.google), ""
                    ,
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                )

            }
            
            Row(modifier.fillMaxWidth().padding(start = 16.dp)) {
                
            }
        }
        
    }
}

@Preview
@Composable
fun AccountsDialogUIPreview(){
    AccountsDialogUI()
}
