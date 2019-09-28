package edu.nyu.cs9053.homework4.hierarchy;

public class Tarn extends Lake {

    private final String whichMountain;

    public Tarn(String name, double volume, String whichMountain) {
        super(name, volume);
	this.whichMountain = whichMountain;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tarn that = (Tarn) obj;
        return (getName() == null ? that.getName() == null : getName().equals(that.getName()))
            && getVolume() == that.getVolume()
            && (whichMountain == null ? that.whichMountain == null : whichMountain.equals(that.whichMountain));
    }

    @Override public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        long volumeLong = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (volumeLong ^ (volumeLong >>> 32));
        result = 31 * result + (whichMountain != null ? whichMountain.hashCode() : 0);
        return result;
    }
}