package Bronze4.Day10

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val l = br.readLine().toInt()
    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()
    val d = br.readLine().toInt()

    var day1 = a/c
    var day2 = b/d

    if (a % c != 0) {
        day1 += 1
    }

    if (b % d != 0) {
        day2 += 1
    }

    print(l - maxOf(day1,day2))
}