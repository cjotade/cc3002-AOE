package cc3002;

public abstract class Entity implements Attackable {
    private double hitPoints;
    private double attackPower;

    public double getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(double hitPoints){
        this.hitPoints = hitPoints;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower){
        this.attackPower = attackPower;
    }

    public boolean isAlive(){
        return getHitPoints() != 0;
    }
}
