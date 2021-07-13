public class Player {
    private final String name;
    private int score;
    private Game game;
    private Difficulty difficulty;

    public Player(String name){
        this.name=name;
        this.score=0;
        System.out.println("Player "+name+" joined the game. Initial score: 0");
    }

    public void playGame(Game game,Difficulty difficulty){
        this.game=game;
        this.difficulty=difficulty;
        System.out.println();
        game.drawCards();
    }

    public void gameWon(){
        this.score+=game.pointsWon(difficulty);
        System.out.println("PLayer "+name+" won! Current score: "+score);
    }

    public void gameLost(){
        this.score-=game.pointsLost(difficulty);
        System.out.println("PLayer "+name+" lost! Current score: "+score);
    }

    public void displayScore(){
        System.out.println("\nPlayer "+name+ "'s score: " +score);
    }
}
