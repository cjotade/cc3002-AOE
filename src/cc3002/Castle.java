package cc3002;

public class Castle extends Building implements Attacker {

    public Castle(double hitPoints, double attackPower){
        super(hitPoints,attackPower);
    }


    @Override
    public double getAttackPoints() {
        return attackPower;
    }

    @Override
    public void attack(Attackable opponent){
        opponent.attackByCastle(this);
    }

    @Override
    public void attackByCastle(Castle castle){
        this.hitPoints -= 0.1*castle.attackPower;
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        this.hitPoints -= 0.3*infantry.attackPower;
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        this.hitPoints -= 0.1*archer.attackPower;
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        this.hitPoints -= 0.3*cavalry.attackPower;
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        this.hitPoints -= 2.0*siege.attackPower;
    }

    @Override
    public void attackByVillager(Villager villager){
        this.hitPoints += 0.3*villager.attackPower;
    }

    @Override
    public void attackByMonk(Monk monk){
        this.hitPoints += 0;
    }

}
