package Silver3

import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val inputArray = IntArray(n)

    for (i in 0 until n) {
        inputArray[i] = br.readLine().toInt()
    }

    inputArray.sort()

    var total = 0L

    for (i in 0 until n) {
        total += abs(inputArray[i] - (i+1))
    }

    println(total)
}