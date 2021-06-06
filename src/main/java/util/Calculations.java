package util;

public class Calculations {
    static final int CONVERSION_FACTOR = 350;

    static public double calcArea(double length, double width) {
        return length * width;
    }
    static public int  calculateGallons(double area) {
        double gallons = Math.ceil(area / CONVERSION_FACTOR);
        return (int)gallons;
    }
}
