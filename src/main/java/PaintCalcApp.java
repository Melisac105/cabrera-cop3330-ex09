/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */

import util.Calculations;
import util.Output;
import util.UsrInput;

public class PaintCalcApp {

    public static void main(String[] args) {
        double length = UsrInput.readLength("length");
        double width = UsrInput.readLength("width");
        double area = Calculations.calcArea(length, width);
        int gallons = Calculations.calculateGallons(area);
        Output.printOutput(gallons, area);
    }
}
