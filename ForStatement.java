public class ForStatement {
  
  
  
 
  public static void main(String[] args) { 
    
    /*  Output the numbers from 1 to 100 */

     for(int z=0; z <= 100; z=z+1)
     {
       
      System.out.println("Count is: " + z);

     } 
     
     /* Output the even numbers for 1 to 100 */

     int sum = 0; 
     for(int d=0; d <= 100; d= d+ 2)
     {
       
      sum = sum + d;
     } 
     System.out.println("The sum of even numbers for 1 to 100 is: " + sum); 
     
    /*  Output the odd numbers from 1 to 100 */
    
     for(int x=1; x <= 100; x= x + 2)
     {
      
      System.out.println("Count is: " + x);

     } 

    /* Output the sequene 5,10,15,20,25..1000 */

     for(int x=5; x <= 1000; x= x + 5)
     {
       
      System.out.println("Count is: " + x);
  
     }
  
  }
}


