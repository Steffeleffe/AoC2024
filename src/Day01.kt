fun main() {
    data class Line(val left : Int, val right : Int)
    fun getLine(s: String): Line {
        val (a,b) = s.split("   ").map { it.toInt() }
        return Line(a,b)
    }

    fun part1(input: List<String>): Int {
        val lines = input.map { getLine(it) }
        val sortedLeft = lines.map { it.left }.sorted()
        val sortedRight = lines.map { it.right }.sorted()
        return sortedLeft.mapIndexed { index, i -> Math.abs(i - sortedRight[index]) }.sum()
    }

    fun part2(input: List<String>): Int {
        val lines = input.map { getLine(it) }
        val left = lines.map { it.left }
        val right = lines.map { it.right }
        return left.sumOf { leftNumber -> leftNumber * right.count { it == leftNumber } }
    }

    val testInput = readInput("Day01_test")
    checkResult(part1(testInput),11)
    checkResult(part2(testInput),31)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
