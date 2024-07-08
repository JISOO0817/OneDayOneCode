package Bronze2.Day2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val array = arrayOf(
        'a',
        'b',
        'c',
        'd',
        'e',
        'f',
        'g',
        'h',
        'i',
        'j',
        'k',
        'l',
        'm',
        'n',
        'o',
        'p',
        'q',
        'r',
        's',
        't',
        'u',
        'v',
        'w',
        'x',
        'y',
        'z'
    )
    val s = br.readLine()
    br.close()
    for (i in array.iterator()) {
        var count = 0
        for (j in s.toCharArray()) {
            count += 1
            if (i == j) {
                print("${count - 1} ")
                break
            } else {
                if (count == s.toCharArray().size) {
                    print("-1 ")
                }
            }
        }
    }
}