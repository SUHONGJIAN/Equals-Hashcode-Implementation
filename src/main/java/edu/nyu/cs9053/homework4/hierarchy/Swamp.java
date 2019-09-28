package edu.nyu.cs9053.homework4.hierarchy;

public class Swamp extends FreshWater {

    private final int numberOfPlants;

    public Swamp(String name, double volume, int numberOfPlants) {
        super(name, volume);
	this.numberOfPlants = numberOfPlants;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Swamp that = (Swamp) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && numberOfPlants == that.numberOfPlants;
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        result = 31 * result + numberOfPlants;
        return result;
    }
}