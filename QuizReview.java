import java.io.*;

public class QuizReview {
  
  
  public static void main(String[] args)throws IOException  { 
    
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
  }
}

  

