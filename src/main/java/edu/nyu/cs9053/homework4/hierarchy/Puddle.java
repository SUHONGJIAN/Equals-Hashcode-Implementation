package edu.nyu.cs9053.homework4.hierarchy;

public class Puddle extends FreshWater {

    private final String size;

    public Puddle(String name, double volume, String size) {
        super(name, volume);
	this.size = size;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Puddle that = (Puddle) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && (size == null ? that.size == null : size.equals(that.size));
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}