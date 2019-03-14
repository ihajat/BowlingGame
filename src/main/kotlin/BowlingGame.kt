class BowlingGame {

    private var rolls = IntArray(21)
    val score: Int
        get() {
            var score = 0
            var rollIndex = 0
            for (i in 0..9) {
                if (isSpare(rollIndex)) {
                    score += getSpareScore(rollIndex)
                } else {
                    score += getStandardScore(rollIndex)
                }
                rollIndex += 2
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
}