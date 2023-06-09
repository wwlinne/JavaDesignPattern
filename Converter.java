/*
File: Converter.java
Name: Guohui Wan
Declaration: This is my own original work and is free from Plagiarism.
Modified: 2023, May 17th
Date: 2023, May 16th
Description: A class to convert Celsius to Fahrenheit 
 */
package pkgUnitConverter;

/**
 * consistent interface for converter behaviors/strategies
 * @author wanguohui
 */
public interface Converter {
    	// all interface methods are public abstract by default
    /**
     * an abstract convert() method will be implemented by other class
     * @param unit is the variable for the convert method
     * @return is the result
     */
	public double convert(double unit);
    /**
     * an abstract method can change convert type will be implemented by other class
     * @return is the convert type
     */
    public String convertBehaviourType();

}

