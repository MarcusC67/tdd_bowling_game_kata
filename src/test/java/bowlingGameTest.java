
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class bowlingGameTest {

    @Test
    public void checkRollLessThan10() {
        // Arrange
        // Act
        bowlingGame game = new bowlingGame();
        // Assert
        assertEquals(5, game.roll(5));
    }

    @Test
    public void checkGameAllMisses() {
        bowlingGame game = new bowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    public void checkGameAllOnes() {
        bowlingGame game = new bowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }


    // Check spare with bonus 3rd roll = 5, across 2 frames
    @Test
    public void checkSpareWithNextRollOfFiveInTwoFramesTotal20() {
        bowlingGame game = new bowlingGame();
        game.roll(4);
        game.roll(6);
        game.roll(5);
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertEquals(20, game.score());
    }

}
