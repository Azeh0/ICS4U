/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Average {
  
  
  public static void main(String[] args) { 
   
    Scanner Keyboard = new Scanner(System.in);
    
    int Num ;
    
    double Total, Average;
    
    Total = 0 ;
    
    Average = 0;
    
    System.out.println("Input Your Numbers");
    for( int cnt = 0 ; cnt<6 ; cnt++)
    {
     
      Num = Keyboard.nextInt();
       Total = Total + Num ;
      
    }
    Average = Total / 6 ;
    System.out.println("Your Average is: " + Average);
    
  }
}
