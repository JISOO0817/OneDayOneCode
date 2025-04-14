package Silver5

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()

    val numArray = IntArray(n)
    val str = StringTokenizer(br.readLine())

    for (i in 0 until n) {
        numArray[i] = str.nextToken().toInt()
    }

    numArray.sort()
    //-10 2 3 6 10

    val m = br.readLine().toInt()
    val str2 = StringTokenizer(br.readLine())

    val sb = StringBuilder()

    for (i in 0 until m) {
        val targetNum = str2.nextToken().toInt()
        val result = if (binarySearch(numArray, targetNum)) 1 else 0
        sb.append("$result ")
    }

    println(sb.toString())
}

fun binarySearch(numArray: IntArray, target: Int): Boolean {

    var left = 0
    var right = numArray.size-1

    while (left <= right) {
        val mid = left + (right - left) / 2

        when {
            numArray[mid] == target -> return true
            numArray[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return false
}