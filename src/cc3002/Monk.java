package cc3002;

/**
 * Class for a Monk.
 *
 * @author Camilo Jara Do Nascimento.
 */
public class Monk extends Unit{
    /**
     * Constructor for a default Monk.
     */
    public Monk() {
        setHitPoints(30);
        setAttackPower(9);
        setMaxHitPoints(2*getHitPoints());
    }

    /**
     * Constructor for a Monk setting its hit points and attack power.
     * @param hitPoints
     * @param attackPower
     */
    public Monk(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }

    @Override
    public void attack(Attackable opponent) {
        if(isAlive()) {
            opponent.attackByMonk(this);
            opponent.setLimitHitPoints();
        }
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry) {
        setHitPoints(0);
    }

    @Override
    public void attackByCastle(Castle castle) {
        setHitPoints(0);
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        setHitPoints(0);
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        setHitPoints(0);
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        setHitPoints(0);
    }

    @Override
    public void attackByVillager(Villager villager){
        setHitPoints(getHitPoints());
    }

    @Override
    public void attackByMonk(Monk monk){
        setHitPoints(getHitPoints()+0.5*monk.getAttackPower());
    }
}
