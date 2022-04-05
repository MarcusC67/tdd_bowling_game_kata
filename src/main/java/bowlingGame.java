public class bowlingGame {

    int playerScore = 0;
    int numPinsDown = 0;

    public int roll(int numPinsDown) {

        this.numPinsDown = numPinsDown;

        playerScore += numPinsDown;

        if (numPinsDown != 0) {
            // System.out.println("numPinsDown = " + numPinsDown);
            return numPinsDown;
        } else {
            return 0;
        }
    }

    public int score() {
        // System.out.println("playerScore = " + playerScore);
        return playerScore;
    }
}
