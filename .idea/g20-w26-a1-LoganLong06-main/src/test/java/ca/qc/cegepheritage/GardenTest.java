package ca.qc.cegepheritage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardenTest {
    @Test
    public void testConstructorSetsAttributesCorrectly() {
        Garden garden = new Garden(20);
        assertEquals(20,garden.getPlantsBasic().length);
    }
    @Test
    public void testConstructorWithInvalidSizeThrows() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Garden garden = new Garden(-1);
        });
    }
    @Test
    public void testAddPlantAddsAPlantAndReturnsTrueWhenThePlantIsAdded() {
        Garden garden = new Garden(20);
        Herb herb = new Herb("Herb",2,2);
        assertTrue(garden.addPlant(herb));
        assertEquals(herb.getInfo(),garden.getPlants()[0].getInfo());
    }
    @Test
    public void testAddPlantDoesNotAddAPlantAndReturnsFalseWhenTheGardenIsFull() {
        Garden garden = new Garden(2);
        Herb herb = new Herb("Herb",2,2);
        garden.addPlant(herb);
        garden.addPlant(herb);
        assertFalse(garden.addPlant(herb));
    }
    @Test
    public void testAddPlantWithANullPlantThrowsIllegalArgumentException() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                Garden garden = new Garden(2);
                garden.addPlant(null);
            });
    }
    @Test
    public void testCalculateTotalDailyGrowthWithPlantsReturnsCorrectDailyGrowth() {
        Garden garden = new Garden(2);
        Herb herb = new Herb("Herb",2,2);
        garden.addPlant(herb);
        garden.addPlant(herb);
        double expectedDailyGrowth = (herb.getDailyGrowth()) * 2;
        assertEquals(expectedDailyGrowth,garden.calculateTotalDailyGrowth());
    }
    @Test
    public void testCalculateTotalDailyGrowthWithNoPlantsReturnsCorrectDailyGrowth() {
        Garden garden = new Garden(2);
        double expectedDailyGrowth = 0;
        assertEquals(expectedDailyGrowth,garden.calculateTotalDailyGrowth());
    }
    @Test
    public void testFindFastestGrowingPlantWithNoPlantsReturnsNull() {
        Garden garden = new Garden(2);
        assertNull(garden.findFastestGrowingPlant());
    }
    @Test
    public void testFindFastestGrowingPlantReturnsTheFastestGrowingPlant() {
        Garden garden = new Garden(2);
        Herb herb = new Herb("Herb",2,12);
        Herb herb2 = new Herb("Herb",2,2);
        garden.addPlant(herb);
        garden.addPlant(herb2);
        assertEquals(herb,garden.findFastestGrowingPlant());
    }
}