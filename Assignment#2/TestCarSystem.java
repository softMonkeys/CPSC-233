import java.util.Scanner;
import java.util.Random;

class TestCarSystem
{
  public static int min_year = 1886;
  public static int max_year = 2016;
  public static Double min_distance = 0.0;

  public static void main(String [] args)
  {
    Random randomGenerator = new Random();
    Scanner key = new Scanner(System.in);
    Car object = new Car();

    String make_and_model = new String();
    int year = 0;
    String color = new String();
    Double speed;
    int max_car = 10;
    Double distance;


    Car[] cars = new Car[max_car];


    // Test Code #1: Prompt the user and initialize by using constructors
    System.out.println("----Test Code # 1----");
    for (int i = 0; i < 3; i++)
    {
      System.out.println("Please enter make/model: ");
      if (key.hasNext())
      {
        make_and_model = key.nextLine();
      }
      else
      {
        System.out.println("Invalid make/model");
        System.exit(0);
      }


      System.out.println("Please enter car's yearly make(1886-2016): ");
      if (key.hasNextInt())
      {
        int temp;
        temp = key.nextInt();
        boolean b = TestCarSystem.isValidyear(temp);
        if (b)
        {
          year = temp;
        }
        else
        {
          System.out.println("Please enter year from 1886 to 2016");
          System.exit(0);
        }
      }
      else
      {
        System.out.println("Invalid year");
        System.exit(0);
      }


      System.out.println("Please enter color: ");
      color = key.nextLine();
      if (key.hasNext())
      {
        color = key.nextLine();
      }
      else
      {
        System.out.println("Invalid color");
        System.exit(0);
      }

      cars[i] = new Car(make_and_model, year, color);

      Car.ActiveObjects();
      Car.carID();
    }


    //Test Code #2: Prompt the user and instantiate by using set methods
    System.out.println("----Test Code # 2----");
    cars[3] = new Car();
    System.out.println("--Fourth car--");
    System.out.println("Please enter make/model: ");
    if (key.hasNext())
    {
      make_and_model = key.nextLine();
      cars[3].set_make_and_model(make_and_model);
    }
    else
    {
      System.out.println("Invalid make/model");
      System.exit(0);
    }

    System.out.println("Please enter car's yearly make(1886-2016): ");
    if (key.hasNextInt())
    {
      int temp;
      temp = key.nextInt();
      boolean b = TestCarSystem.isValidyear(temp);
      if (b)
      {
        year = temp;
        cars[3].set_year(year);
      }
      else
      {
        System.out.println("Please enter year from 1886 to 2016");
        System.exit(0);
      }
    }
    else
    {
      System.out.println("Invalid year");
      System.exit(0);
    }

    System.out.println("Please enter color: ");
    color = key.nextLine();
    if (key.hasNext())
    {
      color = key.nextLine();
      cars[3].set_color(color);
    }
    else
    {
      System.out.println("Invalid color");
      System.exit(0);
    }

    Car.ActiveObjects();
    Car.carID();



    //Test Code #3: Prompt the user for three speed values
    System.out.println("----Test Code # 3----");
    for (int i = 0; i < 3; i++)
    {
      System.out.println("Please enter the speed of " + (i+1) + "/3 cars (The maximum speed is 200km/h): ");
      if (key.hasNextDouble())
      {
        speed = key.nextDouble();
        cars[i].move(speed);
      }
      else
      {
        System.out.println("Invalid speed");
        System.exit(0);
      }

    }

    //Test Code #4: Print out the cars and active instances
    System.out.println("----Test Code # 4----");
    object.writeActiveCars();
    for (int i = 0; i < 4; i++)
    {
      System.out.println(cars[i]);
    }



    //Test Code #5: Asking last created car to move and ask the first car to stop
    System.out.println("----Test Code # 5----");
    int random_speed = randomGenerator.nextInt(200) + 1;
    Double double_random_speed = (double) random_speed;
    System.out.println("Generating random speed....");
    System.out.println("The last car is moving at "+ random_speed + "km/h");
    cars[3].move(double_random_speed);
    System.out.println("Stopping the first car....");
    speed = 0.0;
    cars[0].move(speed);
    System.out.println("The speed of the first car is now " + object.stop(speed) + "km/h");




    //6 Calculate time needed to make a journey
    System.out.println("----Test Code # 6----");

    System.out.println("Please enter the distance of thr car traveled: ");
    if (key.hasNextDouble())
    {
      Double temp;
      temp = key.nextDouble();
      boolean a = TestCarSystem.isValiddistance(temp);
      if (a)
      {
        distance = temp;
        for (int i = 0; i < 4; i++)
        {
          System.out.println("The time the " + (i+1) + "/4 car traveled: " + cars[i].CalculateJourney(distance));
        }
      }
      else
      {
        System.out.println("Please enter distance greater than or equal to 0");
        System.exit(0);
      }
    }
    else
    {
      System.out.println("Invalid distance");
    }








    //7 Identify any similar cars and print out their infomations with the serial numbers
    System.out.println("----Test Code # 7----");



    //8 Delete (reference of) the second car object, and force garbage collection.
    System.out.println("----Test Code # 8----");


    //9 Instantiate another car object
    System.out.println("----Test Code # 9----");


    //10 Printing the remaining information
    System.out.println("----Test Code # 10----");




  }

  // Checks if the year is valid
  public static boolean isValidyear(int year)
  {
    if (year >= min_year && year <= max_year)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  // Checks if the distance is valid
  public static boolean isValiddistance(Double distance)
  {
    if (distance < min_distance)
    {
      return false;
    }
    else
    {
      return true;
    }
  }
}
