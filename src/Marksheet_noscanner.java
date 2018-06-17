
public class Marksheet_noscanner{

    public static void main(String[] args){

        System.out.println("Roshni"); // print student name

        int i = 3; // declaring roll number
        System.out.println("Roll number " + i); // print roll number

        // declairing marks
        int a = 55;
        int b = 60;
        int c = 65;
        double per = 60; // percentage might in points if different numbers so using double

        System.out.println("Maths " + a); // it prints marks of maths
        System.out.println("English " + b);
        System.out.println("Science " + c);

        System.out.println("Total " + (a+b+c) + " (Out of 300"); //print total marks

        System.out.println("percentage " + ((a+b+c)/300.0)*100); // print percentage

        // using if else ladder for grade
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
