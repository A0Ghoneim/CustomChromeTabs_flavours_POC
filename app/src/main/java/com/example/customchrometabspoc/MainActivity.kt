package com.example.customchrometabspoc

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.customchrometabspoc.ui.theme.CustomChromeTabsPOCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomChromeTabsPOCTheme {
                    TheScreen()
                }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MockLoginPreview() {
    TheScreen()
}
@Composable
fun TheScreen(){
    var textState : MutableState<String> = remember{ mutableStateOf("take me there") }
    var viewModel =  LoginViewModel()
    var context: Context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center){
        Button(onClick = { viewModel.openSignUpUrl(context) },Modifier.width(100.dp).height(50.dp).align(
            Alignment.CenterHorizontally)) {
            Text(text = textState.value)
        }
    }
}
