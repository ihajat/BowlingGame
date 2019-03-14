class BowlingGame {

    private var rolls = IntArray(21)
    val score: Int
        get() {
            var score = 0
            var rollIndex = 0
            for (i in 0..9) {
                // if it is a spare
                if (getStandardScore(i) == 10) {
                    score += rolls[i] + rolls[i + 1] + rolls[i + 2]
                } else {
                    // standard score
                    score += getStandardScore(rollIndex)
                }
                rollIndex += 2
            }
            return score
        }

    fun setRolls(rolls: IntArray) {
        this.rolls = rolls
    }

    private fun getStandardScore(i: Int): Int {
        return rolls[i] + rolls[i + 1]
    }
}