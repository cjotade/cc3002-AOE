package cc3002;

/**
 * Class for a CavalryUnit.
 *
 * @author Camilo Jara Do Nascimento.
 */
public class CavalryUnit extends Unit {
    /**
     * Constructor for a default CavalryUnit.
     */
    public CavalryUnit() {
        setHitPoints(100);
        setAttackPower(10);
        setMaxHitPoints(2*getHitPoints());
    }

    /**
     * Constructor for a CavalryUnit setting its hit points and attack power.
     * @param hitPoints
     * @param attackPower
     */
    public CavalryUnit(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }

    @Override
    public void attack(Attackable opponent) {
        if(isAlive()) {
            opponent.attackByCavalryUnit(this);
            opponent.setLimitHitPoints();
        }
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        setHitPoints(getHitPoints()-1.2*infantry.getAttackPower());
    }

    @Override
    public void attackByCastle(Castle castle){
        setHitPoints(getHitPoints()-1.2*castle.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        setHitPoints(getHitPoints()-1.0*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        setHitPoints(getHitPoints()-1.0*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        setHitPoints(getHitPoints()-1.0*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        setHitPoints(getHitPoints()-0.5*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        setHitPoints(getHitPoints()+0.5*monk.getAttackPower());
    }
}
