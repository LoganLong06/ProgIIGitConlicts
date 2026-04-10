package ca.qc.cegepheritage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {
    class TestPlant extends Plant {

        public TestPlant(String plantName, int daysInGarden) {
            super(plantName, daysInGarden);
        }

        @Override
        public double getDailyGrowth() {
            return 0;
        }
    }

    @Test
    public void testTestPlantConstructorSetsAllAttributesCorrectly() {
        TestPlant plant =  new TestPlant("Grass",1);
        assertEquals("Grass",plant.getPlantName());
        assertEquals(1,plant.getDaysInGarden());
    }
    @Test
    public void testTestPlantGetInfoReturnsCorrectString() {
        TestPlant plant =  new TestPlant("Grass",1);
        assertEquals("Grass has been in the garden for 1 days.",plant.getInfo());
    }
    @Test
    public void testTestPlantApplyMagicBoostReturnsCorrectString() {
        TestPlant plant =  new TestPlant("Grass",1);
        assertEquals("Some faint sparkles appear around , but nothing else happens :( ",plant.applyMagicBoost());
    }

}