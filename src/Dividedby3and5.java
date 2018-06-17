public class Dividedby3and5
{
    public static void main(String[] args)
    {
        System.out.println("Divided by 3 = "); // for title

        for (int i = 0; i <= 100; i++) // for loop method syntax
            if (i % 3 == 0) //if we can divide by 3 or not
                System.out.print(i + " ,"); // to print and using symbol ',' to seprate each number.

        System.out.println();// println so it make another line for dividing by 5

        System.out.println("Divided by 5 = "); // for title

        for (int j = 0; j <= 100; j++)
            if (j % 5 == 0) //divide by 5 and == is to check condition
                System.out.print(j+ ", ");
    }

    }