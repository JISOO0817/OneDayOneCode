package Bronze4.Day18

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine(),"/")
    val k = input.nextToken().toInt()
    val d = input.nextToken().toInt()
    val a = input.nextToken().toInt()

    if (k + a < d || d == 0) {
        print("hasu")
    } else {
        print("gosu")
    }
}