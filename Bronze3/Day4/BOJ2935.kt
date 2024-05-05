package Bronze3.Day4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toBigInteger()
    val b = br.readLine()
    val c = br.readLine().toBigInteger()

    if (b.equals("+")) {
        print(a + c)
    } else {
        print(a * c)
    }
    br.close()
}
