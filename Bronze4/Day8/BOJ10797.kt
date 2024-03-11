package Bronze4.Day8

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val date = br.readLine().toInt()
    val input = StringTokenizer(br.readLine())
    val carList = mutableListOf<Int>()
    repeat(5) {
        carList.add(input.nextToken().toInt())
    }
    var count = 0

    for (car in carList) {
        if (car == date) {
            count += 1
        }
    }

    print(count)
}