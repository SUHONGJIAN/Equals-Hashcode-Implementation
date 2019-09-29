package edu.nyu.cs9053.homework4.hierarchy;

/**                                                                                              
 * an abstract class {@code Ocean} extends from {@literal BodyOfWater - SaltWater}          
 * @author Hongjian Su                                                                           
 * @version 1.0                                                                                  
 */
public abstract class Ocean extends SaltWater {

    public Ocean(String name, double volume) {
	super(name, volume);
    }

}