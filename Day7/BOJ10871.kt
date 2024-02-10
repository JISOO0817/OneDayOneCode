package Day7

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        val a = st2.nextToken().toInt()
        if (a < x) {
            print("$a ")
        }
    }
}