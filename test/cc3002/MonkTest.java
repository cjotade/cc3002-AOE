package cc3002;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonkTest extends cc3002.Test {
    @Test
    public void testAttacks() {
        defaultMonk.attack(defaultArcherUnit);
        defaultMonk.attack(defaultInfantryUnit);
        defaultMonk.attack(defaultCavalryUnit);
        defaultMonk.attack(defaultSiegeUnit);
        defaultMonk.attack(defaultVillager);
        defaultMonk.attack(defaultMonk);
        defaultMonk.attack(defaultCastle);
        defaultMonk.attack(defaultBarracks);
        monk.attack(archerUnit);
        monk.attack(infantryUnit);
        monk.attack(cavalryUnit);
        monk.attack(siegeUnit);
        monk.attack(villager);
        monk.attack(monk);
        monk.attack(castle);
        monk.attack(barracks);
        assertEquals(defaultArcherUnit.getHitPoints(),34.5,0.01);
        assertEquals(defaultInfantryUnit.getHitPoints(),49.5,0.01);
        assertEquals(defaultCavalryUnit.getHitPoints(),104.5,0.01);
        assertEquals(defaultSiegeUnit.getHitPoints(),60,0.01);
        assertEquals(defaultVillager.getHitPoints(),29.5,0.01);
        assertEquals(defaultMonk.getHitPoints(),34.5,0.01);
        assertEquals(defaultCastle.getHitPoints(),4800,0.01);
        assertEquals(defaultBarracks.getHitPoints(),1500,0.01);
        assertEquals(archerUnit.getHitPoints(),105,0.01);
        assertEquals(infantryUnit.getHitPoints(),105,0.01);
        assertEquals(cavalryUnit.getHitPoints(),105,0.01);
        assertEquals(siegeUnit.getHitPoints(),100,0.01);
        assertEquals(villager.getHitPoints(),105,0.01);
        assertEquals(monk.getHitPoints(),105,0.01);
        assertEquals(castle.getHitPoints(),100,0.01);
        assertEquals(barracks.getHitPoints(),100,0.01);
    }

}