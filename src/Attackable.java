public interface Attackable {
    double getHitPoints();
    void setHitPoints(double hitPoints);
    void decreaseHealth(int attackPower);

    default boolean isAlive(){
        return getHitPoints() != 0;
    }

}
