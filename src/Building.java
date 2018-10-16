public abstract class Building implements Attackable {
    double hitPoints;
    int attackPower;

    @Override
    public void setHitPoints(double hitPoints){
        this.hitPoints = hitPoints;
    }

    @Override
    public double getHitPoints() {
        return hitPoints;
    }

    @Override
    public void decreaseHealth(int attackPower) {
        hitPoints -= attackPower;
    }

}

