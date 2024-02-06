package Day5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine()).nextToken().toInt()

    if (input % 4 == 0 && (input % 100 != 0 || input % 400 == 0)) {
        print("1")
    } else {
        print("0")
    }
}