import java.io.*; 
 
public class StringBubbleSort {

   public static void main(String args[]) throws IOException 

   {     

      

      String[] strCar = new String[110];     //Make this an array of cars  
      int[] strCarCnt = new int[110];
     int intCounter=0; 
      
     String strTemp; 

      

     BufferedReader ThisIsMyInputFile = new BufferedReader(new FileReader("cars.txt"));   

        

     //strCar[intCounter] = ThisIsMyInputFile.readLine(); 

         

     while ( (strCar[intCounter] = ThisIsMyInputFile.readLine())  !=   null) 

            { 
               int sub = strCar[intCounter].indexOf(" ");
                // System.out.println( intCounter + strCar[intCounter] ); 
                String brand = strCar[intCounter].substring(0, sub);
                 strCar[intCounter] = strCar[intCounter].toUpperCase();
                 intCounter++; 

            } 

               

    ThisIsMyInputFile.close(); 

    // Duplicate remover
    for (int outterD = 0; outterD < intCounter; outterD++) 
    {
      for (int InnerD = outterD + 1; InnerD < intCounter; InnerD++) 
      {
         if (strCar[outterD].equals(strCar[InnerD])) 
         {
            for (int DupCheck = InnerD; DupCheck < intCounter - 1; DupCheck++) 
            {
               strCar[DupCheck] = strCar[DupCheck + 1];
            }
            intCounter--;
            InnerD--;
         }
      }
   }

    //System.out.println("Bubble Sort");

   
  
    for (int Outter = 0; Outter < intCounter ; Outter++) 

      { 

        for (int Inner = Outter +1; Inner < intCounter; Inner++ ) 

          {  
            //reverse order
          //  if (strCar[Inner].compareTo(strCar[Outter])>0) 
          
            if (strCar[Inner].compareTo(strCar[Outter])<0)   

            { 

              strTemp = strCar[Inner]; 

              strCar[Inner] = strCar[Outter]; 

              strCar[Outter] = strTemp;   

            } 

           } 

       } 

     
    for (int z = 0; z < 100; z++) 

   { 

        // System.out.println(strCar[z]);  

   } 

  
     

         


    /* e)  Output a Count the number of each car brand (Ford, Honda, Nissan...) */
         
   
   
    for (int k = 0; k < intCounter; k++) {
      String brand = strCar[k];
      
      for (int x = 0; x < intCounter; x++) {
          if (strCar[x].equals(brand)) {
            strCarCnt[x]++;
          }
      }
  }
  
  // Print the results
  for (int a = 0; a < intCounter; a++) {
      String brand = strCar[a];
      int count = strCarCnt[a];
      if (brand != null && count > 0) {
          System.out.println(brand + ": " + count);
      }
   }



   
}

}