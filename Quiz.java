import java.io.*;
import java.util.Scanner;
public class Quiz {
  
  
  public static void main(String[] args)throws IOException  { 
    
  Scanner MyInput = new Scanner(System.in); 
  
  BufferedReader TheInptFl = new BufferedReader (new FileReader("Q2_NumbersA.txt"));
  
  BufferedWriter TheOtptFl = new BufferedWriter (new FileWriter("Result.txt"));
  
  PrintWriter aPrtWrtr = new PrintWriter (TheOtptFl);
  
  int Data[] = new int[250];
  int ArPrime[] = new int [250];
  String Temp;
  boolean Prime=false;
  int a=0, pCnt = 0;
  Double Average, Sum = 0.0;
  
  while( (Temp = TheInptFl.readLine()) != null)
  {
    Data[a] = Integer.parseInt(Temp);
      System.out.println(Data[a]);
      
      if (Data[a] > 20 && Data[a] < 50)
      {Sum = Sum + Data[a];
      }
      
      
      Prime = true;
      if (Data[a] != 0)
      {
        for (int z=2; z <= (Data[a]/2); z++)
        {
          if(Data[a]% z == 0)
          {
            Prime = false;
            
          }
        }
          if (Prime)
          {
            ArPrime[pCnt] = Data [a];
            System.out.println("Prime = " + Data[a]);
              
              aPrtWrtr.println("Prime = " + Data[a]);
          }
        }
      
      a= a+1;
  }
  Average = Sum/a;
  System.out.println(Sum + " Avergae = " + Average);
  aPrtWrtr.println("Avergae = " + Average);  
  
  TheInptFl.close();
  TheOtptFl.close();
  
  for (int i = 0; i < 10; i++)                               
  {
    System.out.println(Data[i] + " ");
    aPrtWrtr.println(Data[i]);
  }
  
  for (int Outter = 0; Outter < Data.length ; Outter++)
    {
      for (int Inner = Outter +1; Inner < Data.length; Inner++ )
        { 
          if (Data[Inner] < Data[Outter])
          {
            int douTemp = Data[Inner];
            Data[Inner] = Data[Outter];
            Data[Outter] = douTemp;  
          }
         }
     }
 
     for (int k = 0; k < Data.length; k++)                               
  {
    System.out.println(Data[k] + " ");
  }
 
 
  System.out.println("Enter value to find");
    int search = MyInput.nextInt();
 
    int first  = 0;
    int last   = Data.length - 1;
    int middle = (first + last)/2;
   
   while( first <= last )
   {
     
     if ( Data[middle] == search ) 
      {
       System.out.println(search + " found at location " + (middle + 1) + ".");
       break;
      }
     else if (Data[middle] < search )
      {
       first = middle + 1;  
       System.out.println(middle);
      }
     else
       {
        last = middle - 1;
         System.out.println(middle);
       }
    middle = (first + last)/2;
   }
    if ( first > last )
      System.out.println(search + " isn't present in the list.\n");
    
  }
}

  