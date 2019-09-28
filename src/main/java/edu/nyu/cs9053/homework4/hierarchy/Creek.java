package edu.nyu.cs9053.homework4.hierarchy;

public class Creek extends Stream {

    private final double averageBreadth;

    public Creek(String name, double volume, double averageBreadth) {
        super(name, volume);
	this.averageBreadth = averageBreadth;
    }

    public Creek(String name, double volume, double averageBreadth, int connectedWaterBodiesCount, double flow) {
	super(name, volume, connectedWaterBodiesCount, flow);
	this.averageBreadth = averageBreadth;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Creek that = (Creek) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && averageBreadth == that.averageBreadth;
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        long averageBreadthLong = Double.doubleToLongBits(averageBreadth);
	result = 31 * result + (int) (averageBreadthLong ^ (averageBreadthLong >>> 32));
        return result;
    }
}