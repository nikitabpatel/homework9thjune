import java.util.Scanner;

public class Vowelorconstant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //using scanner

        System.out.println("Enter any single character,");
        char character =  scanner.next().charAt(0); //asking user to enter character

        // if else ladder
        if ((character=='a')||(character == 'A')) //logical operator so both can be true
        {System.out.println("It's a Vowel");}
        else if ((character=='e')||(character == 'E'))
        {System.out.println("It's a Vowel");}
        else if ((character == 'i')||(character == 'I'))
        {System.out.println("It's a Vowel");}
        else if ((character== 'o')||(character== 'O'))
        {System.out.println("It's a Vowel");}
        else if ((character == 'u')||(character== 'U'))
        {System.out.println("It's a Vowel");}
        else if ((character >= 'a')||(character >= 'A'))
        {System.out.println("It's a consonant");}
        else{System.out.println("It's not a Character");}
    }
}
