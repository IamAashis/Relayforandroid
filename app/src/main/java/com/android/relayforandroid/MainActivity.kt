package com.android.relayforandroid

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.relayforandroid.button.Button
import com.android.relayforandroid.newbutton.NewButton
import com.android.relayforandroid.testbutton.TestButton
import com.android.relayforandroid.ui.theme.RelayForAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RelayForAndroidTheme {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Button(text = "Hello World", modifier = Modifier.fillMaxWidth(), onClick = {
                        Toast.makeText(this@MainActivity, "Hello world", Toast.LENGTH_SHORT)
                            .show()
                    }, picture = {
                        Icon(imageVector = Icons.Default.Check, contentDescription = null)
                    })
                    Spacer(modifier = Modifier.height(16.dp))
                    NewButton(text = "Hello World", modifier = Modifier.fillMaxWidth(), onClick = {
                        Toast.makeText(this@MainActivity, "Hello world", Toast.LENGTH_SHORT)
                            .show()
                    }, icon = {
                        Icon(imageVector = Icons.Default.Check, contentDescription = null)
                    })
                    TestButton(text = "Hello World", modifier = Modifier.fillMaxWidth())
                }
            }
        }
    }
}

