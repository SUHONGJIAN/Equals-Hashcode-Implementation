package edu.nyu.cs9053.homework4.hierarchy;

/**                                                                                     
 * a concrete class {@code Bay} extends from {@literal BodyOfWater - SaltWater - Estuary}
 * @author Hongjian Su
 * @version 1.0
 */
public class Bay extends Estuary {

    private final double radius;   //a specific instance field for type Bay.

    public Bay(String name, double volume, double radius) {
        super(name, volume);
	this.radius = radius;
    }

    public Bay(String name, double volume, double radius, int connectedWaterBodiesCount, double flow) {
	super(name, volume, connectedWaterBodiesCount, flow);
	this.radius = radius;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bay that = (Bay) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && radius == that.radius;
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        long radiusLong = Double.doubleToLongBits(radius);
	result = 31 * result + (int) (radiusLong ^ (radiusLong >>> 32));
        return result;
    }
}