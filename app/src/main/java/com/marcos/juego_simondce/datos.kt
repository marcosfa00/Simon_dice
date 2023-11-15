package com.marcos.juego_simondce

import androidx.compose.ui.graphics.Color

// Esta calse es un object, como si fuera un singleton
object datos {
    var ronda = 0;
    var secuencia = mutableListOf<Int>();
    var secuenciaUsuario = mutableListOf<Int>();
    var record = 0;
    var estado = Estado.INICIO;

}
    /**
     * Enum que representa los estados del juego
     */
    enum class Estado {
        INICIO, SECUENCIA, ESPERANDO, ENTRADA, COMPROBANDO, FINALIZADO
    }

/**
 * Enum para los colores del juego
 */
enum class Colores(val color: Color) {
    ROJO(color = Color.Red),
    VERDE(color = Color.Green),
    AZUL(color = Color.Cyan),
    AMARILLO(color = Color.Yellow)
}

