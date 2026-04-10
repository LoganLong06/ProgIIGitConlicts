package ca.qc.cegepheritage;

public abstract class Plant {
    private String plantName;
    private int daysInGarden;

    public Plant(String plantName, int daysInGarden) {
        this.plantName = plantName;
        this.daysInGarden = daysInGarden;
    }

    public String getInfo() {
        return plantName + " has been in the garden for " + daysInGarden + " days.";
    }

    public abstract double getDailyGrowth();

    public String applyMagicBoost() {
        return "Some faint sparkles appear around , but nothing else happens :( ";
    }

    public String getPlantName() {
        return this.plantName;
    }
    public int getDaysInGarden() {
        return this.daysInGarden;
    }
}
