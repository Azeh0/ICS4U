import java.io.*;

public class StringBubbleSort {

    public static void main(String args[]) throws IOException {

        String[] strCar = new String[110]; // Make this an array of cars
        int[] strCarCnt = new int[110];
        String[] brand = new String[110];
        int intCounter = 0;

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

        for (int f = 1; f < intCounter; f++){
             System.out.println(strCar[f]);
          int sub = strCar[f].indexOf(" ");
             brand[f] = strCar[f].substring(0, sub); // Extract the brand name
       // System.out.println(sub);
       // System.out.println(brand[f]);
        }
        
        // Count the number of each car brand
        for (int k = 0; k < intCounter; k++) {
            brand[k] = strCar[k];

            for (int x = 0; x < intCounter; x++) {
                if (strCar[x].equals(brand[x])) {
                    strCarCnt[x]++;
                }
            }
        }

        // Output the results
        for (int a = 0; a < intCounter; a++) {
            brand[a] = strCar[a];
            int count = strCarCnt[a];
            if (brand[a] != null && count > 0) {
                System.out.println(brand[a] + ": " + count);
            }
        } 
    }
}
