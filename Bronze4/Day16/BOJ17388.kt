package Bronze4.Day16

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val s = input.nextToken().toInt()
    val k = input.nextToken().toInt()
    val h = input.nextToken().toInt()

    if (s + k + h >= 100) {
        println("OK")
    } else if (s < h && s < k) {
        println("Soongsil")
    } else if (k < h && k < s) {
        println("Korea")
    } else {
        println("Hanyang")
    }
}