import java.io.File


fun addSymbols() {
    val tests = File("alllistTestsForRun").readLines()

    val result = tests.joinToString(
        separator = "\n",
        transform = { "#${it.trimStart()}" }
    )

    println(result)
}

fun removeSymbols() {
    val tests = File("alllistTestsForRun").readLines()

    val result = tests.map { it.replace("-", "").replace(" ", "") }
        .filter { it.isNotBlank() }
        .joinToString(separator = "\n") { it.removeSurrounding("\"") }

    println(result)
}

fun main() {
    addSymbols()
//    removeSymbols()
}
