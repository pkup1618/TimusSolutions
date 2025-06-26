import kotlin.text.split

fun main(args: Array<String>) {
    val k = readLine()!!.toInt()
    val partition = readLine()!!
        .split(' ')
        .map(String::toInt)

    val answer = partition
        .sorted()
        .subList(0, ((k + 1) / 2) )
        .sumOf { it / 2 + 1 }

    println(answer)
}
