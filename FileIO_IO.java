import java.io.*; 

 

public class FileIO_IO { 

 

   public static void main(String[] args) throws IOException 

   {   

     int intStrComp; 

     int intRecordCount = 0; 

     int intCount = 0; 

     int cnt; 

    String[] strCar = new String[100];    

     

     BufferedReader InputFile = new BufferedReader(new FileReader("cars2012.txt"));   

     BufferedWriter OutputFile = new BufferedWriter(new FileWriter("Top5cars2012.txt"));   

     

    strCar[1] = InputFile.readLine(); 

           

     PrintWriter MyPrintWriter = new PrintWriter(OutputFile); 

        

     for(cnt = 1; cnt<=75; cnt++) 

       { 

        strCar[cnt] = InputFile.readLine(); 

        System.out.println(strCar[cnt]); 

        // OutputFile.write(strCar); 

        MyPrintWriter.println(strCar[cnt]); 

        } 

 

      InputFile.close(); 

      OutputFile.close(); 

          

      System.out.println( "Num = " + cnt ); 

           

     

    }   

 }    