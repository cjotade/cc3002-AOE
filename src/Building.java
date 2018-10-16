public abstract class Building implements Attackable {
    float hitPoints;

    public void setHitPoints(float hitPoints){
        this.hitPoints = hitPoints;
    }

    @Override
    public float getHitPoints() {
        return hitPoints;
    }

}

