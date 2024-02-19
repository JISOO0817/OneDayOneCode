package Day14

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val numList = arrayListOf<Int>()
    var count = 0
    for (i in 1 .. n) {
        val input = st.nextToken().toInt()
        numList.add(input)
    }

    val v = br.readLine().toInt()
    for (result in numList) {
        if (result == v) {
            count += 1
        }
    }

    print(count)
}