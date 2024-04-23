package Bronze4.Day19

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val d1 = br.readLine().toInt()
    val d2 = br.readLine().toInt()

    print(2*d1 + 2 * 3.141592 * d2)
}