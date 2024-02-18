package Day13

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val nums = arrayOf(1,1,2,2,2,8)

    for(element in nums) {
        val input = st.nextToken().toInt()

        val result = element - input
        print("$result ")

    }
}