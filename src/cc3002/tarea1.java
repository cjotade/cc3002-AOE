package cc3002;

import com.sun.javafx.scene.EnteredExitedHandler;

public class tarea1 {
    public static void main(String[] args) {
        Castle cas = new Castle(10,10);
        Castle cas1 = new Castle(20,10);
        InfantryUnit inf = new InfantryUnit(30,1);
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
        cas.setHitPoints(10);
        System.out.println(cas.getHitPoints());
        System.out.println(cas.isAlive());

    }
}

