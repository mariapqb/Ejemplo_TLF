    fun main() {
        println("¡Hola, Kotlin!")

        /*
        Variables
         */
        val nombre = "Juan"  // Inmutable (como una constante)
        var edad = 25        // Mutable (puede cambiarse)
    }

    /*
    Funciones
     */
    fun suma(a: Int, b: Int): Int {
        /*
      Condiciones
       */
        val edad = 18
        if (edad >= 18) {
            println("Eres mayor de edad")
        } else {
            println("Eres menor de edad")
        }

        /*
        Ciclos
         */
        for (i in 1..5) {
            println("Número $i")
        }

        return a + b

    }

    /*
    Función en una sola linea
     */
    fun suma1(a: Int, b: Int) = a + b



