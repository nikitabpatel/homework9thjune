import java.util.Scanner;

public class PositNegZero
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // using scanner

        System.out.println("Enter a Number");
        int number = scanner.nextInt(); // because of number int

        // using 2 times if else
        if(number <= 0)
        {if(number == 0){System.out.println("It's zero");}
        else {System.out.println(" It's negative number");}}
        else{System.out.println(" It's a positive number");}
    }
}
