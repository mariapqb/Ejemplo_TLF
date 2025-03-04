fun main() {
    val tareas = mutableListOf<Tarea>()  // Lista mutable para almacenar tareas

    while (true) {
        println("\n--- GESTOR DE TAREAS ---")
        println("1. Agregar tarea")
        println("2. Listar tareas")
        println("3. Completar tarea")
        println("4. Salir")
        print("Seleccione una opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> agregarTarea(tareas)
            2 -> listarTareas(tareas)
            3 -> completarTarea(tareas)
            4 -> {
                println("Saliendo del gestor de tareas. ¡Hasta luego!")
                break
            }
            else -> println("Opción no válida, intenta de nuevo.")
        }
    }
}

data class Tarea(val id: Int, val descripcion: String, var completada: Boolean = false)

fun agregarTarea(tareas: MutableList<Tarea>) {
    print("Ingrese la descripción de la tarea: ")
    val descripcion = readLine().orEmpty()
    val nuevaTarea = Tarea(tareas.size + 1, descripcion)
    tareas.add(nuevaTarea)
    println("Tarea agregada exitosamente.")
}

fun listarTareas(tareas: List<Tarea>) {
    if (tareas.isEmpty()) {
        println("No hay tareas registradas.")
    } else {
        println("\n--- LISTA DE TAREAS ---")
        tareas.forEach { tarea ->
            val estado = if (tarea.completada) "[✓]" else "[ ]"
            println("${tarea.id}. $estado ${tarea.descripcion}")
        }
    }
}

fun completarTarea(tareas: MutableList<Tarea>) {
    listarTareas(tareas)
    print("Ingrese el ID de la tarea a completar: ")
    val id = readLine()?.toIntOrNull()

    val tarea = tareas.find { it.id == id }
    if (tarea != null) {
        tarea.completada = true
        println("Tarea marcada como completada.")
    } else {
        println("Tarea no encontrada.")
    }
}
