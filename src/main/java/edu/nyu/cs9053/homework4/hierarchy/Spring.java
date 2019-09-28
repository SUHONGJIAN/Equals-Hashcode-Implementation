package edu.nyu.cs9053.homework4.hierarchy;

public class Spring extends FreshWater {

    private final String altitude;

    public Spring(String name, double volume, String altitude) {
        super(name, volume);
	this.altitude = altitude;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Spring that = (Spring) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && (altitude == null ? that.altitude == null : altitude.equals(that.altitude));
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        result = 31 * result + (altitude != null ? altitude.hashCode() : 0);
        return result;
    }
}