package util;

public class Output {
    static public void printOutput(int gallons, double area) {
        System.out.format("You will need to purchase %d gallons of paint to cover %.2f square feet.", gallons, area);
    }
}
