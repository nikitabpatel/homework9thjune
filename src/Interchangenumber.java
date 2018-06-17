import java.util.Scanner;

public class Interchangenumber
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers for A and B = \n "); ///n for inserting new line between A and B

        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.print("B = ");
        int b = scanner.nextInt();

        int i;
        i = a;
        a = b;
        b = i; // for changing the number

        System.out.print("Your Interchanged Numbers are, = \n"); //for title

        System.out.println("A = " +a);
        System.out.print("B = " +b);
    }
}
