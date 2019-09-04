import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args)
    {
        double nauticalMilesValue;
        double milesConverted;
        double kilometersConverted;
        final double ONE_KILOMETERS = 1.852;
        final double ONE_MILE = 1.150779;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the nautical mile value here >>> ");
        nauticalMilesValue = inputDevice.nextDouble();

        milesConverted = nauticalMilesValue * ONE_MILE;
        kilometersConverted = nauticalMilesValue * ONE_KILOMETERS;

        System.out.println("Nautical Miles converted to miles is " + milesConverted + " miles." +
                "\nNautical Miles converted to kilometers is " + kilometersConverted + " kilometeres.");



    }
}
