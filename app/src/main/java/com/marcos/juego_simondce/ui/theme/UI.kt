package com.marcos.juego_simondce.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marcos.juego_simondce.Colores
import com.marcos.juego_simondce.VM


@Composable
fun Greeting(mimodel: VM) {
    Text(text = "Hello ${mimodel.generarNumeroAleatorio(10)}!")
    Botonera()

}

@Composable
fun Botonera(){
    Column {
        for (color in Colores.values()){
            Spacer(modifier =Modifier.height(8.dp))
            Boton(color)
        }
    }
}

@Composable
fun Boton(color: Colores){
   Spacer(modifier =Modifier.height(8.dp))
        //boton con texto de color dentro
        Button(
            colors = ButtonDefaults.buttonColors(color.color),
            onClick = { /*TODO*/ })

        {
            Text(
                //alinear el texto al centro del boton
                //poner la letra del texto en negrita text =color.color
                text = color.name,
                modifier = Modifier.weight(1f),
                color = Color.Black
            )
            //color del boton

        }



}