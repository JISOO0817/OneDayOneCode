package Bronze3.Day19

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 0 until 3) {
        var sum = BigInteger.ZERO
        repeat(br.readLine().toInt()) {
            val n = br.readLine().toBigInteger()
            sum += n
        }
        if ( sum == BigInteger.ZERO) {
            println("0")
        } else if (sum > BigInteger.ZERO) {
            println("+")
        } else {
            println("-")
        }
    }
    br.close()
}
