package cc3002;

import org.junit.Test;

import static org.junit.Assert.*;

public class VillagerTest extends cc3002.Test {

    @Test
    public void testAttacks() {
        defaultVillager.attack(defaultArcherUnit);
        defaultVillager.attack(defaultInfantryUnit);
        defaultVillager.attack(defaultCavalryUnit);
        defaultVillager.attack(defaultSiegeUnit);
        defaultVillager.attack(defaultVillager);
        defaultVillager.attack(defaultMonk);
        defaultVillager.attack(defaultCastle);
        defaultVillager.attack(defaultBarracks);
        villager.attack(archerUnit);
        villager.attack(infantryUnit);
        villager.attack(cavalryUnit);
        villager.attack(siegeUnit);
        villager.attack(villager);
        villager.attack(monk);
        villager.attack(castle);
        villager.attack(barracks);
        assertEquals(defaultArcherUnit.getHitPoints(),27,0.01);
        assertEquals(defaultInfantryUnit.getHitPoints(),42.6,0.01);
        assertEquals(defaultCavalryUnit.getHitPoints(),98.5,0.01);
        assertEquals(defaultSiegeUnit.getHitPoints(),60,0.01);
        assertEquals(defaultVillager.getHitPoints(),22,0.01);
        assertEquals(defaultMonk.getHitPoints(),30,0.01);
        assertEquals(defaultCastle.getHitPoints(),4800,0.01);
        assertEquals(defaultBarracks.getHitPoints(),1500,0.01);
        assertEquals(archerUnit.getHitPoints(),90,0.01);
        assertEquals(infantryUnit.getHitPoints(),92,0.01);
        assertEquals(cavalryUnit.getHitPoints(),95,0.01);
        assertEquals(siegeUnit.getHitPoints(),105,0.01);
        assertEquals(villager.getHitPoints(),90,0.01);
        assertEquals(monk.getHitPoints(),100,0.01);
        assertEquals(castle.getHitPoints(),100,0.01);
        assertEquals(barracks.getHitPoints(),100,0.01);
    }
}