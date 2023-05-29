/**
 * Auto Generated Java Class.
 */
public class BubbleSort {
  
  
  public static void main(String[] args) { 
    
     long[] douMyArray = new long[100000];     
    int Inner, Outter, cnt , SwapCnt = 0;         
    long douTemp; 
    for (cnt = 0 ; cnt < douMyArray.length; cnt++) 
    { 
      douMyArray[cnt] = cnt;       
    }
// Save the start time 
    long startTime = System.currentTimeMillis();   //Start 
    for (Outter = 0; Outter < douMyArray.length-2 ; Outter++) 
    { 
        for (Inner = Outter +1; Inner < douMyArray.length-1; Inner++ ) 
          {  
            if (douMyArray[Inner] > douMyArray[Outter]) 
            { 
              //count num os swaps 
              SwapCnt = SwapCnt +1; 
              douTemp = douMyArray[Inner]; 
              douMyArray[Inner] = douMyArray[Outter]; 
              douMyArray[Outter] = douTemp;   
            } 
          } 
       } 
//Save End Time 
    long endTime   = System.currentTimeMillis(); 
//Calc toatal Time to process the sort.     
long totalTime = endTime - startTime; 
System.out.println("Time in Millisec:  " + totalTime); 
System.out.println("Number of Swaps:  " + SwapCnt); 

   /*   System.out.println("Sorted"); 
      for (int i = 1; i <10; i++)                              //  for (int i = 1; douMyArray.length; i++) 
         { 
           System.out.println(douMyArray[i]); 
         } 
   */ 

 

   } 

} 


