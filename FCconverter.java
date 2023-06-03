/*
File: FCconverter.java
Name: Guohui Wan
Declaration: This is my own original work and is free from Plagiarism.
Modified: 2023, May 17th
Date: 2023, May 16th
Description: A class to convert Celsius to Fahrenheit 
 */
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author kriger
 */
public class FCconverter implements Converter{
        /**
	 * @param convFactor is the factor between Celsius and Fahrenheit
         * @param convOrigin is the basic degree
	 */
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
     /**
     *
     * @return is the converter type
     */
    @Override
	public String convertBehaviourType(){
		return "FCconverter";
	}
}
