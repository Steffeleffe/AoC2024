#set( $Code = "bar" )
fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("Day${Day}_test")
    checkResult(part1(testInput),0)
    // checkResult(part2(testInput),0)

    val input = readInput("Day${Day}")
    part1(input).println()
    part2(input).println()
}
