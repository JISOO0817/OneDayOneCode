package Bronze3.Day3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    var a = input.nextToken().toInt()
    var b = input.nextToken().toInt()
    val c = br.readLine().toInt()

    b += c
    if (b > 59) {
        a = (a + b / 60) % 24
        b %= 60
    }

    print("$a $b")
    br.close()
}