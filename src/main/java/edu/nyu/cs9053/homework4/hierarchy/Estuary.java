package edu.nyu.cs9053.homework4.hierarchy;

public abstract class Estuary extends SaltWater {

    private static final int DEFAULT_CONNECTEDWATERBODIESCOUNT = 0;

    private static final double DEFAULT_FLOW = 0.0;

    private final int connectedWaterBodiesCount;

    private final double flow;

    public Estuary(String name, double volume) {
       	this(name, volume, DEFAULT_CONNECTEDWATERBODIESCOUNT, DEFAULT_FLOW);
    }
    
    public Estuary(String name, double volume, int connectedWaterBodiesCount, double flow) {
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