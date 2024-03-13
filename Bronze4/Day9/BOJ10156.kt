package Bronze4.Day9

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val k = input.nextToken().toInt()
    val n = input.nextToken().toInt()
    val m = input.nextToken().toInt()

    val price = k * n
    val needMoney = price - m

    if (needMoney < 0) {
        print("0")
    } else {
        print(needMoney)
    }
}