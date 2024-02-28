package Bronze5.Day7

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val x = br.readLine().toInt()
    val y = br.readLine().toInt()

    if (x > 0 && y > 0) {
        print(1)
    } else if (x < 0 && y > 0) {
        print(2)
    } else if (x < 0 && y < 0) {
        print(3)
    } else {
        print(4)
    }
}