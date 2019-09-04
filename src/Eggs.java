import java.util.Scanner;

public class Eggs {
    public static void main(String[] args)
    {
        double eggsOrdered;
        double dozenEggs;
        double looseEggs;
        double dozenEggTotal;
        double looseEggTotal;
        double totalPrice;
        final double DOZEN_EGG_PRICE = 3.25;
        final double LOOSE_EGG_PRICE = .45;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter amount of eggs you want to order here >>> ");
        eggsOrdered = inputDevice.nextDouble();

        dozenEggs = eggsOrdered / 12;
        looseEggs = eggsOrdered % 12;

        dozenEggTotal = dozenEggs * DOZEN_EGG_PRICE;
        looseEggTotal = looseEggs * LOOSE_EGG_PRICE;
        totalPrice = dozenEggTotal + looseEggTotal;

        System.out.println("You ordered " + eggsOrdered + " eggs. That's " + dozenEggs + "dozen eggs at $" + DOZEN_EGG_PRICE + "and" +
        "\n" + looseEggs + " loose eggs at " + LOOSE_EGG_PRICE + " cents each for a total of " + totalPrice + ".");

    }
}
