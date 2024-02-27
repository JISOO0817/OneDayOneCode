package Day20

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = StringTokenizer(br.readLine())
        val first = input.nextToken().toInt()
        val second = input.nextToken().toInt()

        if (first == 0 && second == 0) {
            break
        }

        if (first > second) {
            println("Yes")
        } else {
            println("No")
        }
    }
}