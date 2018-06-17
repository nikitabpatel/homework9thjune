public class Primenumbers
{
    public static void main(String[] args)
    {
        int i, j, k;
        System.out.println("Prime Numbers are, "); //giving title

        //for loop method 2 times inside one
        for (i = 2; i <= 100; i++) {
            k = 0;

            //if any numbers devides by 2 it can not be prime number.
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    k = 1;
                    break; // to break inner loop
                }
            }
            if (k == 0)
                System.out.print(i + ", ");
        }
    }
}
