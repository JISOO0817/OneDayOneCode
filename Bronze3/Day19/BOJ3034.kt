package Bronze3.Day19

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val n = input.nextToken().toInt()
    val w = input.nextToken().toInt()
    val h = input.nextToken().toInt()
    repeat(n) {
        val num = br.readLine().toInt()
        if (num <= w || num <= h || (num*num) <= (w*w) + (h*h)) {
            println("DA")
        } else {
            println("NE")
        }
    }
    br.close()
}