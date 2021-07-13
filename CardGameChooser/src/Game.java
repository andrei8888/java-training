public interface Game {
    void drawCards();
    int pointsWon(Difficulty difficulty);
    int pointsLost(Difficulty difficulty);
}
