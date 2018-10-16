package cc3002;

public class Castle extends Building implements Attacker {

    public Castle(double hitPoints, int attackPower){
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
    }
    @Override
    public void attack(Attackable opponent){
        opponent.decreaseHealth(attackPower);
    }
}
