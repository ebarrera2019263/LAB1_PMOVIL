//Erick Alexnader Barrera Ochoa 22934
class ItemData(private val originalValue: Any) {

    val type: String?
        get() =
            when (originalValue) {
                is String -> "cadena"
                is Int -> "entero"
                is Boolean -> "booleano"
                else -> null
            }

    val info: String?
        get() =
            when (originalValue) {
                is String -> "L${originalValue.length}"
                is Int -> {
                    val value = originalValue
                    when {
                        value % 10 == 0 -> "M10"
                        value % 5 == 0 -> "M5"
                        value % 2 == 0 -> "M2"
                        else -> null
                    }
                }
                is Boolean -> if (originalValue) "Verdadero" else "Falso"
                else -> null
            }
}

fun main(args: Array<String>) {
    // Aquí puedes crear instancias de la clase ItemData y realizar las pruebas que desees
    /*val item1 = ItemData("Hola")
    println(item1.type) // Salida: cadena
    println(item1.info) // Salida: L4

    val item2 = ItemData(15)
    println(item2.type) // Salida: entero
    println(item2.info) // Salida: M5

    val item3 = ItemData(true)
    println(item3.type) // Salida: booleano
    println(item3.info) // Salida: Verdadero*/

}
