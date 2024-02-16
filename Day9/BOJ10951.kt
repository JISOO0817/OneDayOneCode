package Day9

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while(true) {
        val input = StringTokenizer(br.readLine())
        if (br.readLine().isEmpty()) {
            break
        }

        val A = input.nextToken().toInt()
        val B = input.nextToken().toInt()
        println(A+B)
    }
}