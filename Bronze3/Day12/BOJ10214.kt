package Bronze3.Day12

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    var ysCnt = 0
    var krCnt = 0

    repeat(t) {
        repeat(9) {
            val input = StringTokenizer(br.readLine())
            val ys = input.nextToken().toInt()
            val kr = input.nextToken().toInt()
            ysCnt += ys
            krCnt += kr
        }

        if (ysCnt > krCnt) {
            println("Yonsei")
        } else if( ysCnt == krCnt) {
            println("Draw")
        } else {
            println("Korea")
        }
    }

    br.close()
}