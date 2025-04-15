package Silver5

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toCharArray()

    val numList = n.map { it.toString().toInt() }.toMutableList()

    numList.sortDescending()

    println(numList.joinToString(""))
}