class Persona(val nombre: String, var edad: Int) {
    fun saludar() {
        println("Hola, me llamo $nombre y tengo $edad años.")
    }
}

fun main() {
    val persona = Persona("Ana", 30)
    persona.saludar()
}
