package edu.nyu.cs9053.homework4;

/**
 * a enum type {@code OceanName} represents the five Ocean names of the world
 * @author Hongjian Su
 * @version 1.0
 */
public enum OceanName {

    ATLANTIC(106400000.0),

    ARCTIC(14056000.0),

    INDIAN(73556000.0),

    PACIFIC(165250000.0),

    SOUTHERN(20327000.0);
    
    private final double area;   //unit of measurement: square kilometers

    private OceanName(double area) {
	this.area = area;
    }

    /**
     * @return the area as a {@literal double}
     */
    public double getArea() {
	return area;
    }

    /**
     * @param multiple OceanName Objects
     * {@code print} each Object's area
     */
    public static void print(OceanName ... oceans) {
	for (OceanName ocean: oceans) {
	    System.out.printf("%,.2f%n", ocean.getArea());
	}
    }
}