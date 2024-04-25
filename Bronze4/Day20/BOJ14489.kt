package Bronze4.Day20

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val money = StringTokenizer(br.readLine())
    val a = money.nextToken().toInt()
    val b = money.nextToken().toInt()
    val chickPrice = br.readLine().toInt()

    if (a >= 2 * chickPrice || b >= 2 * chickPrice || a + b >= 2 * chickPrice) {
        println(a + b - 2 * chickPrice)
    } else {
        println(a + b)
    }
}