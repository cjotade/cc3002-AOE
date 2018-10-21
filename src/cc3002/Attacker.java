package cc3002;

/**
 * Interface implemented to mark when you can attack.
 *
 * @author Camilo Jara Do Nascimento.
 */
public interface Attacker extends Attackable {
    /**
     * Attacks an Attackable opponent according at each interaction between them (attacker and receiver).
     * For more explanation see the table of interaction between Entities given.
     *
     * @param opponent the Attackable that is being attacked.
     */
    void attack(Attackable opponent);

    /**
     * Gets the actual attack power of an Attacker.
     * @return the attack power.
     */
    double getAttackPower();

    /**
     * Set the actual attack power to given parameter of an Attacker.
     * @param attackPower the new attack power.
     */
    void setAttackPower(double attackPower);
}



