package code._3_in_class.ch1;

public class Fighter {
    String name;
    int health;
    int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent){
        opponent.health -= damagePerAttack;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
