import java.util.Scanner;

public class Dayweek
{
    public static void main(String[]args)
    {
        //scanner syntax so allow user to enter.
        Scanner scanner = new Scanner(System.in);

        // there are 7days in a week so allowing user to enter only 1 to 7 number.
        System.out.println(" Enter any number of day to see day of the week,");

        int i = scanner.nextInt();

        //if else ladder for selection
        if (i == 1 )
        {System.out.println("First day of the week is Sunday");}
        else if( i == 2)
        {System.out.println("Second day of the week is Monday");}
        else if ( i == 3)
        {System.out.println("Third day of the week is Tuesday");}
        else if ( i == 4)
        {System.out.println("Fourth day of the week Wednesday");}
        else if ( i == 5)
        {System.out.println("Fifth day of the week is Thursday");}
        else if ( i == 6)
        {System.out.println("Sixth day of the week is Friday");}
        else if ( i == 7)
        {System.out.println("Seventh day of the week is Saturday");}
        else {System.out.println("Invalid entry");}
    }
}
