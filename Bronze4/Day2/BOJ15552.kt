package Bronze4.Day2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = br.readLine().toInt()

    repeat(t) {
        val input = StringTokenizer(br.readLine())
        val a = input.nextToken().toInt()
        val b = input.nextToken().toInt()
        bw.write((a + b).toString() + "\n")
    }

    bw.flush()
    bw.close()
}