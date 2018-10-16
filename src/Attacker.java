public interface Attacker extends Attackable {
    Attacker attack(Attacker entity);
    float getAttackPoints(Attacker entity);
}
