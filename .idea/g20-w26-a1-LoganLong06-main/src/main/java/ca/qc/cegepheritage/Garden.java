package ca.qc.cegepheritage;

public class Garden {
    private Plant[] plants;

    public Garden(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Invalid Size");
        }
        this.plants = new Plant[maxSize];
    }

    public boolean addPlant(Plant plant) {
        if (plant == null) {
            throw new IllegalArgumentException("Null plant not accepted");
        }
        int i = 0;
        for (Plant plot : plants) {
            if (plot == null) {
                plants[i] = plant;
                return true;
            }
            i++;
        }
        return false;
    }

    public Plant[] getPlants() {
        int counter = 0;
        for (int i = 0; i < plants.length; i ++) {
            if (plants[i] != null) {
                counter++;
            }
        }
        Plant[] result = new Plant[counter];
        for (int i = 0; i < counter; i ++) {
            if (plants[i] != null) {
                result[i] = plants[i];
            }
        }
        return result;
    }

    public double calculateTotalDailyGrowth() {
        double totalDailyGrowth = 0;
        for (Plant plant : getPlants()) {
            totalDailyGrowth += plant.getDailyGrowth();
        }
        return totalDailyGrowth;
    }

    public Plant findFastestGrowingPlant() {
        Plant fastestPlant = plants[0];
        for (Plant plant : getPlants()) {
            if (plant.getDailyGrowth() > fastestPlant.getDailyGrowth()) {
                fastestPlant = plant;
            }
        }
        return fastestPlant;
    }

    public void applyMagicToAll() {
        for (Plant plant : getPlants()) {
            plant.applyMagicBoost();
        }
    }

    public Plant[] getPlantsBasic() {
        return this.plants;
    }
}
