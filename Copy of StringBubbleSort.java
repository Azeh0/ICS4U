import java.io.*;

public class StringBubbleSort {

    public static void main(String args[]) throws IOException {

        String[] strCar = new String[110]; // Make this an array of cars
        int[] strCarCnt = new int[110];
        int intCounter = 0;

        BufferedReader ThisIsMyInputFile = new BufferedReader(new FileReader("cars.txt"));

        while ((strCar[intCounter] = ThisIsMyInputFile.readLine()) != null) {
            // System.out.println( intCounter + strCar[intCounter] );
            int sub = strCar[intCounter].indexOf(" ");
            String brand = strCar[intCounter].substring(0, sub); // Extract the brand name
            strCar[intCounter] = brand.toUpperCase(); // Convert to uppercase
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

        for (int z = 0; z < 100; z++) 

         { 

       //  System.out.println(strCar[z]);  

         } 


        // Count the number of each car brand
        for (int k = 0; k < intCounter; k++) {
            String brand = strCar[k];

            for (int x = 0; x < intCounter; x++) {
                if (strCar[x].equals(brand)) {
                    strCarCnt[x]++;
                }
            }
        }

        // Output the results
        for (int a = 0; a < intCounter; a++) {
            String brand = strCar[a];
            int count = strCarCnt[a];
            if (brand != null && count > 0) {
                System.out.println(brand + ": " + count);
            }
        }
    }
}