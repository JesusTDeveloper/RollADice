/**
 * Programa para simular el lanzamiento de un dado y mostrar una representación gráfica de la cara resultante.
 */

// Array que contiene las representaciones gráficas de las caras de un dado.
fun main() {
    val diceFaces = arrayOf(
        """
 
   o 
 
""",  // Cara 1

        """
o   
   
      o
""",  // Cara 2

        """
o   
   o 
      o
""",  // Cara 3

        """
o     o
   
o     o
""",  // Cara 4

        """
o     o
   o
o     o
""",  // Cara 5

        """
o     o
o     o
o     o
"""   // Cara 6
    )
    // Define el rango válido de números para el dado (1-6).
    val range = 1..6

    // Bucle principal del programa.
    do {
        // Solicita al usuario si desea lanzar el dado.
        println("¿Quieres lanzar el dado? Y/N")
        val answer = readln()

        // Evalúa la respuesta del usuario.
        when (answer) {
            // Si el usuario quiere lanzar el dado, genera un número aleatorio y muestra la cara correspondiente.
            "Y", "y" -> {
                val randomNumber = range.random()
                println("Salio $randomNumber\n" + diceFaces[randomNumber - 1])
            }
            // Si el usuario no quiere lanzar el dado, termina el programa.
            "N", "n" -> {
                println("OK, hasta luego!")
                break
            }
            // Si el usuario proporciona una entrada no reconocida, informa al usuario y solicita una nueva entrada.
            else -> {
                println("Entrada no válida. Por favor ingrese Y/N.")
            }
        }
    } while (true) // El bucle se ejecuta hasta que se recibe un comando para salir (break).
}
