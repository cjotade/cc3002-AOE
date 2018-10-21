package cc3002;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArcherUnitTest extends cc3002.Test {

    @Test
    public void testAttacks() {
        defaultArcherUnit.attack(defaultArcherUnit);
        defaultArcherUnit.attack(defaultInfantryUnit);
        defaultArcherUnit.attack(defaultCavalryUnit);
        defaultArcherUnit.attack(defaultSiegeUnit);
        defaultArcherUnit.attack(defaultVillager);
        defaultArcherUnit.attack(defaultMonk);
        defaultArcherUnit.attack(defaultCastle);
        defaultArcherUnit.attack(defaultBarracks);
        archerUnit.attack(archerUnit);
        archerUnit.attack(infantryUnit);
        archerUnit.attack(cavalryUnit);
        archerUnit.attack(siegeUnit);
        archerUnit.attack(villager);
        archerUnit.attack(monk);
        archerUnit.attack(castle);
        archerUnit.attack(barracks);
        assertEquals(defaultArcherUnit.getHitPoints(),25.2,0.01);
        assertEquals(defaultInfantryUnit.getHitPoints(),40.2,0.01);
        assertEquals(defaultCavalryUnit.getHitPoints(),96,0.01);
        assertEquals(defaultSiegeUnit.getHitPoints(),56.8,0.01);
        assertEquals(defaultVillager.getHitPoints(),19,0.01);
        assertEquals(defaultMonk.getHitPoints(),0,0.01);
        assertEquals(defaultCastle.getHitPoints(),4799.6,0.01);
        assertEquals(defaultBarracks.getHitPoints(),1497.2,0.01);
        assertEquals(archerUnit.getHitPoints(),88,0.01);
        assertEquals(infantryUnit.getHitPoints(),88,0.01);
        assertEquals(cavalryUnit.getHitPoints(),90,0.01);
        assertEquals(siegeUnit.getHitPoints(),92,0.01);
        assertEquals(villager.getHitPoints(),85,0.01);
        assertEquals(monk.getHitPoints(),0,0.01);
        assertEquals(castle.getHitPoints(),99,0.01);
        assertEquals(barracks.getHitPoints(),93,0.01);
    }

}