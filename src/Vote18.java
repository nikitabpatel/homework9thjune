import java.util.Scanner;

public class Vote18 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);// using scanner

        System.out.println("Enter your age");
        int i = scanner.nextInt(); // int scanner syntax because age would be in number

        // if else syntax
        if (i>=18)
        { System.out.println("You are eligible to vote");}
        else{ System.out.println(" You must be over 18 to be eligible");}
    }

}