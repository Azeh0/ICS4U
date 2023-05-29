import java.io.*;  
import java.util.Scanner; 

public class DC_ICS4OHL {
  
  public static void main(String[] args)throws IOException { 
    
  String temp; 


    int count = 0; 
    int Asize = 750;

    DataClassPeople[] recStatList = new DataClassPeople[Asize]; 
    


     for (int zz = 0;zz<=Asize-1;zz++)  //initialize the array. 

      { 

      recStatList[zz] = new DataClassPeople("Name", "Team", "Position", 0,0,0,0); 

      } 

 
   
    BufferedReader InputFile = new BufferedReader(new FileReader("NHLPlayer_Fields.txt")); 
    BufferedReader InputFile1 = new BufferedReader(new FileReader("OHL_2023.txt"));

    BufferedWriter OutputFile = new BufferedWriter(new FileWriter("ResultNHLDataClass.txt")); 
System.out.println("Test" );
     

    PrintWriter MyPrintWriter = new PrintWriter(OutputFile);   


 // gather data from file 

     String strData; 


    int RCnt = 0; 

    while((strData = InputFile1.readLine())!= null) 

          {   
           String[] parts = strData.split("\t");
           
            String rank = parts[0].trim();
            String player = parts[1].trim();
            String team = parts[2].trim();
            String position = parts[3].trim();
            String gamesPlayed = parts[4].trim();
            String goals = parts[5].trim();
            String assist = parts[6].trim();
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
       // if (recStatList[y].Name.compareTo(recStatList[x].Name) < 0)  
        if (recStatList[y].Goals > recStatList[x].Goals) 

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
     

      System.out.println("Goals Sorted  " + recStatList[cnt4].Goals); 

    
      MyPrintWriter.write(recStatList[cnt4].Goals + ", "  + recStatList[cnt4].Name +", " +recStatList[cnt4].Team + ", " + recStatList[cnt4].Position +", " + recStatList[cnt4].GamesPlayed +", " +  recStatList[cnt4].Assist + recStatList[cnt4].Rank +", " + '\n'); 

      
    }
    InputFile.close(); 

    OutputFile.close();   
  
  }
  

  
}
