package Silver5

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    var count = 0

    repeat(n) {
      val word = br.readLine()
        if (isGroupWord(word)) {
            count ++
        }
    }

    println(count)
}

fun isGroupWord(word: String): Boolean {
    val charSet = HashSet<Char>()
    var prevChar = ' '

    for (i in word.indices) {
        val currentChar = word[i]

        if (currentChar != prevChar) {
            if (charSet.contains(currentChar)) {
                return false
            }

            charSet.add(currentChar)
        }

        prevChar = currentChar
    }

    return true
}