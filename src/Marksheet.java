import java.util.Scanner;

public class Marksheet{

        public static void main(String[] args){

            int a, b, c, total;
            double per; // percentage could be in points so using double

            Scanner scanner = new Scanner(System.in); // using scanner

            System.out.println("Enter student name"); // asking to user
            String name = scanner.next(); // as name will be in letters i am using string scanner syntax here

            System.out.println("Enter Roll number");
            int rollnumber = scanner.nextInt(); // roll number would be in number so int

            System.out.println("Enter the marks of 3 subject");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt(); // so user can enter marks one by one

            total = a + b + c;  // for total of all 3 subjects

            per = (total/300.0)*100; // to find out percentage total achieved number dividing from total and multiply by 100

            System.out.println("Total marks " + total); // it will print total
            System.out.println("Percentage " + per); // print percentage

             // if else to find out pass or fail
            if (per >= 35)
            {System.out.println("Pass");}
            else{System.out.println("Fail");}

            // using if else ladder to find out grades
            if (per>=80)
            {System.out.println("Grade A+");}
            else if (per>=60)
            {System.out.println("Grade A");}
            else if (per>=50)
            {System.out.println("Grade B");}
            else if (per>=35)
            {System.out.println("Grade C");}
            else{System.out.println("Fail");}
        }
    }
