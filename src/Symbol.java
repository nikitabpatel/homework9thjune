import java.util.Scanner;

public class Symbol
{
    public static void main(String[] args)
    {
        int total;
        Scanner scanner = new Scanner(System.in); // using scanner

        System.out.println("Enter a number");
        int i = scanner.nextInt(); // int scanner syntax because of number

        System.out.println("Enter another number");
        int j = scanner.nextInt();

        System.out.println("Enter your symbol for action from +, -, *, / ");
        char symbol = scanner.next().charAt(0); // because of symbol char scanner syntax

        //if else ladder for selection of symbol
        if (symbol == '+')
        { total = i + j;
        System.out.println("Result = " + total);}
        else if (symbol == '-')
        { total = i - j;
        System.out.println("Result = " + total);}
        else if(symbol == '*')
        { total = i * j;
        System.out.println("Result = " + total);}
        else if (symbol == '/')
        { total = i/j;
        System.out.println("Result = " +total);}
        else
        { System.out.println("Wrong entry");} // if user enter any other symbol
    }
}
