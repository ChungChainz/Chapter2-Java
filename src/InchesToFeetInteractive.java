import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args)
    {
        int inchesEntered;
        int numFeet;
        int numInches;
        final int INCHES_TO_FEET = 12;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the amount of inches here >>> ");
        inchesEntered = inputDevice.nextInt();

        numFeet = inchesEntered / INCHES_TO_FEET;
        numInches = inchesEntered % INCHES_TO_FEET;

        System.out.println(inchesEntered + " inches converts to " + numFeet + " feet and " + numInches + " inches.");
    }
}
