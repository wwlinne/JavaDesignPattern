/*
File: UnitConverterTest.java
Student Name: Guohui Wan
Student Number: 041059351
Course & Section: 23S_CST8288_021
Professor: Siju Philip
Declaration: This is my own original work and is free from Plagiarism.
Modified: 2023, May 18th
Date: 2023, May 16th
Description: A test class for converter strategy
 */
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * simple class to test 4 classes for converting Celsius to Fahrenheit and the reverse, converting kilowatt to watt and the reverse.
 * @author guohuiwan
 */
public class UnitConverterTest {

    /**
     * this is the test method for 4 different convert methods
     * @param args command line arguments
     */
    public static void main(String[] args) {
		//FCconverter FtoC = new FCconverter();
		//System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, FtoC.convert(70.0));
		
		//CFconverter CtoF = new CFconverter();
		//System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, CtoF.convert(20.0));

                /**
                 * create a new instance for the general class, it is CFconverter by default
                 */
                UnitConverter uc = new UnitConverter();
                uc.convert(20.0);
                System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, uc.getUnit());
                System.out.println(uc);
                /**
                 * change type to FCconverter
                 */
                uc.changeBehaviourTo(new FCconverter());
                uc.convert(70.0);
                System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0,uc.getUnit());
                System.out.println(uc);
                /**
                 * change type to KWconverter
                 */
                uc.changeBehaviourTo(new KWconverter());
                uc.convert(15.3);
                System.out.printf("%.2f in kilowatt is %,.2f watt\n", 15.3,uc.getUnit());
                System.out.println(uc);
                /**
                 * change type to WKconverter
                 */
                uc.changeBehaviourTo(new WKconverter());
                uc.convert(15300);
                System.out.printf("%,d in watt is %.2f kilowatt\n", 15300,uc.getUnit());
                System.out.println(uc);

    }

}
