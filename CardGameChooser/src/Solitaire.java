public class Solitaire implements Game {
    @Override
    public void drawCards() {
        System.out.println("""
                Playing Solitaire
                \tDraw six to one cards for each of the seven groups of cards and one upside card for each group.
                \tThe remaining deck will be upside down and each card will be drawn on demand.
                \tThe purpose is to make four decks with cards from the same suit.""");
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
