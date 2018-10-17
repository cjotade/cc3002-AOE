package cc3002;

public abstract class Unit extends Entity implements Attacker {

    public Unit(double hitPoints,double attackPower){
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
    }

    @Override
    public double getAttackPoints() {
        return attackPower;
    }

    public void heal(double additionalHealth){
        this.hitPoints += additionalHealth;
    }

}

