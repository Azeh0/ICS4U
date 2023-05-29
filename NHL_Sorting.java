import java.io.*; 

import java.util.Scanner; 

public class NHL_Sorting { 

 
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

  
  public static void main(String[] args) throws IOException 

  {  

    String temp; 


    int count = 0; 


    DataClassPeople[] recStatList = new DataClassPeople[30]; 


     for (int zz = 0;zz<=29;zz++)  //initialize the array. 

      { 

      recStatList[zz] = new DataClassPeople("Name", "Team", "Position", 0,0,0,0); 

      } 
//String Name, String Team, String Position int Rank, int GamesPlayed, int Goals, int Assist
   

    BufferedReader InputFile = new BufferedReader(new FileReader("NH.txt")); 

    BufferedWriter OutputFile = new BufferedWriter(new FileWriter("ResultNHL.txt")); 

     

    PrintWriter MyPrintWriter = new PrintWriter(OutputFile);   


 // gather data from file 

     String strData; 


    int RCnt = 0; 

    while((strData = InputFile.readLine())!= null) 

          {   

           int a = RCnt; 


           strData =InputFile.readLine(); 

           recStatList[a].Rank = Integer.parseInt(strData ) ; 

           System.out.println("Rank =  " + recStatList[a].Rank); 
          
           
           recStatList[a].Name =strData; 

           System.out.println("Name  " + recStatList[a].Name); 

       

           strData =InputFile.readLine(); 
           recStatList[a].Team =strData; 

           System.out.println("Team =  " + recStatList[a].Team); 
           

           strData = InputFile.readLine(); 
           recStatList[a].Position =strData; 

           System.out.println("Position " + recStatList[a].Position); 
           
         

           strData = InputFile.readLine(); 

           recStatList[a].GamesPlayed = Integer.parseInt(strData ) ; 

           System.out.println("GamesPlayed " + recStatList[a].GamesPlayed); 

            strData =InputFile.readLine(); 

           recStatList[a].Goals = Integer.parseInt(strData ) ; 

           System.out.println("Goals =  " + recStatList[a].Goals); 
           

           strData = InputFile.readLine(); 

           recStatList[a].Assist = Integer.parseInt(strData ) ; 

           System.out.println("Assist " + recStatList[a].Assist); 

            
           



           

          RCnt =RCnt+1; 

     } 

DataClassPeople Temp; 

   for (int x = 0; x < RCnt-1; x++) 

    { 

      for(int y = x+1; y < RCnt; y++) 

      { 

        if (recStatList[y].Name.compareTo(recStatList[x].Name) < 0)  
      //  if (recStatList[y].Age > recStatList[x].Age)

        { 

          Temp = recStatList[y]; 

          recStatList[y] = recStatList[x]; 

          recStatList[x] = Temp; 

       } 

      } 

    }  

    for (int cnt4 = 0; cnt4 < RCnt; cnt4 ++) 

    { 

      System.out.println("Name Sorted  " + recStatList[cnt4].Name); 

       MyPrintWriter.println("Sorted  " +recStatList[cnt4].Name); 

    } 

    InputFile.close(); 

    OutputFile.close();                                                                                    

  } 

} 