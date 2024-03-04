package Bronze4.Day4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()
    val n = br.readLine().toInt()
    var price = 0
    repeat(n) {
        val input = StringTokenizer(br.readLine())
        val a = input.nextToken().toInt()
        val b = input.nextToken().toInt()

        price += a * b
    }

    if (x == price) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.flush()
    bw.close()
}