package edu.nyu.cs9053.homework4.hierarchy;

/**                                                                               
 * an abstract class {@code Lake} extends from {@literal BodyOfWater - FreshWater}
 * @author Hongjian Su 
 * @version 1.0
 */
public abstract class Lake extends FreshWater {

    public Lake(String name, double volume) {
        super(name, volume);
    }

}