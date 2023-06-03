/*
File: CFconverter.java
Name: Guohui Wan
Declaration: This is my own original work and is free from Plagiarism.
Modified: 2023, May 17th
Date: 2023, May 16th
Description: A class to convert Celsius to Fahrenheit 
 */
package pkgUnitConverter;

/**
 * general class to call other other class
 * @author wanguohui
 */
public class UnitConverter {
    /**
    * @param unit is the general variable for the converter strategy
    * @param Converter is the interface we used to approach the implement class
    */
    private double unit;
    private Converter unitConverter;

    /**
     * no-arg constructor initializes convert behavior/strategy to that of a class converts
     * Celsius to Fahrenheit 
     */
    public UnitConverter(){
		this.unitConverter = new CFconverter();
	}
    /**
     * get method for the unit
     * @return is the variable unit
     */
    public double getUnit(){ 
        return unit; 
    }
    /**
     * convert() will use each class convert() method to finish converting
     * @param u is the unit need to be converted
     */
    public void convert(double u){
		unit = this.unitConverter.convert(u);
	}

    /**
     * this method change convert type
     * @param unitConverter is the behavior type of the converter
     */
    public void changeBehaviourTo(Converter unitConverter){
		// ToDo: Detect and prevent nulls
		this.unitConverter = unitConverter;
	}
    /**
     *
     * @return is the output
     */
    @Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
                builder.append("convert behaviour type: ")
		       .append(unitConverter.convertBehaviourType()+"\n");
		return builder.toString();
	}
//     /**
//     * convertCF() will use the CFconverter class convert() method to finish converting
//     * @param celsius is the unit need to be converted
//     */
//    public void convertCF(double celsius){
//		unit = this.unitConverter.convert(celsius);
//	}
//    /**
//     * convertFC() will use the FCconverter class convert() method to finish converting
//     * @param fahrenheit is the unit need to be converted
//     */
//    public void convertFC(double fahrenheit){
//		unit = this.unitConverter.convert(fahrenheit);
//	}
//    /**
//     * convertKW() will use the KWconverter class convert() method to finish converting
//     * @param kilowatt is the unit need to be converted
//     */
//    public void convertKW(double kilowatt){
//		unit = this.unitConverter.convert(kilowatt);
//	}
//    /**
//     * convertWK() will use the WKconverter class convert() method to finish converting
//     * @param watt is the unit need to be converted
//     */
//    public void convertWK(double watt){
//		unit = this.unitConverter.convert(watt);
//	}
}
