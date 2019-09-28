package edu.nyu.cs9053.homework4.hierarchy;

public class Sea extends Ocean {

    private final String address;

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
	long volumeLong = Double.doubleToLongBits(getVolume());
	result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
	result = 31 * result + (address != null ? address.hashCode() : 0);
	return result;
    }
}