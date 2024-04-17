package Bronze4.Day15

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    repeat(3) {
        val input = StringTokenizer(br.readLine())
        var h1 = input.nextToken().toInt()
        var m1 = input.nextToken().toInt()
        var s1 = input.nextToken().toInt()
        var h2 = input.nextToken().toInt()
        var m2 = input.nextToken().toInt()
        var s2 = input.nextToken().toInt()

        if (s1 > s2) {
            s2 += 60
            m2 -= 1
        }
        s2 -= s1
        if (m1 > m2) {
            m2 += 60
            h2 -= 1
        }
        m2 -= m1
        h2 -= h1
        println("$h2 $m2 $s2")
    }
}