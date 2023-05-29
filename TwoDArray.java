/**
 * Auto Generated Java Class.
 */
public class TwoDArray {
  
  
  public static void main(String[] args) { 
    int temp = 0;
//1a. Create an 10 x 8 array of Random integer..
  

   int rArray[][] = new int[10][8]; 

    for (int a = 0; a<10;a++) 

    { 
       for(int b = 0; b<8; b++)  
       {  

        rArray[a][b] = (int)(Math.random() * 101);

     //   System.out.println("gog = " + rArray[a][b]);    //troubleshooting 
        
       //a. Reset row six to 0 (input what row should be deleted)
        rArray[6][b]= 0;
        //System.out.println(rArray[6][b]);
    
        }   
  
//1b. Switch values in columns 2 with the values in column 4 (input what columns should be switched)
    temp = rArray[a][2]; 
    rArray[a][4] = rArray[a][2];
    rArray[a][4] = temp;
    
    
    //System.out.println("Array 2first = " + rArray[a][2]);
    
  // System.out.println("Array 4first = " +rArray[a][4]);
 //  System.out.println("Temp = " + temp);
  
   
    
   // System.out.println("Array 2second = " + rArray[a][2]);
    
   // System.out.println("Array 4second = " +rArray[a][4]);
    
    
  }
 
//2. Create an 10 x 10 array of Random integer.
    double mArray[][] = new double[10][10]; 
    
    System.out.println("Start");
    for (int a = 0; a<10;a++) 
    { 
      
      double high = -999.0;
      double low = 999.0;
      
       for(int b = 0; b<10; b++)  
       {  

        mArray[a][b] = (int)(Math.random() * 101);
      
      System.out.println(" AB " + mArray[a][b]);
     
        // set column 7, 8, 9 as  the Min, Max and average of each row
       
       if(mArray[a][b] < low)
    {
      low = mArray[a][b];
      mArray[a][7] = low;
      
    }
     //  System.out.println(" mArrayL " + mArray[a][7]); 
       
       if(mArray[a][b] > high)
    {
      high = mArray[a][b];
      mArray[a][8] = high;
    }
    //   System.out.println(" mArrayH " + mArray[a][8]);
       
       
       
    mArray[a][9] += mArray[a][b];
  }

  mArray[a][9] /= mArray[a].length; // divide by number of columns

  System.out.println("Min: " + mArray[a][7] + " Max: " + mArray[a][8] + " Avg: " + mArray[a][9]);
       
    }

    
    
  // 3.Math Applications  y = m x + b  
//Create 4 x 7 array  
    
    int[][] MXB = { {1, 2, 3, 0} , {56, 11, 4, 0} , {-2, 2, 55, 0}, {1, 2, 3, 0}, {1,3, 3, 0}, {3, 3, 3, 0} , {1, 2, 3, 0}, {1, 2, 3, 0} };
  int m = 0;
  int x = 0;
  int b = 0;
    
    for(int z = 0; z < 7; z++)
    {
    
      m = MXB[z][0];
    //    System.out.println("m = " + MXB[z][0]);
    
     x = MXB[z][1];
    //  System.out.println("x = " + MXB[z][1]);
    
     b = MXB[z][2];
   // System.out.println("b = " + MXB[z][2]);
    
     MXB[z][3] = (m*x + b);
 //   System.out.println("y = " + MXB[z][3]);
    }


    
    
    
    
    
 }
}
