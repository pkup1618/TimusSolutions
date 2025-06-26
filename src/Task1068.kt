fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val answer = (if (n > 1) 1 .. n else n .. 1).sum()

    println(answer)
}