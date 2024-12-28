import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        
        int n, i ,j;
      int status = 1;
      int num = 3;
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      n = scanner.nextInt();
      if (n >= 1)
      {
         System.out.println("First "+n+" prime numbers are:");
         System.out.print(" "+2+" ");
      }

      for ( i = 2 ; i <=n ;)
      {
         for ( j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            System.out.print(" "+num+" ");
            i++;
             if (i % 6 == 0) {
                 System.out.print("\n"+"");
             }
  
         }
         status = 1;
         num++;
      }         
    }
}
