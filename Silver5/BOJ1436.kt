package Silver5

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    var count = 0
    var index = 666
    while (n > count) {
        val str = index.toString()
        if (str.contains("666")) {
            count++
        }
        index++
    }
    println(index-1)
}