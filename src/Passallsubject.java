import java.util.Scanner;

public class Passallsubject
{
    public static void main(String[] args) {

        int a, b, c, total;

        Scanner scanner = new Scanner(System.in); // using scanner

        System.out.println("Enter student name");
        String name = scanner.next(); // student name in letters so string

        System.out.println("Enter Roll number");
        int rollnumber = scanner.nextInt(); // because of number int

        System.out.println("Enter the marks of 3 subject");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt(); // asking user to enter marks

        total = a + b + c; // to find out total marks
        System.out.println("Total = " + total); // print total marks

        //if else ladder to give pass or fail from all subjects
        if (a <= 35) {
            System.out.println("Fail");
        } else if (b <= 35) {
            System.out.println("Fail");
        } else if (c <= 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
    }
}
