package code._3_in_class.ch1;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight(){
        String winnerName="";
        while(true){
            fighter1.attack(fighter2);
            if(fighter2.getHealth()<=0) {
                winnerName = fighter1.getName();
                break;
            }
            fighter2.attack(fighter1);
            if(fighter1.getHealth()<=0) {
                winnerName = fighter2.getName();
                break;
            }
        }
        return winnerName;
    }
}
