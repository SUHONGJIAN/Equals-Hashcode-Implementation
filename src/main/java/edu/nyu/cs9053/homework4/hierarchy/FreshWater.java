package edu.nyu.cs9053.homework4.hierarchy;

/**
 * an abstract class {@code FreshWater} extends from {@literal BodyOfWater}
 * @author Hongjian Su
 * @version 1.0
 */
public abstract class FreshWater extends BodyOfWater {

    public FreshWater(String name, double volume) {
        super(name, volume);
    }

}