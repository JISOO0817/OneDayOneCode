package Bronze4.Day7

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val numList = arrayListOf<Int>()

    for (i in 0 .. 2) {
        numList.add(i, input.nextToken().toInt())
    }

    val sortedList = numList.sortedBy { it }

    sortedList.forEach { print("$it ") }
}