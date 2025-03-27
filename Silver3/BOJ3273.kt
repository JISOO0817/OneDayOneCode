package Silver3

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    val numList = arrayListOf<Int>()
    val st = StringTokenizer(br.readLine())
    repeat(n) {
        val input = st.nextToken().toInt()
        numList.add(input)
    }

    numList.sort()
    val expectedNum = br.readLine().toInt()
    var count = 0

    var left = 0
    var right = n-1
    while (left < right) {
        val sum = numList[left] + numList[right]
        if (sum == expectedNum) {
            count ++
            left ++
            right --
        } else if (sum < expectedNum) {
            left ++
        } else {
            right --
        }
    }

    println(count)
}