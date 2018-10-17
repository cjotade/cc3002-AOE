package cc3002;

public abstract class Building extends Entity {

    public Building(double hitPoints) {
        setHitPoints(hitPoints);
        //this.hitPoints = hitPoints;
    }

    public Building(double hitPoints, double attackPower){
        //this.hitPoints = hitPoints;
        //this.attackPower = attackPower;
        setHitPoints(hitPoints);
        setAttackPower(attackPower);
    }
}

