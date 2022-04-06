
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class bowlingGameTest {

    private bowlingGame game;

    @Before
    public void setUp() {
        game = new bowlingGame();
    }

    @Test
    public void checkRollLessThan10() {
        // Arrange
        // Act
        // Assert
        assertEquals(5, game.roll(5));
    }

    @Test
    public void checkGameAllMisses() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    public void checkGameAllOnes() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

    // Check spare with bonus 3rd roll = 5, across 2 frames
    @Test
    public void checkSpareWithNextRollOfFiveInTwoFramesTotal20() {
        game.roll(4);
        game.roll(6);
        game.roll(5);
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertEquals(20, game.score());
    }

    // Check strike with bonus 3 and 5, across 2 frames
    @Test
    public void checkStrikeNextTwoRollsThreeAndFive() {
        game.roll(10);
        game.roll(3);
        game.roll(5);
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertEquals(26, game.score());
    }

}
