package Day16

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toBigInteger()
    val b = st.nextToken().toBigInteger()
    print(a + b)
}
