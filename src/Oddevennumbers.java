public class Oddevennumbers
{
    public static void main(String[] args)
    {
        System.out.println("Even Numbers = "); // for giving title to number series

        // for loop method
        for (int i = 0; i <= 70; i++)
            if (i % 2 == 0)
                System.out.print(i + " ,");

        System.out.println(); // so it can print to next line

        System.out.println("Odd Numbers = "); // for giving title

        // for loop method
        for (int j = 0; j <= 70; j++)
            if (j % 2 != 0)
                System.out.print(j + ", ");
    }
}
