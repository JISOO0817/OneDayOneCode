package Silver3

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    val map = hashMapOf<String, Int>()

    repeat(n) {
        val str = br.readLine()
        val dotIndex = str.lastIndexOf(".")
        val text = str.substring(dotIndex + 1)

        map[text] = map.getOrDefault(text, 0) + 1
    }

    map.entries.sortedBy { it.key }.forEach { (string, count)  ->
        println("$string $count")
    }
}