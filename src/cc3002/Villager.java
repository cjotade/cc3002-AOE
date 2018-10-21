package cc3002;

/**
 * Class for a Villager.
 *
 * @author Camilo Jara Do Nascimento.
 */
public class Villager extends Unit{
    /**
     * Constructor for a default Villager.
     */
    public Villager() {
        setHitPoints(25);
        setAttackPower(3);
        setMaxHitPoints(2*getHitPoints());
    }

    /**
     * Constructor for a Villager setting its hit points and attack power.
     *
     * @param hitPoints
     * @param attackPower
     */
    public Villager(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }

    @Override
    public void attack(Attackable opponent){
        if(isAlive()) {
            opponent.attackByVillager(this);
            opponent.setLimitHitPoints();
        }
    }

    @Override
    public void attackByCastle(Castle castle){
        setHitPoints(getHitPoints()-1.2*castle.getAttackPower());
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        setHitPoints(getHitPoints()-1.5*infantry.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        setHitPoints(getHitPoints()-1.5*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        setHitPoints(getHitPoints()-1.5*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        setHitPoints(getHitPoints()-1.5*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        setHitPoints(getHitPoints()-1.0*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        setHitPoints(getHitPoints()+0.5*monk.getAttackPower());
    }
}
