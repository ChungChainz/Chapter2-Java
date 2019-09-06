import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args)
    {
        String color;
        String wordEst;
        String bodyPart;
        String animal;
        String noun;
        String pluralNoun;

        int a;
        int b;
        int c;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter a color >>> ");
        color = inputDevice.nextLine();
        Scanner inputDevice2 = new Scanner(System.in);
        System.out.print("Enter a word ending in -est >>> ");
        wordEst = inputDevice2.nextLine();
        Scanner inputDevice3 = new Scanner(System.in);
        System.out.print("Enter a large integer number >>> ");
        a = inputDevice3.nextInt();
        Scanner inputDevice4 = new Scanner(System.in);
        System.out.print("Enter a smaller integer number >>> ");
        b = inputDevice4.nextInt();
        Scanner inputDevice5 = new Scanner(System.in);
        System.out.print("Enter a body part (plural) >>> ");
        bodyPart = inputDevice5.nextLine();
        Scanner inputDevice6 = new Scanner(System.in);
        System.out.print("Enter an animal >>> ");
        animal = inputDevice6.nextLine();
        Scanner inputDevice7 = new Scanner(System.in);
        System.out.print("Enter a noun >>> ");
        noun = inputDevice7.nextLine();
        Scanner inputDevice8 = new Scanner(System.in);
        System.out.print("Enter a plural noun >>> ");
        pluralNoun = inputDevice8.nextLine();

        c = a%b;

        System.out.println("The " + color + " Dragon is the " + wordEst + " of them all.");
        System.out.println("It has " + c + " " + bodyPart + ", and a " + animal + " shaped like a " + noun + ".");
        System.out.println("It loves to eat " + pluralNoun + ", although it will feast on nearly anything.");
    }
}
