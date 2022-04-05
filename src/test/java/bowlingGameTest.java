import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
            bowlingGame.roll(0);
        }
        assertEquals(0, bowlingGame.score());
    }
}
