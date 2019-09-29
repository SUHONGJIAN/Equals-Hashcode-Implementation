package edu.nyu.cs9053.homework4.hierarchy;

/**                                                                                              
 * a concrete class {@code Sea} extends from {@literal BodyOfWater - SaltWater - Ocean}      
 * @author Hongjian Su                                                                           
 * @version 1.0                                                                                  
 */
public class Sea extends Ocean {

    private final String address;  //a specific instance field for type Sea.

    public Sea(String name, double volume, String address) {
        super(name, volume);
	this.address = address;
    }

    @Override public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null || getClass() != obj.getClass()) {
	    return false;
	}
	Sea that = (Sea) obj;
	return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
	    && getVolume() == that.getVolume()
	    && (address == null ? that.address == null : address.equals(that.address));
    }

    @Override public int hashCode() {
	int result = getName() != null ? getName().hashCode() : 0;
	long volumeLong = Double.doubleToLongBits(getVolume());   //transform double to long.
	result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));   //transform long to int and sum up.
	result = 31 * result + (address != null ? address.hashCode() : 0);
	return result;
    }
}