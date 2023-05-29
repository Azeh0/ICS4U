import java.util.Scanner;

public class ifStatement {
    
    
    public static void main(String[] args) {

        Scanner KB = new Scanner(System.in);

        /* Input 3 numbers and output them in order */

        int a;
        int b;
        int c;

        System.out.println("Enter Number 1: ");
     
        a = KB.nextInt();

        System.out.println("Enter Number 2: ");

        b = KB.nextInt();

        System.out.println("Enter Number 3: ");

        c = KB.nextInt();

        if(a > b)
        {
            System.out.println("The Greatest Number is: " + a);
        }
        else if (b > c)
        {
            System.out.println("The Greatest Numbere is: " + b);
        }
        else 
        {
            System.out.print("The Greatest Number is: " + c);
        }
        
        
        /* Input 5 marks and give a grade A to 100 to 80, B 70 to 80, C 60 to 70, D 50 to 60 */

        int Num ;
    
        double Total, mark;
    
        Total = 0 ;
    
      

        System.out.println("Input Your Numbers");
        for( int cnt = 0 ; cnt<5 ; cnt++)
         {
     
         Num = KB.nextInt();
         Total = Total + Num ;
      
         }
         mark = Total / 5 ;

         if (mark >= 0  &&  mark <=49) 
         { 
             
            System.out.println("Your mark is an D"); 

         } 
        else if (mark >= 50 && mark < 59) 
        { 
            
            System.out.println("Your mark is an C");

        } 
        
        else if (mark >= 60 && mark < 70) 
        { 
            
            System.out.println("Your mark is an B");

        } 
        else if (mark >= 80 && mark < 999) 
        { 
            
            System.out.println("Your mark is an A");

        }
    }
}