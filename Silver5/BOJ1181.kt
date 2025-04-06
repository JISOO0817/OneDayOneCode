package Silver5

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    val words = mutableSetOf<String>()


    for (i in 0 until n) {
        val str = br.readLine()
        words.add(str)
    }

    val sortedWords = words.sortedWith(compareBy<String> { it.length }.thenBy { it })
    sortedWords.forEach { println(it) }
}