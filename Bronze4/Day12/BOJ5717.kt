package Bronze4.Day12

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val st = StringTokenizer(br.readLine())
        val m = st.nextToken().toInt()
        val f = st.nextToken().toInt()
        if (m == 0 && f == 0) {
            return
        }
        println(m + f)
    }
}