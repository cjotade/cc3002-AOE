package cc3002;

public abstract class Entity implements Attackable {
    double hitPoints;
    double attackPower;

    public double getHitPoints(){
        return this.hitPoints;
    }

    public void setHitPoints(double hitPoints){
        this.hitPoints = hitPoints;
    }
}
