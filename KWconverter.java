/*
File: KWconverter.java
Student Name: Guohui Wan
Student Number: 041059351
Course & Section: 23S_CST8288_021
Professor: Siju Philip
Declaration: This is my own original work and is free from Plagiarism.
Modified: 2023, May 17th
Date: 2023, May 16th
Description: A class to convert kilowatt to watt
 */
package pkgUnitConverter;

/**
 * class to convert kilowatt to watt
 * @author wanguohui
 */
public class KWconverter implements Converter {
        /**
	 * @param convFactor is the factor between watt and kilowatt
	 */
    	private final double convFactor=1000;

        /**
	 * @param kilowatt value in kilowatt to be converted
	 * @return equivalent in watt
	 */
        @Override
	public double convert(double kilowatt) {
		return kilowatt*convFactor ;
	}
     /**
     *
     * @return is the converter type
     */
    @Override
	public String convertBehaviourType(){
		return "KWconverter";
	}
}
