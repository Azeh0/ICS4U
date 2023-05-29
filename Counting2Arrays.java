/**
 * Car Brand Counting ideas
 */
public class Counting2Arrays { 
  public static void main(String[] args) { 
    
    int[] Counter = new int[]{ 0,0,0,0,0,0 };
    String[] Brand = {" ", " ", " "," ", " ", " "};
    String[] MyCars = {"BMW B","BMW a", "BMW a","BMW b", "BMW c", "BMW a", "VW a","VW b", "VW c", "ABCD ab","ABCD abcd"};
    
    int spIndex;
    int BrdNum = 0 ;
    String ThisBrand = "";
    for( int a = 0; a< 11; a++)
     {
        spIndex = MyCars[a].indexOf( " " );   
          
        ThisBrand = MyCars[a].substring(0, spIndex);
       
        //  Debug   System.out.println ( ThisBrand +"   " + ThisBrand.compareTo(Brand[BrdNum]));
       
        if (ThisBrand.compareTo(Brand[BrdNum]) ==0)
         {
           Counter[BrdNum] = Counter[BrdNum]+1 ; 
           //DeBug
           System.out.println ("If Brand at = "+ Brand[BrdNum] + "  Counter[BrdNum] = " +Counter[BrdNum]);
         }
       else
         {
           BrdNum = BrdNum + 1 ;
           Counter[BrdNum] = Counter[BrdNum]+1 ;
           Brand[BrdNum] =  ThisBrand ;
           //Debug
           System.out.println ("ELSE Brand at = "+ Brand[BrdNum] + "  Counter[BrdNum] = " +Counter[BrdNum]);
         }
    }
  }  
}
