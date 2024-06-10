package Bronze3.Day15

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = 300
    val b = 60
    val c = 10

    var aCnt = 0
    var bCnt = 0
    var cCnt = 0
    var t = br.readLine().toInt()

    while (t >= 0) {
        if (t == 0) {
            break
        }
        if ( t >= a) {
            t-=a
            aCnt += 1
        } else if (t >= b) {
            t -= b
            bCnt += 1
        } else if (t >= c){
            t -= c
            cCnt += 1
        } else {
            aCnt = 0
            bCnt = 0
            cCnt = 0
            break
        }
    }
    if (aCnt == 0 && bCnt == 0 && cCnt == 0) {
        print("-1")
    } else {
        print("$aCnt $bCnt $cCnt")
    }
    br.close()
}