public class War implements Game {
    @Override
    public void drawCards() {
        System.out.println("""
                Playing War
                \tThe deck is divided for each player and each round the player with the greatest card wins.
                \tThe player wants the whole deck.""");
    }

    @Override
    public int pointsWon(Difficulty difficulty) {
        return 15*difficulty.rate;
    }

    @Override
    public int pointsLost(Difficulty difficulty) {
        return 10*difficulty.rate;
    }
}
