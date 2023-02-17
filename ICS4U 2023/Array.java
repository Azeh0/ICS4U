
import java.util.Scanner;

public class Array {
  
  
  public static void main(String[] args) { 
    
    Scanner Keyboard = new Scanner(System.in);
   /* #1a. Input 10 number, output the numbers 
    int cnt;
    
    int [] MyArray = new int[10];
    
    for(cnt = 0; cnt < 10; cnt++)
    {
      
    MyArray[cnt] = Keyboard.nextInt();
    
    }
   
   
   for(cnt = 0; cnt < 10; cnt++)
    {
      
     System.out.println(MyArray[cnt]);
    
    }

   /* b. output the values in reverse order. 
      
    for(cnt = 9; cnt >=0; cnt--)
    {
      
      System.out.println(MyArray[cnt]);
      
    }
    
    
   /*  c. output the average 
      
    double average;  
    double sum = 0;
    for(cnt = 0; cnt < 10; cnt++)
    {
      sum = sum + MyArray[cnt];
    }
  
    average = sum / 10;
    
    System.out.println("The average is: " + average);  */
    
   /* #2a). initialize array size 20 to all zeros, to (0,0,0,0,...), */
    
   int [] ArrayZe = new int[20];
   
   int aze;
   
   for( aze = 0; aze < ArrayZe.length; aze++)
   {
     System.out.println(ArrayZe[aze]);
   }
    
   /*  b)  (1,2,3,1,2,3,1,2,3....)*/
   
       for(aze = 0; aze < ArrayZe.length; aze++) 
       {
       ArrayZe[aze] = (aze % 3) + 1;
       System.out.println(ArrayZe[aze]);
      }
    
   /* #3 store the first 20 prime numbers into an array.*/
       
       int [] ArrayPr = new int [20];
         int vedo;
         for(vedo = 0; vedo < ArrayPr.length; vedo = vedo + 1 ) 
       {
       if(vedo % 2 > 0)
       {
             
         System.out.print(ArrayPr[vedo] + " ");
       
       }
       
    }
       
   
         
    
   /*  #4 Create an array with 100 Random numbers (between 1 and 200) */
    
    
   /* a)What is the highest number, */
  
    
   /*  b)Sum the odd values */
  
    
   /* c) what is the most common value */
  
    
    
    
    
    
    
  }
 
}
