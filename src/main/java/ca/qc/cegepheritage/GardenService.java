package ca.qc.cegepheritage;

public class GardenService {
    public static Garden createSampleGarden(int maxSize) {
        Garden garden = new Garden(maxSize);
        Herb cilantro = new Herb("Cilantro",2,10);
        Herb basil = new Herb("Basil",4,8);
        FruitTree appleTree = new FruitTree("Apple",6,7,5,2.00);
        FruitTree palmTree = new FruitTree("Palm",2,22,10,10.00);
        garden.addPlant(cilantro);
        garden.addPlant(basil);
        garden.addPlant(appleTree);
        garden.addPlant(palmTree);
        return garden;
    }
    public static double calculateAverageDailyGrowth(Garden garden) {
        if (garden == null || garden.getPlants()[0] == null) {
            return 0.0;
        } else {
            return garden.calculateTotalDailyGrowth() / garden.getPlants().length;
        }
    }
    public static double calculateAverageDailyGrowth(Plant[] plants) {
        double total = 0;
        int count = 0;
        if (plants == null) {
            return 0;
        }
        for (Plant plant : plants) {
            if (plant != null) {
                total += plant.getDailyGrowth();
                count++;
            }
        }
        return total/count;
    }
    public static double applyMagicAndRecalculateGrowth(Garden garden) {
        if (garden == null) {
            return 0;
        }
        garden.applyMagicToAll();
        return garden.calculateTotalDailyGrowth();
    }
    public static double applyMagicAndRecalculateGrowth(Plant[] plants) {
        if (plants == null) {
            return 0;
        }
        for (Plant plant : plants) {
            if (plant != null) {
                plant.applyMagicBoost();
            }
        }
        double total = 0;
        for (Plant plant : plants) {
            if (plant != null) {
                total += plant.getDailyGrowth();
            }
        }
        return total;
    }
}
