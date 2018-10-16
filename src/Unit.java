public abstract class Unit implements Attacker {
    float hitPoints;

    public void setHitPoints(float hitPoints){
        this.hitPoints = hitPoints;
    }

    @Override
    public float getHitPoints() {
        return hitPoints;
    }

    @Override
    public abstract Attacker attack(Attacker entity);

    @Override
    public float getAttackPoints(Attacker entity) {
        return 0;
    }
}
