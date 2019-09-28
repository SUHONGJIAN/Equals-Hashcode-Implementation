public enum OceanName {

    ATLANTIC(106400000.0),

    ARCTIC(14056000.0),

    INDIAN(73556000.0),

    PACIFIC(165250000.0),

    SOUTHERN(20327000.0);
    
    private final double area;

    private OceanName(double area) {
	this.area = area;
    }

    public double getArea() {
	return area;
    }

    public static void print(OceanName ... oceans) {
	for (OceanName ocean: oceans) {
	    System.out.printf("%d%n", ocean.getArea());
	}
    }
}