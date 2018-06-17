import java.util.Scanner;

public class Leapyear
{
    public static void main(String[] args)
    {
        boolean leap; // using boolean for true and false

        Scanner scanner = new Scanner(System.in); // using scanner

        System.out.println("Enter a year");
        int i = scanner.nextInt();

        if(i%4==0) // if user entered year divided by 4 its a leap year
            {leap = true;
            System.out.println(i + " is a leap year");} // so if its true it will print this
        else{
            leap = false;
            System.out.println(i + " is not a leap year"); // if wrong it will print this
        }
    }
}
