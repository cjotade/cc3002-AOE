package cc3002;

public interface Attacker extends Attackable {
    void attack(Attackable opponent);
    double getAttackPower();
    void setAttackPower(double attackPower);
}



