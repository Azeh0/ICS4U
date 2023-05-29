import java.io.*;
import java.util.Scanner;

public class QuizOfArrays {
  
  
  public static void main(String[] args)throws IOException { 
    
   Scanner MyInput = new Scanner(System.in); 
  
  BufferedReader TheInptFlA = new BufferedReader (new FileReader("Q2_NumbersA.txt"));
  
  BufferedReader TheInptFlB = new BufferedReader (new FileReader("Q2_NumbersB.txt"));
  
  BufferedWriter TheOtptFl = new BufferedWriter (new FileWriter("ResultQ.txt"));
  
  PrintWriter aPrtWrtr = new PrintWriter (TheOtptFl);
  
  double QNumbers_A[] = new double[250];
  double QNumbers_B[] = new double[250];
  double SUM_AB[] = new double [250];
  String TempA;
  String TempB;
  int fCnt=0; 
  int Sum = 0;
  
 while ((TempA = TheInptFlA.readLine()) != null && (TempB = TheInptFlB.readLine()) != null) 
 {
        QNumbers_A[fCnt] = Integer.parseInt(TempA);
        
        QNumbers_B[fCnt] = Integer.parseInt(TempB);
        
        SUM_AB[fCnt] = QNumbers_A[fCnt] + QNumbers_B[fCnt];
        
       // System.out.println("SumT = " + SUM_AB[fCnt]);
        
        fCnt = fCnt + 1;
      }
 
  
  for (int Outter = 0; Outter < SUM_AB.length ; Outter++)
    {
      for (int Inner = Outter +1; Inner < SUM_AB.length; Inner++ )
        { 
          if (SUM_AB[Inner] > SUM_AB[Outter])
          {
            double douTemp = SUM_AB[Inner];
            SUM_AB[Inner] = SUM_AB[Outter];
            SUM_AB[Outter] = douTemp;  
          }
         }
      
     }
 
     for (int k = 0; k < SUM_AB.length; k++)                               
  {
    aPrtWrtr.println("SumS = " + SUM_AB[k]);
  //  System.out.println(SUM_AB[k] + " ");
  }
 
 TheInptFlA.close();
  TheInptFlB.close();
  TheOtptFl.close();
  
  System.out.println("Enter value to find");
    int search = MyInput.nextInt();
 
    int first  = 0;
    int last   = SUM_AB.length - 1;
    int middle = (first + last)/2;
   
   while( first <= last )
   {
     
     if ( SUM_AB[middle] == search ) 
      {
       System.out.println(search + " found at location " + (middle + 1) + ".");
       break;
      }
     
     else if (SUM_AB[middle] > search )
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
