import java.util.Scanner;

class day3
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);

    int number = 0;
    int sum = 0;
    int min = 999;
    int max = -999;
    int temp;

    number = input.nextInt();


    int [] myArray = new int [number];

    System.out.println("Enter Arrary Values: ");
    for(int i = 0; i < myArray.length; i++)
    {
      myArray[i] = input.nextInt();
      if (max < myArray[i])
      {
        max = myArray[i];
      }
      if (min > myArray[i])
      {
        min = myArray[i];
      }
      sum += myArray[i];
    }



    System.out.println("Printing Arrary Values: ");
    for (int i = 0; i < myArray.length; i++)
    {
      for (int j = i+1; j < myArray.length; j++)
      {
        if (myArray[i] > myArray[j])
        {
            temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;
        }
      }
    }
    for (int i = 0; i < myArray.length; i++)
      {
        System.out.println(myArray[i]);
      }



    System.out.println("Sum: " + sum);

    System.out.println("Mean: " + (double) sum/number);
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);



    ///////////////////////////////////////////////
    Scanner in = new Scanner(System.in);
    int row = 0; col = 0;
    row = in.nextInt();
    col = in.nextInt();
    double [][] myArray = new double[row][col];
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++)
      {
        myArray[i][j] = in.nextInt();
      }
    }
    System.out.println("Printing Array Values");
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++)
      {
        System.out.print(myArray[i][j] + '\t');
      }
      System.out.println();
    }



    for (int i = 0; i < number; i++)
    {
      for (int a = 0; a < i+1; a++)
      {
        System.out.print("*");
      }
    System.out.println();
    }
    */

  }
}
