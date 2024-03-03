package Bronze4.Day3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = StringTokenizer(br.readLine())
    val tempArray = arrayListOf<Int>()
    var sameNum = 0
    repeat(3) {
        val num = input.nextToken().toInt()
        if (!tempArray.contains(num)) {
            tempArray.add(num)
        } else {
            sameNum = num
        }
    }

    when (tempArray.size) {
        1 -> bw.write((10000 + (sameNum * 1000)).toString())
        2 -> bw.write((1000 + (sameNum * 100)).toString())
        else -> bw.write((tempArray.max() * 100).toString())
    }

    bw.flush()
    bw.close()
}