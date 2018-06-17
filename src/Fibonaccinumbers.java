public class Fibonaccinumbers
{
    //Question: how to take off symbol ',' before first number?

    public static void main(String[] args)
    {
        int i =0;
        int j = 1;
        int k;
        int l;
        int m = 10;

        // using for loop method here for next numbers
        for(l=2;l<m;++l)
        { k = i + j;
            System.out.print(" , " + k);
            i = j;
            j = k;
        }
    }
}
