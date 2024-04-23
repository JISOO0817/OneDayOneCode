package Bronze4.Day19

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val sum = input.nextToken().toInt()
    val minus = input.nextToken().toInt()
    var x = 0
    var y = 0

    if (minus > sum) {
        println("-1")
    } else {
        y = (sum - minus) / 2
        x = sum - y
        if (x + y == sum && x - y == minus) {
            println("$x $y")
        } else {
            println("-1")
        }
    }
}