package Bronze4.Day8

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    var h = input.nextToken().toInt()
    var m = input.nextToken().toInt()
    var s = input.nextToken().toInt()

    val needTime = br.readLine().toInt()
    s += needTime

    if (s > 59) {
        m += s / 60
        s %= 60
    }

    if (m > 59) {
        h += m / 60
        m %= 60

    }

    if ( h > 23) {
        h %= 24
    }
    print("$h $m $s")
}