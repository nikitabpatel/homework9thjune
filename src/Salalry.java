import java.util.Scanner;

public class Salalry
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // using scanner

        System.out.println("Enter your Employee ID in numbers");
        int ID = scanner.nextInt(); // for user to enter ID

        System.out.println("Enter your Name");
        char name = scanner.next().charAt(0); // Name would be in character so using char

        System.out.println("Enter your basic salary");
        int salary = scanner.nextInt();

        int i = salary*10/100; //calculation for salary
        int j = salary*8/100;
        int k = salary*9/100;
        int l = salary*20/100;
        int total = salary+i+j+k-l;

        System.out.println("HRA = " + i);
        System.out.println("DA = " + j);
        System.out.println("TA = " + k);
        System.out.println("PF = " + l);

        System.out.println("Gross salary = " + total);
    }
}
