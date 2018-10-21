package cc3002;

/**
 *  Class for a Castle.
 *
 * @author Camilo Jara Do Nascimento.
 */
public class Castle extends Building implements Attacker {
    /**
     * Constructor for a default Castle.
     */
    public Castle() {
        setHitPoints(4800);
        setAttackPower(11);
        setMaxHitPoints(getHitPoints());
    }

    /**
     * Constructor for a Castle setting its hit points and attack power.
     *
     * @param hitPoints the hit points of the Castle.
     * @param attackPower the attack power of the Castle.
     */
    public Castle(double hitPoints, double attackPower){
        super(hitPoints,attackPower);
    }

    @Override
    public void attack(Attackable opponent){
        if(isAlive()) {
            opponent.attackByCastle(this);
            opponent.setLimitHitPoints();
        }
    }

    @Override
    public void attackByCastle(Castle castle){
        setHitPoints(getHitPoints()-0.1*castle.getAttackPower());
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        setHitPoints(getHitPoints()-0.3*infantry.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        setHitPoints(getHitPoints()-0.1*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        setHitPoints(getHitPoints()-1.2*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        setHitPoints(getHitPoints()-2.0*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        setHitPoints(getHitPoints()+0.3*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        setHitPoints(getHitPoints());
    }

}
