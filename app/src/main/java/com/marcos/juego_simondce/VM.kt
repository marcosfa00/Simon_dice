package com.marcos.juego_simondce

class VM {

    /**
     * FUNCION que genera un numero aleatorio entre 0 y un numero menor del máximo.
     * @param maximo: Número máximo que se puede generar
     * @return Int: Número aleatorio generado
     */
    fun generarNumeroAleatorio(maximo: Int): Int {
        return (0..maximo).random()
    }
    /**
     * inicializa el juego
     */
    /**
     * Inicializo el juego.
     */
    fun inicializarJuego() {
        reiniciarRonda()
        reiniciarSecuencia()
        reiniciarSecuenciaUsuario()
        datos.estado = Estado.INICIO
    }

    /**
     * Aumenta secuencia de colores.
     * Muestra al usuario el color.
     */

    fun estadoSecuencia() {
        datos.estado = Estado.SECUENCIA
        aumentarSecuencia()
        mostrarSecuencia()
        datos.estado = Estado.ESPERANDO
    }
    /**
     * Aumenta un color a la secuencia
     */
    fun aumentarSecuencia() {
        datos.estado = Estado.SECUENCIA
        datos.secuencia.add(generarNumeroAleatorio(4))
    }
    /**
     * Función que muestra la secuencia de colores.
     */
    private fun mostrarSecuencia() {
        TODO("Not yet implemented")
    }



    /**
     * Aumentar la secuencia del usuario.
     */
    fun aumentarSecuenciaUsuario(color: Int) {
        datos.estado = Estado.ENTRADA
        datos.secuenciaUsuario.add(color)

    }
    /**
     * Comprueba si la secuencia introducida por el usuario es correcta.
     * @return True si es correcto, false si no lo es.
     */
    fun comprobarSecuencia(){
        datos.estado = Estado.COMPROBANDO
        if (datos.secuencia == datos.secuenciaUsuario) {
            datos.ronda++
            if (datos.ronda > datos.record) {
                datos.record = datos.ronda
            }
            reiniciarSecuenciaUsuario()
            aumentarSecuencia()
        } else {
            datos.estado = Estado.FINALIZADO
        }

    }



    /**
     * Función que añade un número a la secuencia del usuario.
     * @param numero Número que se añade a la secuencia del usuario.
     */
    fun anadirNumeroSecuenciaUsuario(numero: Int) {
        datos.secuenciaUsuario.add(numero)
    }




    /**
     * Función que reinicia la secuencia del usuario.
     */
    fun reiniciarSecuenciaUsuario() {
        datos.secuenciaUsuario = mutableListOf<Int>()
    }

    /**
     * Función que reinicia la secuencia.
     */
    fun reiniciarSecuencia() {
        datos.secuencia = mutableListOf<Int>()
    }

    /**
     * Función que reinicia la ronda.
     */

    fun reiniciarRonda() {
        datos.ronda = 0
    }


    /**
     * Función que reinicia el record.
     */
    fun reiniciarRecord() {
        datos.record = 0

    }
}