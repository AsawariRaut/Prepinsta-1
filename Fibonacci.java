public class Fibonacci
 {
   public static void main (String[]args)
   {

     int num = 15;
     int a = 0, b = 1;


     int c;

     for (int i = 1; i <= num; i++)
       {
       System.out.print (a + " ");
      c = a + b;
      a = b;
      b = c;
          
       }
   }
}

