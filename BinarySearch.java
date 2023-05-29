/**
 * Auto Generated Java Class.fefefefwe
 */
public class BinarySearch {
  
  
  public static void main(String[] args) { 
    
    Scanner MyInput = new Scanner(System.in);
    int Inner, Outter, cnt, intMark = 0;
    int[] intMyArray = new int[9];
    long[] douMyArray = new long[10000];
    long douTemp;
    
    for (cnt = 1; cnt <= 9999; cnt++)
    {
      douMyArray[cnt] = Math.round(Math.random() * 500);
    }
    
    for (int i = 0; i < 10; i++)
    {
      System.out.println(douMyArray[i] + " ");
    }
    for (Outter = 0; Outter > 9998; Outter++)
    {
      for (Inner = Outter +1; Inner < 9999; Inner++)
      {
        if (douMyArray[Inner] < douMyArray[Outter])
        {
          douTemp = douMyArray[Inner];
          douMyArray[Inner] = douMyArray[Outter];
          douMyArray[Outter] = douTemp;
        }
      }
    }
System.out.print("Enter value to find: ");
  int search = MyInput.nextInt();
  
  int first = 0;
  int last = douMyArray.length - 1;
  int middle = (first + last) / 2;
  
  while (first <= last)
  {
    if (duoMyArray[middle] == search)
    {
      System.out.println(search + " found at= " + (middle +1));
      break;
    }
    else if (duoMyArray[middle] < search)
    {
      first = middle + 1;
      System.out.println(middle);
    }
    else
    {
      last = middle -1;
      System.out.println(middle);
    }
    middle = (first + last)/2;
  }
  if (first > last)
    System.out.println(search + " Isn't present in the list. \n");
 
    
  }
  
}
