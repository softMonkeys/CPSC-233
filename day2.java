import java.util.Scanner;

class day2
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
  ///////////////////////////////
    int num, num1;
    num = keyboard.nextInt();
    for(int i = 1; i < 11; i++)
    {
      System.out.println(num*i);
    }
  ///////////////////////////////
    int temp = 0;
    while (temp < 11)
    {
      System.out.println(num*temp);
      temp++;
      if (temp > 5)
        break;
    }

    while (num != 999)
    {
      num = keyboard.nextInt();
      System.out.println("Enter value is: " + num);
      System.out.println("Enter value..(stop press 999)");
    }
///////////////////////////////////////////

    sum = 0;
    min = 999;
    max = -999;
    for (int i = 0; i < 10; i++)
    {
      num = keyboard.nextInt();
      if (max < num)
      {
        max = num;
      }
      if (min > num)
      {
        min = num;
      }
      sum += num;
    }
    average = sum/10;
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
    System.out.println("Average: " + average);
    System.out.println("Total: " + sum);




////////////////////////////////////////////////////////////
    //Narrowing
    int a,b,c;
    double x,y,z;

    a = 10;
    b = 20;
    x = 50.09;
    y = 60.90;

    System.out.println("printing value before type casting");
    System.out.println(x);
    System.out.println(y);

    System.out.println("printing value after type casting");
    x = (double) a;
    y = (double) b;
    System.out.printf("%.8f\n", x);
    System.out.println(y);
////////////////////////////////////////////////////////////





    final int MAX_AGE = 150;      //MAX AGE
    final int MIN_AGE = 0;        //MIN AGE

    String name;
    int birthMonth;
    int age;
    double height;


    System.out.println("Enter Name: ");
    name = keyboard.nextLine();

////////////////////////////////////////////
    System.out.println("Enter Month: ");
    birthMonth = keyboard.nextInt();

    if (birthMonth < 1 || birthMonth > 12)
      System.out.println("Invalid month!!");
    else
      System.out.println("Valid month");
////////////////////////////////////////////

    System.out.println("Enter Age: ");
    age = keyboard.nextInt();

    if (age < MIN_AGE || age > MAX_AGE)
      System.out.println("Invalid age!!");
    else
      System.out.println("Valid age");

    if (age >= MIN_AGE && age <= 10)
      System.out.println("You are kis");
    else if (age >= 11 && age <= 19)
      System.out.println("You are teen");
    else if (age >= 20 && age <= 40)
      System.out.println("You are young");
    else if (age >= 40 && age <= MAX_AGE)
      System.out.println("You are old");

    System.out.println("Enter height: ");
    height = keyboard.nextDouble();

    System.out.println("Name: " + name + "Age: " + age +
    " Birth Month: " + birthMonth + " Height: " + height);



    //////////////////////////////////////////////////////


  }
}
