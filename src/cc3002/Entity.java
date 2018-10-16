package cc3002;

public abstract class Entity implements Attackable,Attacker {
    double hitPoints;

    public double getHitPoints(){
        return this.hitPoints;
    }

    public void setHitPoints(double hitPoints){
        this.hitPoints = hitPoints;
    }
}
