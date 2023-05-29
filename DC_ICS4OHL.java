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

      recStatList[zz] = new DataClassPeople("Name", "LastName", "Team", "Position", 0,0,0,0); 

      } 

 
   
    BufferedReader InputFile = new BufferedReader(new FileReader("NHLPlayer_Fields.txt")); 
    BufferedReader InputFile1 = new BufferedReader(new FileReader("OHL_2023.txt"));

    BufferedWriter OutputFile = new BufferedWriter(new FileWriter("ResultNHLDataClass.txt")); 
System.out.println("Test" );
     

    PrintWriter MyPrintWriter = new PrintWriter(OutputFile);   


 // gather data from file 

     String strData; 


    int RCnt = 0; 

    while ((strData = InputFile1.readLine()) != null) {
    String[] parts = strData.split("\t");

    String rank = parts[0].trim();
    String name = parts[1].trim();
    String lastName = parts[2].trim();
    String team = parts[3].trim();
    String position = parts[4].trim();
    String gamesPlayed = parts[5].trim();
    String goals = parts[6].trim();
    String assist = parts[7].trim();
    int a = RCnt;

    recStatList[a].Rank = Integer.parseInt(rank);
    System.out.println("Rank = " + recStatList[a].Rank);

    recStatList[a].Name = name;
    System.out.println("Name = " + recStatList[a].Name);
    
    recStatList[a].LastName = lastName;
    System.out.println("Last Name = " + recStatList[a].LastName);
    
    recStatList[a].Team = team;
    System.out.println("Team = " + recStatList[a].Team);

    recStatList[a].Position = position;
    System.out.println("Position = " + recStatList[a].Position);

    recStatList[a].GamesPlayed = Integer.parseInt(gamesPlayed);
    System.out.println("GamesPlayed = " + recStatList[a].GamesPlayed);

    recStatList[a].Goals = Integer.parseInt(goals);
    System.out.println("Goals = " + recStatList[a].Goals);

    recStatList[a].Assist = Integer.parseInt(assist);
    System.out.println("Assist = " + recStatList[a].Assist);

    RCnt = RCnt + 1;
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
