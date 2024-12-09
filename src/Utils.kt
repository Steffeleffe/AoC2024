import kotlin.io.path.Path
import kotlin.io.path.readText

fun readInput(name: String) = Path("src/$name.txt").readText().trim().lines()

fun Any?.println() = println(this)

fun checkResult(actual: Int, expected: Int) {
    check(actual == expected) { "Expected $expected, but was $actual." }
}