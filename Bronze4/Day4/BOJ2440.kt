package Bronze4.Day4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 0 until n) {
        for (j in n - i downTo 1) {
            bw.write("*")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}