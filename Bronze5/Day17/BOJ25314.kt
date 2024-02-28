package Bronze5.Day17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    repeat (n / 4) {
        print("long ")
    }
    print("int")
}