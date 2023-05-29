/**
 * Auto Generated Java Class.
 */
/* public class CarsTest {
  
  
  public static void main(String[] args) { 
    String[] strCar = new String[110]; 
      int[] strCarCnt = new int[110];
    
 strCar[0] = "Ford Explorer"; 
strCar[1] = "FORD Explorer";
strCar[2] = "ForD Explorer";
strCar[3] = "Ford Explorer";
    
   for(int f = 0; f < int
            int sub = strCar[intCounter].indexOf(" ");
            String brand = strCar[intCounter].substring(0, sub); // Extract the brand name
           
        
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
* /