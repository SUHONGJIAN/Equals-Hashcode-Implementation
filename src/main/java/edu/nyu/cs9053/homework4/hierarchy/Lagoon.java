package edu.nyu.cs9053.homework4.hierarchy;

/**                              
 * a concrete class {@code Lagoon} extends from {@literal BodyOfWater - SaltWater - Estuary} 
 * @author Hongjian Su
 * @version 1.0
 */
public class Lagoon extends Estuary {

    private final double depth;   //a specific instance field for type Lagoon.

    public Lagoon(String name, double volume, double depth) {
        super(name, volume);
	this.depth = depth;
    }

    public Lagoon(String name, double volume, double depth, int connectedWaterBodiesCount, double flow) {
	super(name, volume, connectedWaterBodiesCount, flow);
	this.depth = depth;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Lagoon that = (Lagoon) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && depth == that.depth;
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        long depthLong = Double.doubleToLongBits(depth);
	result = 31 * result + (int) (depthLong ^ (depthLong >>> 32));
        return result;
    }
}