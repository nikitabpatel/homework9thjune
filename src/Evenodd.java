import java.util.Scanner;

public class Evenodd
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // using scanner

        System.out.println("Enter a Number"); // asking user to enter a number
        int i = scanner.nextInt(); // letting user enter number and as its number using this syntax

        //if divide by 2 its even number and using ?: turnary operator here for select even or odd
        String evenodd = (i%2==0)?"even":"odd";

        System.out.println(i + " is " + evenodd);

    }
}
