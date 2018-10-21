package cc3002;

/**
 * Class for a Barracks.
 *
 * @author Camilo Jara Do Nascimento.
 */
public class Barracks extends Building {
    /**
     * Constructor for a default Barrack.
     */
    public Barracks() {
        setHitPoints(1500);
        setMaxHitPoints(getHitPoints());
    }

    /**
     * Constructor for a Barrack setting its hit points.
     *
     * @param hitPoints the hit points of the Barrack.
     */
    public Barracks(double hitPoints){
        super(hitPoints);
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        setHitPoints(getHitPoints()-0.7*infantry.getAttackPower());
    }

    @Override
    public void attackByCastle(Castle castle){
        setHitPoints(getHitPoints()-0.7*castle.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        setHitPoints(getHitPoints()-0.7*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        setHitPoints(getHitPoints()-0.7*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        setHitPoints(getHitPoints()-2.0*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        setHitPoints(getHitPoints()+0.7*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        setHitPoints(getHitPoints());
    }
}
