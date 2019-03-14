import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

internal class BowlingGameTest {

    lateinit var game: BowlingGame

    @Before
    fun setUp() {
        game = BowlingGame()
    }

    //Test1: Write test to check that an empty/default game returns zero score
    @Test
    fun testEmptyGame() {
        assertEquals(0, game.score)
    }

    //Test2: Write test to check a gutter game returns zero
    @Test
    fun testZeros() {
        val rolls = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        game.setRolls(rolls)
        assertEquals(0, game.score)
    }

    //Test3: Write test to check a standard score without any spares/strikes game returns 20
    @Test
    fun testStandardScores() {
        val rolls = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        game.setRolls(rolls)
        assertEquals(20, game.score)
    }

    //Test4: Write test to check a spare game returns 12
    @Test
    fun testSpare() {
        val rolls = intArrayOf(5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        game.setRolls(rolls)
        assertEquals(12, game.score)
    }

    //Test5: Write test to check a strike game returns 14
    @Test
    fun testStrike() {
        val rolls = intArrayOf(10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        game.setRolls(rolls)
        assertEquals(14, game.score)
    }

    //Test6: Write test to check a perfect game returns 300
    @Test
    fun testPerfectGame() {
        val rolls = intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
        game.setRolls(rolls)
        assertEquals(300, game.score)
    }
}