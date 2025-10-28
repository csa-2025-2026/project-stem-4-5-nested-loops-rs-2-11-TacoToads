import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // printNTimes("hello", 5);
    // printNums();

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter number");
    // int numRolls = sc.nextInt();
    // uprightNumberTriangle(numRolls);

    starTree();
  }

  public static void printNTimes(String word, int N)
  {

   for (int i = 0; i < word.length(); i++)
   {
    String current_letter = word.substring(i, i+1);
    for (int j=0; j < N; j++)
    {
      System.out.print(current_letter + " ");
    }
    System.out.println();
   }
  }

  public static void printNums()
  {

    for (int rowNum =10; rowNum >= 1; rowNum--)
    {
      for (int count =1; count <= rowNum; count++)
      {
        System.out.print(rowNum + " ");
      }
      System.out.println();
    }
  }

  

  public static void uprightNumberTriangle(int numRolls)
  {
   for (int i = 1; i <= numRolls; i++)
   {
    for(int j = 1; j <= i; j++)
    {
      System.out.print(j + " ");
    }
    System.out.println();
   }
  }

  public static void starTree()
  {
  for (int rowNum =9; rowNum >= 1; rowNum--)
      {
        for (int count =1; count <= rowNum; count++)
        {
          System.out.print(" ");
          System.out.print("*");
        }
        System.out.println();
    }  }

  public static void multTable()
  {
    // code solution here
  }
}

