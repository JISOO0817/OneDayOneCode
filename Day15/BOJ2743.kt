package Day15

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toCharArray()

    var count = 0
    for (i in input.indices) {
        count += 1
    }

    print(count)
}