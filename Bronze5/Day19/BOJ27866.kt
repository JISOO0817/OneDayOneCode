package Bronze5.Day19

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val s = br.readLine()
    val i = br.readLine().toInt()

    print(s[i-1])
}