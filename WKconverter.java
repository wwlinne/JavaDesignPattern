/*
File: WKconverter.java
Student Name: Guohui Wan
Student Number: 041059351
Course & Section: 23S_CST8288_021
Professor: Siju Philip
Declaration: This is my own original work and is free from Plagiarism.
Modified: 2023, May 16th
Date: 2023, May 16th
Description: A class to convert watt to kilowatt
 */
package pkgUnitConverter;

/**
 * class to convert watt to kilowatt
 * @author wanguohui
 */
public class WKconverter implements Converter{
        /**
	 * @param convFactor is the factor between watt and kilowatt
	 */
        private final double convFactor=1000;
        /**
	 * @param watt value in watt to be converted
	 * @return equivalent in kilowatt
	 */
        @Override
	public double convert(double watt) {
		return watt/convFactor ;
	}
     /**
     *
     * @return is the converter type
     */
    @Override
	public String convertBehaviourType(){
		return "WKconverter";
	}
}
