
import java.util.Scanner;
import java.math.*; 

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
      hh
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
    
   /* #2a). initialize array size 20 to all zeros, to (0,0,0,0,...), 
    
   int [] ArrayZe = new int[20];
   
   int aze;
   
   for( aze = 0; aze < ArrayZe.length; aze++)
   {
     System.out.println(ArrayZe[aze]);
   }
    
   /*  b)  (1,2,3,1,2,3,1,2,3....)
   
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
    
    int [] ArrayRa = new int [100];
   
    for(int xx = 0; xx < 100; xx = xx+1) 
    {
      ArrayRa[xx] = (int)(Math.random()*200);
      System.out.print(ArrayRa[xx]);
    }
   /* a)What is the highest number, */
  
  
  int smallest = ArrayRa[0];
  int biggest = ArrayRa[0];
               
  for(int i=1; i< ArrayRa.length; i++)
    {
   if(ArrayRa[i] > biggest)
      biggest = ArrayRa[i];
  else if (ArrayRa[i] < smallest)
       smallest = ArrayRa[i];
                       
  }
    System.out.println("Largest Number is : " + biggest);
   
   /*  b)Sum the odd values */
  
    int ber = 0;
    for (int count = 0; count < 100; count++)
    {
      if(ArrayRa[count] % 2 ==0)
        ber = ber + count;
    }
   System.out.println("Sum of odd is: " + ber);
   /* c) what is the most common value */
    int Mcv = 0;
    int max = 1;  
for (int i = 0; i < ArrayRa.length; i++) {
    int val = ArrayRa[i];
    int cot = 0;
    for (int p = 0; p < ArrayRa.length; p++) {
        if (ArrayRa[p] == val) {
            cot++;
        }
    }
    if (cot > max) {
        max = cot;
        Mcv = val;
    }
}

System.out.println("The most common value is: " + Mcv);
    
    
    
    
    
  }
 
}
