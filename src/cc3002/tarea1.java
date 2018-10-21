package cc3002;

public class tarea1 {
    public static void main(String[] args) {
        Castle cas = new Castle(10,10);
        Castle cas1 = new Castle(20,10);
        InfantryUnit inf = new InfantryUnit(30,1);
        Attackable bar = new Barracks(100);
        Monk monk = new Monk(100,10);

        System.out.println("Hit points");
        System.out.println(cas.getHitPoints());
        System.out.println(cas1.getHitPoints());
        System.out.println(inf.getHitPoints());
        System.out.println("Attack Power");
        System.out.println(cas.getAttackPower());
        System.out.println(cas1.getAttackPower());
        System.out.println(inf.getAttackPower());
        //Attack
        cas1.attack(cas);
        inf.attack(cas1);
        System.out.println("Hit points before attack (cas1 attacks cas)");
        System.out.println(cas.getHitPoints());
        System.out.println(cas1.getHitPoints());
        System.out.println(inf.getHitPoints());
        System.out.println(cas.isAlive());
        cas.setHitPoints(0);
        System.out.println(cas.getHitPoints());
        System.out.println(cas.isAlive());
        cas.attack(bar);
        System.out.println(bar.getHitPoints());
        System.out.println(inf.getHitPoints());
        monk.attack(inf);
        System.out.println(inf.getHitPoints());
        cas1.attack(monk);
        System.out.println(monk.getHitPoints());
        InfantryUnit inf1 = new InfantryUnit();
        System.out.println(inf1.getHitPoints());
        System.out.println(inf1.getAttackPower());
        ArcherUnit archer1 = new ArcherUnit(0,1);
        ArcherUnit archer2 = new ArcherUnit();
        System.out.println(archer2.getHitPoints());
        System.out.println(archer2.getAttackPower());
        archer1.attack(archer2);
        System.out.println(archer2.getHitPoints());
        System.out.println(archer2.getAttackPower());
        System.out.println(archer2.getMaxHitPoints());
        ArcherUnit archer3 = new ArcherUnit();
        System.out.println(archer3.getMaxHitPoints());
        Villager villager = new Villager(1,1);
        SiegeUnit siege = new SiegeUnit();
        siege.attack(villager);
        System.out.println(villager.getHitPoints());
        Monk monk3 = new Monk(10,1000);
        Villager vil = new Villager(0,999999);
        monk3.attack(vil);
        Castle cas3 = new Castle(10,10);
        vil.attack(cas3);
        System.out.println(vil.getHitPoints());
        System.out.println(cas3.getHitPoints());





    }
}

