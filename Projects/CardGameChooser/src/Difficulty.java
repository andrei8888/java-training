public enum Difficulty {
    EASY(1),
    MEDIUM(4),
    HARD(7),
    VERYHARD(10);

    public final int rate;

    Difficulty(int difficulty) {
        this.rate = difficulty;
    }
}
