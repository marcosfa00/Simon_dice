package com.marcos.juego_simondce

import android.os.Bundle
import android.provider.Contacts
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.marcos.juego_simondce.ui.theme.Greeting
import com.marcos.juego_simondce.ui.theme.Juego_simonDceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Juego_simonDceTheme {
                // A surface container using the 'background' color from the theme
                Surface() {
                        //creo un objeto de tipo VM
                        val miModel : VM = VM()
                        //llamo al greeting de la clase UI
                        Greeting(miModel)

                }
            }
        }
    }


}

