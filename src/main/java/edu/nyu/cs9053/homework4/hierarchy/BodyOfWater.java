package edu.nyu.cs9053.homework4.hierarchy;

/**   
 * an abstract class {@code BodyOfWater} represents all water. Strongly recommend to see {@literal Hierarchy Profile.png} to understand the hierarchy.
 * @author Hongjian Su
 * @version 1.0
 */ 
public abstract class BodyOfWater {
    
    private final String name;
    
    private final double volume;

    public BodyOfWater(String name, double volume) {
	this.name = name;
	this.volume = volume;
    }

    /**
     * @return the name for the body of water
     */
    public String getName() {
	return name;
    }

    /**
     * @return the volume for the body of water
     */
    public double getVolume() {
	return volume;
    }
}