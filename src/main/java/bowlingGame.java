public class bowlingGame {

    // Declare array numPinsHit len 21 which is max num of rolls possible in a game
    // so num of pins down per roll stored in array
    private int[] numPinsHit = new int[21];
    int currentRoll = 0;

    public int roll(int numPinsHit) {

        // Store the numPinsHit number in numPinsHit array[currentRoll value] and add 1 to roll count
        this.numPinsHit[currentRoll++] = numPinsHit;
        return numPinsHit;
    }

    public int score() {

        int playerScore = 0;
        int rollNumber = 0;

        // Scroll through each of 10 frames - 2 rolls per frame
        for (int frameNum = 0; frameNum < 10; frameNum++) {

            int frameScore = 0;

            if (isSpare(rollNumber)) {
                frameScore = 10 + spareExtraPoints(rollNumber);
                rollNumber += 2;

            } else if (isStrike(numPinsHit[rollNumber])) {
                frameScore = 10 + strikeExtraPoints(rollNumber);
                rollNumber++;

            } else {
                frameScore = numPinsHit[rollNumber] + numPinsHit[rollNumber + 1];
                rollNumber += 2;
            }

            playerScore += frameScore;

        }

        return playerScore;
    }

    private boolean isStrike(int roll) {
        // It's a strike - return a true value if numPinsHit(roll 1) + numPinsHit(roll 2) = 10
        return roll == 10;
    }

    private int strikeExtraPoints(int roll) {
        // return bonus points from roll after previous frames spare - 2 rolls = 10
        return numPinsHit[roll + 1] + numPinsHit[roll + 2];
    }

    private boolean isSpare(int roll) {
        // It's a spare - return a true value if numPinsHit(roll 1) + numPinsHit(roll 2) = 10
        return numPinsHit[roll] + numPinsHit[roll + 1] == 10;
    }

    private int spareExtraPoints(int roll) {
        // return bonus points from roll after previous frames spare - 2 rolls = 10
        return numPinsHit[roll + 2];
    }

}
