public class Calculator
{
    //this is homework which gamita gave on saturday for calculator.
   // for substraction
    public static void substraction(int i, int j)
    { System.out.println("substraction of "+i+" , "+j+"  = " +(i-j));}

    // adding two numbers
    public static void addition(int i, int j)
    {System.out.println("addition of  "+i+" , "+j+" = " +(i+j));}

    // for multiplication
    public static void multiplication(int i, int j)
    {System.out.println("multiplication of "+i+" , "+j+" = " + (i*j));}

    // for division
    public void division(int i, int j)
    {System.out.println("division of "+i+" , "+j+" = " +(i/j));}

    //for modulus
    public void modulus(int i, int j)
    {System.out.println("modulus of "+i+" , "+j+" = " +(i%j));}

    // to find out square value
    public static void square(int i)
    {System.out.println("square of "+i+"  = " +(i*i));}

    // to find out cube value
    public void cube(int j)
    {System.out.println("cube of "+j+" = " +(j*j*j));}


    public static void main(String[] args)
    {
        substraction(10, 5);
        addition(10, 5);
        multiplication(10, 5);

        // for calling instance method into main method
        Calculator calculator = new Calculator();

        calculator.division(10,5);

        calculator.modulus(5,50);

        square(10);

        calculator.cube(10);
    }
}

