import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args){
        int monkeys = 5;
        int monkeysEntered;
        int barrel;

        System.out.println("Number of monkeys = " + monkeys);

        barrel = monkeys;

        System.out.println("Number of monkeys in the barrel = " + barrel);
        System.out.println("How many more monkeys do you want to add to the barrel? >>>");
        Scanner inputDevice = new Scanner(System.in);
        monkeysEntered  = inputDevice.nextInt();

        barrel = monkeys + monkeysEntered ;

        System.out.println("There are now " + barrel + " monkeys in the barrel.");
        barrel = barrel/(1 + (int)(Math.random()*10));
        System.out.println("Due to over population and diseases you killed some monkeys\n" +
        "There are now only " + barrel + " monkeys in the barrel. YIKES!");

    }
}
