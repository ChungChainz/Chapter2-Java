import java.util.Scanner;

public class RandomGuessMatch {
    public static void main(String[] args){

        int enteredNum;
        final int MAX = 5;
        final int MIN = 1;
        int random = MIN +(int)(Math.random()*MAX);
        boolean correct = false;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter a random number between 1 to 5 here >>> ");
        enteredNum = inputDevice.nextInt();

        if(enteredNum > random)
        {
            System.out.println("This is " + correct + ". Your guess is higher than the random number!");
        }
        else if (enteredNum == random)
        {
            correct = true;
            System.out.println("This is " + correct + ". Your answer is correct!");
        }
        else
        {
            System.out.println("This is " + correct + ". Your guess is lower than the random number!");
        }
    }
}
