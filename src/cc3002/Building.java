package cc3002;

public abstract class Building extends Entity {

    public Building() {
    }

    public Building(double hitPoints) {
        setHitPoints(hitPoints);
    }

    public Building(double hitPoints, double attackPower){
        setHitPoints(hitPoints);
        setAttackPower(attackPower);
    }
}

