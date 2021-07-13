public class Cheat implements Game {
    @Override
    public void drawCards() {
        System.out.println("""
                Playing Cheat (Bullshit)
                \tThe deck is divided for each player and players put a card upside down with the suit given until someone calls bullshit.
                \tThe purpose is to get rid of the cards.""");
    }

    @Override
    public int pointsWon(Difficulty difficulty) {
        return 40*difficulty.rate;
    }

    @Override
    public int pointsLost(Difficulty difficulty) {
        return 35*difficulty.rate;
    }
}
