public class Timetable
{
    public static void main(String[] args)
    {
        // using labelled for loop method here
      a:  for (int i = 5; i<= 5; i++){
      b:  for (int j = 0; j<= 5; j++){
                if (j==6){
                    break b; // to break inner thread of b line
                }
                System.out.println(i +" * " +j+ " = " + (i*j)); // so it can print like time table
            }}
    }
}