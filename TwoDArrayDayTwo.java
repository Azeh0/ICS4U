
import java.io.*;  
import java.util.Scanner; 

public class TwoDArrayDayTwo {
   
  
private static class DataClassPeople  

  { 

   String Name, Team, Position; 

   int Rank, GamesPlayed, Goals, Assist; 

   

      
     public DataClassPeople(String Name, String Team, String Position, int Rank, int GamesPlayed, int Goals, int Assist)       

     { 

       
       this.Name = Name; 

       this.Team = Team; 

       this.Position = Position; 
        
       this.Rank = Rank; 

       this.GamesPlayed = GamesPlayed; 

       this.Goals = Goals; 
        
       this.Assist = Assist; 


     } 

  } 


  
  public static void main(String[] args)throws IOException { 
    
  String temp; 


    int count = 0; 


    DataClassPeople[] recStatList = new DataClassPeople[30]; 


     for (int zz = 0;zz<=29;zz++)  //initialize the array. 

      { 

      recStatList[zz] = new DataClassPeople("Name", "Team", "Position", 0,0,0,0); 

      } 

 
   
    BufferedReader InputFile = new BufferedReader(new FileReader("NHLPlayer_Fields.txt")); 

    BufferedWriter OutputFile = new BufferedWriter(new FileWriter("ResultNHLfull.txt")); 
System.out.println("Test" );
     

    PrintWriter MyPrintWriter = new PrintWriter(OutputFile);   


 // gather data from file 

     String strData; 


    int RCnt = 0; 

    while((strData = InputFile.readLine())!= null) 

          {   

           int a = RCnt; 


          strData = strData.trim();

           recStatList[a].Rank = Integer.parseInt(strData ) ; 

           System.out.println("Rank =  " + recStatList[a].Rank); 
          
           
          
           
           strData =InputFile.readLine(); 
            strData = strData.trim();
           recStatList[a].Name =strData; 

           System.out.println("Name =  " + recStatList[a].Name); 

       

           strData =InputFile.readLine(); 
            strData = strData.trim();
           recStatList[a].Team =strData; 

           System.out.println("Team =  " + recStatList[a].Team); 
           

           strData = InputFile.readLine(); 
           strData = strData.trim();
           recStatList[a].Position =strData; 

           System.out.println("Position = " + recStatList[a].Position); 
           
         
 
           strData = InputFile.readLine(); 
           strData = strData.trim();
           recStatList[a].GamesPlayed = Integer.parseInt(strData ) ; 

           System.out.println("GamesPlayed = " + recStatList[a].GamesPlayed); 

             
           
           
           strData =InputFile.readLine(); 
           strData = strData.trim();
            recStatList[a].Goals = Integer.parseInt(strData ) ; 

           System.out.println("Goals =  " + recStatList[a].Goals); 
           

      
           strData = InputFile.readLine(); 
           strData = strData.trim();
           recStatList[a].Assist = Integer.parseInt(strData ) ; 

           System.out.println("Assist = " + recStatList[a].Assist); 


          RCnt =RCnt+1; 

     } 

DataClassPeople Temp; 

   for (int x = 0; x < RCnt-1; x++) 

    { 

      for(int y = x+1; y < RCnt; y++) 

      { 
        if (recStatList[y].Name.compareTo(recStatList[x].Name) < 0)  
    //    if (recStatList[y].Age > recStatList[x].Age) 

        { 

          Temp = recStatList[y]; 

          recStatList[y] = recStatList[x]; 

          recStatList[x] = Temp; 

       } 

      } 

    }  

    for (int cnt4 = 0; cnt4 < RCnt; cnt4 ++) 

    { 
//String Name, String Team, String Position, int Rank, int GamesPlayed, int Goals, int Assist
      System.out.println("Name Sorted  " + recStatList[cnt4].Name); 

       MyPrintWriter.write(recStatList[cnt4].Rank +", " + recStatList[cnt4].Name +", " +recStatList[cnt4].Team + ", " + recStatList[cnt4].Position +", " + recStatList[cnt4].GamesPlayed +", " +recStatList[cnt4].Goals + ", " +  recStatList[cnt4].Assist + '\n'); 

    } 

    InputFile.close(); 

    OutputFile.close();   
   // 2.// Bell Sort
    
   
        int numRows = 10; // change this value to generate a different number of rows

        int[][] bell = new int[numRows][];
        bell[0] = new int[] {1}; // first row starts with a 1

        for (int i = 1; i < numRows; i++) {
            int[] row = new int[i+1];
            row[0] = bell[i-1][i-1]; // bring down the last number in the previous row
            for (int j = 1; j <= i; j++) {
                row[j] = row[j-1] + bell[i-1][j-1]; // calculate each succeeding number
            }
            bell[i] = row;
        }

        // print the Bell Triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(bell[i][j] + " ");
            }
            System.out.println();
        } 
        
        //3. Matrix Code
      
        int mA[][] = new int [3][3];
        int mB[][] = new int [3][3];
       
        for (int a = 0; a<3;a++) 

    { 
       for(int b = 0; b<3; b++)  
       {  
     
        mA[a][b] = (int)(Math.random() * 101);
      
       mB[a][b]=(int)(Math.random() * 101);
      
  
       }   
  
  }
     
      int mC[][]=new int[3][3];

      for(int i = 0;i<3;i++)
      {
        
        for(int j = 0;j<3;j++)
         
         {
            
           mC[i][j] = mA[i][j]+mB[i][j];
            
            System.out.print(mC[i][j]+" ");
         
         }
         
         System.out.println();
      }
        
    
    }
}


    
    
    
    
    
 