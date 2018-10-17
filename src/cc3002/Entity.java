package cc3002;

public abstract class Entity implements Attackable {
    private double hitPoints;
    private double attackPower;

    public double getHitPoints(){
        return this.hitPoints;
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

}
