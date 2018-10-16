public interface Attackable {
    float getHitPoints();

    default boolean isAlive(){
        return getHitPoints() != 0;
    }
}
