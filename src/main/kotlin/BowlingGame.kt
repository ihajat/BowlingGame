class BowlingGame {

    private var rolls = IntArray(21)
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

    fun setRolls(rolls: IntArray) {
        this.rolls = rolls
    }

    private fun getStandardScore(rollIndex: Int): Int {
        return rolls[rollIndex] + rolls[rollIndex + 1]
    }

    private fun isSpare(rollIndex: Int): Boolean {
        return getStandardScore(rollIndex) == 10
    }

    private fun getSpareScore(rollIndex: Int): Int {
        return rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2]
    }

    private fun isStrike(i: Int): Boolean {
        return rolls[i] == 10
    }

    private fun getStrikeScore(i: Int): Int {
        return rolls[i] + rolls[i + 1] + rolls[i + 2]
    }
}