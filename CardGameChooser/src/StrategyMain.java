public class StrategyMain {
    public static void main(String[] args) {
        Player player1=new Player("john332");
        player1.playGame(new Macau(),Difficulty.MEDIUM);
        player1.gameWon();
        player1.playGame(new Cheat(),Difficulty.HARD);
        player1.gameLost();
        player1.playGame(new Solitaire(),Difficulty.EASY);
        player1.gameLost();
        player1.playGame(new War(),Difficulty.VERYHARD);
        player1.gameWon();
        player1.displayScore();
    }
}
