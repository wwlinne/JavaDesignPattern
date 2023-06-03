/*
File: CFconverter.java
Student Name: Guohui Wan
Student Number: 041059351
Course & Section: 23S_CST8288_021
Professor: Siju Philip
Declaration: This is my own original work and is free from Plagiarism.
Modified: 2023, May 17th
Date: 2023, May 16th
Description: A class to convert Celsius to Fahrenheit 
 */
package pkgUnitConverter;
/**
 * class to convert Celsius to Fahrenheit
 * @author kriger
 */
public class CFconverter implements Converter {
        /**
	 * @param convFactor is the factor between Celsius and Fahrenheit
         * @param convOrigin is the basic degree
	 */
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
        @Override
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}
   /**
     *
     * @return is the converter type
     */
    @Override
	public String convertBehaviourType(){
		return "CFconverter";
	}
}
