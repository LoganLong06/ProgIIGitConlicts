package ca.qc.cegepheritage;

public class Herb extends Plant {
    private int hoursOfSunlightPerDay;

    public Herb(String name, int daysInGarden, int hoursOfSunlightPerDay) {
        super(name, daysInGarden);
        this.hoursOfSunlightPerDay = hoursOfSunlightPerDay;
    }

    @Override
    public double getDailyGrowth() {
        return (hoursOfSunlightPerDay * 0.5) + (hoursOfSunlightPerDay * 0.1);
    }

    @Override
    public String applyMagicBoost() {
        this.hoursOfSunlightPerDay += 2;
        return "The sun energy of this plant has been increased by two hours!";
    }

    public int getHoursOfSunlightPerDay() {
        return this.hoursOfSunlightPerDay;
    }

    @Override
    public String getInfo() {
        return getPlantName() + " has been in the garden for " + getDaysInGarden() + " days and gets " + getHoursOfSunlightPerDay() + " hours of sunlight per day.";
    }

}
