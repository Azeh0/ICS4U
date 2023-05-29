import java.io.*;

public class StringBubbleSort {

    public static void main(String args[]) throws IOException {

        String[] strCar = new String[110]; // Make this an array of cars
        int[] strCarCnt = new int[110];
        String[] brand = new String[110];
        int intCounter = 0;
        String brands = "a";
        int bcount = 0;

        BufferedReader ThisIsMyInputFile = new BufferedReader(new FileReader("cars.txt"));

        while ((strCar[intCounter] = ThisIsMyInputFile.readLine()) != null) {
            // System.out.println( intCounter + strCar[intCounter] );
            strCar[intCounter] = strCar[intCounter].toUpperCase(); 
            intCounter++;
        }

        ThisIsMyInputFile.close();

        // Remove duplicates
        for (int outterD = 0; outterD < intCounter; outterD++) {
            for (int InnerD = outterD + 1; InnerD < intCounter; InnerD++) {
                if (strCar[outterD].equals(strCar[InnerD])) {
                    for (int DupCheck = InnerD; DupCheck < intCounter - 1; DupCheck++) {
                        strCar[DupCheck] = strCar[DupCheck + 1];
                    }
                    intCounter--;
                    InnerD--;
                }
            }
        }
        //System.out.println(strCar[0]);
        
       // System.out.println("Bubble Sort");

        // Bubble sort
        for (int Outter = 0; Outter < intCounter; Outter++) {
            
            for (int Inner = Outter + 1; Inner < intCounter; Inner++) {
                 
                //reverse order
                //  if (strCar[Inner].compareTo(strCar[Outter])>0) 
                if (strCar[Inner].compareTo(strCar[Outter]) < 0) 
                {
                    String strTemp = strCar[Inner];
                    strCar[Inner] = strCar[Outter];
                    strCar[Outter] = strTemp;
                }
            }
        }

        for (int z = 0; z < intCounter; z++) 
          
         { 
          
        //System.out.println(strCar[z] + z);  

         } 

        for (int f = 2; f < intCounter; f++){
             System.out.println(strCar[f]);
          int sub = strCar[f].indexOf( " " );
             brand[f] = strCar[f].substring(0, sub); // Extract the brand name
        System.out.println(sub);
        System.out.println(brand[f]);
        
        
        if (brand[f].compareTo(brand[bcount]) ==0)
         {
           strCarCnt[bcount] = strCarCnt[bcount]+1 ; 
           //DeBug
           System.out.println ("If Brand at = "+ brand[bcount] + "  Counter[BrdNum] = " +strCarCnt[bcount]);
         }
       else
         {
           bcount = bcount + 1 ;
           strCarCnt[bcount] = strCarCnt[bcount]+1 ;
           brand[bcount] =  brands;
           //Debug
           System.out.println ("ELSE Brand at = "+ brand[bcount] + "  Counter[BrdNum] = " +strCarCnt[bcount]);
         }
       for (int h = 0; h < intCounter; h++)
       {
       System.out.println(brand[f] + strCarCnt[f]);
       }
                                      
       
        } 
        
    }
}

