package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input =  new Scanner(System.in);

    static public double readLength(String type) {
        System.out.format("What is the %s of the room? ", type);
        return input.nextDouble();
    }
}
