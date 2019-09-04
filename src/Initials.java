import java.util.Scanner;

public class Initials {
    public static void main(String[] args)
    {
        String firstInitial;
        String secondInitial;
        String thirdInitial;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter your first name initial here >>> ");
        firstInitial = inputDevice.nextLine();

        Scanner inputDevice2 = new Scanner(System.in);
        System.out.print("Enter your middle initial here >>> ");
        secondInitial = inputDevice2.nextLine();

        Scanner inputDevice3 = new Scanner(System.in);
        System.out.print("Enter your last name initial here >>> ");
        thirdInitial = inputDevice3.nextLine();

        System.out.println(firstInitial + "." + secondInitial + "." + thirdInitial);
    }
}
