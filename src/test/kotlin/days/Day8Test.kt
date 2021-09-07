package days

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Ignore
import org.junit.Test

class Day8Test {
    private val day = Day8()

    @Test
    fun testPartOne() {
        assertThat(day.partOne(), `is`(5))
    }

    @Test
    fun testPartTwo() {
        assertThat(day.partTwo(), `is`(8))
    }
}