package edu.nyu.cs9053.homework4.hierarchy;

/**
 * a concrete class {@code Gulf} extends from {@literal BodyOfWater - SaltWater - Estuary}
 * @author Hongjian Su                                                                      
 * @version 1.0                                                                            
 */
public class Gulf extends Estuary {

    private final double area;   //a specific instance field for type Gulf.

    public Gulf(String name, double volume, double area) {
        super(name, volume);
	this.area = area;
    }

    public Gulf(String name, double volume, double area, int connectedWaterBodiesCount, double flow) {
	super(name, volume, connectedWaterBodiesCount, flow);
	this.area = area;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Gulf that = (Gulf) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && area == that.area;
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        long areaLong = Double.doubleToLongBits(area);
	result = 31 * result + (int) (areaLong ^ (areaLong >>> 32));
        return result;
    }
}