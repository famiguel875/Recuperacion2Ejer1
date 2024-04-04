class GestorMenu: IMenu {

    val gestorMensajes = GestorMensajes()

    override fun mostrarMenu() {
        gestorMensajes.mensaje("1. Generar serie" +
                "2. Jugar al ahorcado" +
                "3. Salir" +
                "")
    }
    override fun generarSerie() {

    }
    override fun jugarAhorcado(){

    }
}