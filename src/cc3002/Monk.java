package cc3002;

public class Monk extends Unit{

    public Monk(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }

    @Override
    public void attack(Attackable opponent) {
        opponent.attackByMonk(this);
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry) {
        this.hitPoints = 0;
    }

    @Override
    public void attackByCastle(Castle castle) {
        this.hitPoints = 0;
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        this.hitPoints = 0;
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        this.hitPoints = 0;
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        this.hitPoints = 0;
    }

    @Override
    public void attackByVillager(Villager villager){
        this.hitPoints += 0;
    }

    @Override
    public void attackByMonk(Monk monk){
        this.hitPoints += 0.5*monk.attackPower;
    }
}
