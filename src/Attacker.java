public interface Attacker extends Attackable {
    void attack(Attackable opponent);
    double getAttackPoints(Attackable opponent);

    @Override
    void setHitPoints(double hitPoints);
}
