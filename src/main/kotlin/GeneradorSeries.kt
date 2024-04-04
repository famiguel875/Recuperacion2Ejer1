import kotlin.random.Random

val gestorMensajes = GestorMensajes()

class GeneradorSeries {

    fun generarRangoAleatorio(primerIndiceAleatorio: Int, segundoIndiceAleatorio: Int) {
        val primerIndice = primerIndiceAleatorio(segundoIndiceAleatorio)
        val segundoIndice = segundoIndiceAleatorio(primerIndiceAleatorio)
        val numeroFinal = segundoIndice - primerIndice

        if ((segundoIndice - numeroFinal) < (numeroFinal - primerIndice)) {
            serieCreciente(primerIndice, segundoIndice)
        } else {
            serieDecreciente(primerIndice, segundoIndice)
        }
    }

    private fun serieCreciente(primerIndiceAleatorio: Int, segundoIndiceAleatorio: Int) {
        val primerIndice = primerIndiceAleatorio(segundoIndiceAleatorio)
        val segundoIndice = segundoIndiceAleatorio(primerIndiceAleatorio)
        val numeroFinal = segundoIndice - primerIndice
        var indice = 1
        var suma = 0

        for (i in numeroFinal..segundoIndice) {
            indice += 1
            for (j in numeroFinal..segundoIndice) {
                suma += suma
                gestorMensajes.mensaje("$i x $j = ${i * j}")
            }
        }
    }

    private fun serieDecreciente(primerIndiceAleatorio: Int, segundoIndiceAleatorio: Int) {
        val primerIndice = primerIndiceAleatorio(segundoIndiceAleatorio)
        val segundoIndice = segundoIndiceAleatorio(primerIndiceAleatorio)
        val numeroFinal = segundoIndice - primerIndice
        var indice = 1
        var suma = 0

        for (i in numeroFinal..primerIndice) {
            indice += 1
            for (j in numeroFinal..primerIndice) {
                suma += suma
                gestorMensajes.mensaje(" $i x $j = ${i * j}")
            }
        }
    }

    companion object {
        const val MIN_RANGO = 1
        const val MAX_RANGO = 100
    }

    fun primerIndiceAleatorio(segundoIndiceAleatorio: Int): Int {
        val primerIndice: Int = Random.nextInt(MIN_RANGO, MAX_RANGO)

        while (primerIndice < 70 && (segundoIndiceAleatorio-primerIndice) >= 30 ) {
            return primerIndice
        }
        return primerIndice
    }


    fun segundoIndiceAleatorio(primerIndiceAleatorio: Int): Int {
        val segundoIndice: Int = Random.nextInt(MIN_RANGO, MAX_RANGO)

        while (segundoIndice > 30 && (segundoIndice-primerIndiceAleatorio) >= 30) {
            return segundoIndice
        }
        return segundoIndice
    }
}