import java.util.Scanner;

public class Valuenumbsymbolalpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner

        System.out.println("Enter any number or letter of symbol");
        char ch = scanner.next().charAt(0);

        if ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'))// upper or lower case value
        {
            System.out.println("It's a character");
        } else if ((ch >= '0' && ch <= '9') || (ch <= '0')) // it could be minus or plus number
        {
            System.out.println("It's a Number");
        } else {
            System.out.println("It's a symbol");
        } /* it working only for selected symbol why?
                         it working for £, @ but not for other symbol*/
    }
}
