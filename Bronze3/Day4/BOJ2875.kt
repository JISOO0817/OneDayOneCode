package Bronze3.Day4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    var n = input.nextToken().toInt()
    var m = input.nextToken().toInt()
    val k = input.nextToken().toInt()
    var team = 0
    while (true) {
        //인턴쉽에 참여할 학생 나중에 빼주기 위함
        if (n < 2 || m < 1 || n-2 + m-1 < k) {
            break
        }

        if (n >= 2 && m >= 1) {
            team ++
            n -= 2
            m -= 1
        }
    }
    br.close()
    print(team)
}