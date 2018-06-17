import java.util.Scanner;

public class sales
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //for adding scanner

        System.out.println("Enter sale's ID number");
        int i = scanner.nextInt();

        System.out.println("Enter seller's name");
        char name = scanner.next().charAt(0);

        System.out.println("Enter sales amount");
        int j = scanner.nextInt();

        System.out.println("Enter basic salary");
        int k = scanner.nextInt();

        // if else ladder for selection
        if ( k >= 50000)
        {System.out.println("Your commission would be 35% of your basic salary");
            {System.out.println("Total commission = " + ((k *35)/100));}}
            else if (k >= 30000)
        {System.out.println("Your commission would be 20% of your basic salary");
            {System.out.println("Total commission = " + ((k *20)/100));}}
            else if (k >= 20000)
        {System.out.println("Your commission would be 10% of your basic salary");
            {System.out.println("Total commission = " + ((k *10)/100));}}
            else if (k>= 10000)
        {System.out.println("Your commission would be 5% of your basic salary");
            {System.out.println("Total commission = " + ((k *5)/100));}}
            else
        {System.out.println("Your commission would be 2% of your basic salary");
            {System.out.println("Total commission = " + ((k *2)/100));}}
    }
}
