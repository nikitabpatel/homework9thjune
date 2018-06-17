import java.util.Scanner;
// saturday homework from gamita of calculator by scanner
public class Calculatorscanner
{
    public static void main(String[] args)
    {
        double result; //result could be in point number so using double

        // using scanner so user can input number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scanner.nextInt();

        System.out.println("Enter another number");
        int b = scanner.nextInt();

        System.out.println("Enter a symbol from +, -, *, / for action");
        char symbol = scanner.next().charAt(0); //because of symbol using char here

        // switch for selection of any 1 of them
        switch (symbol)
        {   case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("You have entered wrong symbol");
                return;
        }
        System.out.println(a+""+symbol+""+b+"="+result);

    }
}
