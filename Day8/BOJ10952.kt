package Day8

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while(true) {
        val st = StringTokenizer(br.readLine())
        val A = st.nextToken().toInt()
        val B = st.nextToken().toInt()

        if (A == 0 && B == 0) {
            break
        }
        println(A + B)
    }
}