public class Macau implements Game {
    @Override
    public void drawCards() {
        System.out.println("""
                Playing Macau
                \tEach player gets 5 cards and a starting card (which can\'t be an action card).
                \tThe purpose of the player is to have no cards.""");
    }

    @Override
    public int pointsWon(Difficulty difficulty) {
        return 35*difficulty.rate;
    }

    @Override
    public int pointsLost(Difficulty difficulty) {
        return 25*difficulty.rate;
    }
}
