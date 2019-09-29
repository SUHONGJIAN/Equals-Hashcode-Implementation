package edu.nyu.cs9053.homework4.hierarchy;

/**                                                                                             
 * an abstract class {@code Estuary} extends from {@literal BodyOfWater - SaltWater}          
 * @author Hongjian Su                                                                          
 * @version 1.0							  
 */
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

    /**
     * @return the number of connected bodies water for Estuary and its sub-types
     */
    public int getConnectedWaterBodiesCount() {
	return connectedWaterBodiesCount;
    }

    /**                                                                                         
     * @return the flow of connected bodies water for Estuary and its sub-types                 
     */
    public double getFlow() {
	return flow;
    }

}