package edu.nyu.cs9053.homework4.hierarchy;

/**                                                                                        
 * a concrete class {@code Brook} extends from {@literal BodyOfWater - FreshWater - Stream}
 * @author Hongjian Su
 * @version 1.0
 */
public class Brook extends Stream {

    private final String flowDirection;   //a specific instance field for type Brook.

    public Brook(String name, double volume, String flowDirection) {
        super(name, volume);
	this.flowDirection = flowDirection;
    }

    public Brook(String name, double volume, String flowDirection, int connectedWaterBodiesCount, double flow) {
	super(name, volume, connectedWaterBodiesCount, flow);
	this.flowDirection = flowDirection;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Brook that = (Brook) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && (flowDirection == null ? that.flowDirection == null : flowDirection.equals(that.flowDirection));
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        result = 31 * result + (flowDirection != null ? flowDirection.hashCode() : 0);
        return result;
    }
}