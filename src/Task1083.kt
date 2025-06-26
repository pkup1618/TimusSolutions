import kotlin.text.split

fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val n = input[0].toLong()
    val k = input[1].length.toLong()
    val lastMultiplier = (if ((n % k) == 0L) k else n % k)

    val answer = generateSequence(n) { it - k }
        .takeWhile { it >= lastMultiplier }
        .toMutableList()
        .reduce { acc, num -> acc * num }

    println(answer)
}

