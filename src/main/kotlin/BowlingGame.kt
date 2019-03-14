import Constants.Companion.MAX_GAME_SIZE

class BowlingGame {

    private var rolls = IntArray(MAX_GAME_SIZE)
    val score: Int
        get() {
            var score = 0
            var rollIndex = 0
            for (i in 0..9) {
                if (isStrike(rollIndex)) {
                    score += getStrikeScore(rollIndex)
                    rollIndex += 1
                } else if (isSpare(rollIndex)) {
                    score += getSpareScore(rollIndex)
                    rollIndex += 2
                } else {
                    score += getStandardScore(rollIndex)
                    rollIndex += 2
                }
            }
            return score
        }

    // Setter used to pass an array of ints to represent a game, rather than keep
    // a cursor for current frame
    fun setRolls(rolls: IntArray) {
        this.rolls = rolls
    }

    //Scorer for standard scores( non spares/strikes )
    private fun getStandardScore(rollIndex: Int): Int {
        return rolls[rollIndex] + rolls[rollIndex + 1]
    }

    //Scorer for standard Spare
    private fun getSpareScore(rollIndex: Int): Int {
        return rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2]
    }

    //Scorer for standard Strike
    private fun getStrikeScore(i: Int): Int {
        return rolls[i] + rolls[i + 1] + rolls[i + 2]
    }

    // Check if spare
    private fun isSpare(rollIndex: Int): Boolean {
        return getStandardScore(rollIndex) == 10
    }

    // Check if strike
    private fun isStrike(i: Int): Boolean {
        return rolls[i] == 10
    }


}