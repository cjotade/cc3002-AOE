package cc3002;

public class tarea1 {
    public static void main(String[] args) {
        Castle cas = new Castle(10,10);
        Castle cas1 = new Castle(20,10);
        System.out.println("Hit points");
        System.out.println(cas.getHitPoints());
        System.out.println(cas1.getHitPoints());
        System.out.println("Attack Power");
        System.out.println(cas.attackPower);
        System.out.println(cas1.attackPower);
        cas1.attack(cas);
        System.out.println("Hit points before attack (cas1 attacks cas)");
        System.out.println(cas.getHitPoints());
        System.out.println(cas1.getHitPoints());
        System.out.println(cas.isAlive());
        cas.setHitPoints(10);
        System.out.println(cas.getHitPoints());
        System.out.println(cas.isAlive());

    }
}

