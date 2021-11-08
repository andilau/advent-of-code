package days

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Day 11")
class Day11Test {
    private val seats = """
        L.LL.LL.LL
        LLLLLLL.LL
        L.L.L..L..
        LLLL.LL.LL
        L.LL.LL.LL
        L.LLLLL.LL
        ..L.L.....
        LLLLLLLLLL
        L.LLLLLL.L
        L.LLLLL.LL
        """.trimIndent().lines()

    @DisplayName("Part 1")
    @Test
    fun testPartOne() {
        assertThat(Day11(seats).partOne()).isEqualTo(37)
    }

    @DisplayName("Part 2")
    @Test
    fun testPartTwo() {
        assertThat(Day11(seats).partTwo()).isEqualTo(26)
    }
}