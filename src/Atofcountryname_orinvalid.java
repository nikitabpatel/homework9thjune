import java.util.Scanner;

public class Atofcountryname_orinvalid
{
    public  static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //using scanner

        System.out.println("Enter first letter of city name"); // so user can choose first letter
        char city = scanner.next().charAt(0); // allow user to enter letter

        // if else method
        if ((city >= 'f')||(city >='F')) // it could be lower or upper case
        {System.out.println("Invalid entry");} /*so user won't able to enter any other city name
        which don't start from a to f.*/
        else{System.out.println("Enter your city name");}
        char cityname = scanner.next().charAt(0);
    }
}
