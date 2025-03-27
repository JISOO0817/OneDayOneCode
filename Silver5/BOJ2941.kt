package Silver5

fun main() {
    val br = System.`in`.bufferedReader()
    val s = br.readLine()
    val croatianAlphabets = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    var result = s
    for (alphabet in croatianAlphabets) {
        result = result.replace(alphabet, "X")
    }

    println(result.length)
}