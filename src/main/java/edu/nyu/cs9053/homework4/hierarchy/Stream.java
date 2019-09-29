package edu.nyu.cs9053.homework4.hierarchy;

/**                                                                                 
 * an abstract class {@code Stream} extends from {@literal BodyOfWater - FreshWater}
 * @author Hongjian Su
 * @version 1.0
 */
public abstract class Stream extends FreshWater {

    private static final int DEFAULT_CONNECTEDWATERBODIESCOUNT = 0;

    private static final double DEFAULT_FLOW = 0.0;

    private final int connectedWaterBodiesCount;

    private final double flow;

    public Stream(String name, double volume) {
	this(name, volume, DEFAULT_CONNECTEDWATERBODIESCOUNT, DEFAULT_FLOW);
    }

    public Stream(String name, double volume, int connectedWaterBodiesCount, double flow) {
	super(name, volume);
	this.connectedWaterBodiesCount = connectedWaterBodiesCount;
	this.flow = flow;
    }

    public int getConnectedWaterBodiesCount() {
	return connectedWaterBodiesCount;
    }

    public double getFlow() {
	return flow;
    }

}