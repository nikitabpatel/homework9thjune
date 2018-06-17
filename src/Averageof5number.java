import java.util.Scanner;

public class Averageof5number
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);

        // to ask user to enter 5 numbers one by one
        System.out.println("Enter 1st Number");
        int number1 = scanner.nextInt();

        System.out.println("Enter 2nd Number");
        int number2 = scanner.nextInt();

        System.out.println("Enter 3rd Number");
        int number3= scanner.nextInt();

        System.out.println("Enter 4th Number");
        int number4 = scanner.nextInt();

        System.out.println("Enter 5th Number");
        int number5 = scanner.nextInt();

        // total of all 5 numbers divided by 5 for average
        System.out.println("Total Average = " + (number1 + number2 + number3 + number4 + number5)/5);


    }

}
