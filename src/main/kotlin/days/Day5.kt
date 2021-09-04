package days

class Day5 : Day(5) {
    override fun partOne(): Int = getSeatIds()
        .maxOf { it }

    override fun partTwo(): Int {
        val occupied = getSeatIds()
        val maxSeatId = occupied.maxOf { it }

        return (0..maxSeatId).find {
            it !in occupied
                    && it + 1 in occupied
                    && it - 1 in occupied
        }!!
    }

    private fun getSeatIds() = inputList
        .map { BoardingPass.parse(it) }
        .map { p -> p.getSeatId() }
        .toSet()
}

data class BoardingPass(val row: Int, val col: Int) {
    companion object {
        fun parse(text: String): BoardingPass {
            val binayRaw = text
                .replace('B', '1')
                .replace('F', '0')
                .replace('L', '0')
                .replace('R', '1')

            return BoardingPass(
                binayRaw.take(7).toInt(2),
                binayRaw.takeLast(3).toInt(2)
            )
        }
    }

    fun getSeatId(): Int = row * 8 + col
}