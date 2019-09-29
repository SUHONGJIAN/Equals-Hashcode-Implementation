package edu.nyu.cs9053.homework4.hierarchy;

/**                                                                                      
 * a concrete class {@code Tributary} extends from {@literal BodyOfWater - FreshWater - Stream}
 * @author Hongjian Su
 * @version 1.0
 */
public class Tributary extends Stream {

    private final String destinationRiver;   //a specific instance field for type Tributary.

    public Tributary(String name, double volume, String destinationRiver) {
        super(name, volume);
	this.destinationRiver = destinationRiver;
    }

    public Tributary(String name, double volume, String destinationRiver, int connectedWaterBodiesCount, double flow) {
	super(name, volume, connectedWaterBodiesCount, flow);
	this.destinationRiver = destinationRiver;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tributary that = (Tributary) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && (destinationRiver == null ? that.destinationRiver == null : destinationRiver.equals(that.destinationRiver));
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        result = 31 * result + (destinationRiver != null ? destinationRiver.hashCode() : 0);
        return result;
    }
}