import java.io.File

fun saveHTML(data: String, filePath: String) {
    val file = File("$filePath.html")
    file.writeText(data)
}
