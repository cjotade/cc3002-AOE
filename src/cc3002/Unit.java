package cc3002;

public abstract class Unit extends Entity implements Attacker {
    public Unit(){}

    public Unit(double hitPoints,double attackPower){
        setHitPoints(hitPoints);
        setAttackPower(attackPower);
    }
}

