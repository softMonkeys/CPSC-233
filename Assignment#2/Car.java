public class Car
{
  private int year;
  private String color;
  private String make_and_model;
  private Double speed;
  private int max_speed = 200;
  private int min_speed = 0;
  private Double current_speed;
  private Double time;
  private Double distance;
  private static int carID = 0;
  private static int active_cars = 0;


// 3 constructors
  //specify the car make/model, color, and year
  public Car(String make_and_model, int year, String color)
  {
    this.make_and_model = make_and_model;
    this.year = year;
    this.color = color;
  }

  //initializes prarmeters to default values
  public Car()
  {
    this("N/A", 0, "N/A");
  }

  //copy constructor that duplicates a car object
  public Car(Car otherCar)
  {
    this.make_and_model = otherCar.getMakeAndModel();
    this.year = otherCar.getYear();
    this.color = otherCar.getColor();
  }

  //print the active cars
  public void writeActiveCars()
  {
    System.out.println("Active instances: " + this.active_cars);
  }


// Check if the speed is valid
  public boolean isValidspeed(Double speed)
  {
    if (speed >= min_speed && speed <= max_speed)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

// Check if there is similar cars
  public boolean equals(Car otherCar)
  {
    return((this.make_and_model == otherCar.make_and_model) && (this.year == otherCar.year) && (this.color == otherCar.color));
  }


// 3 set methods
  public void set_year(int year)
  {
    this.year = year;
  }

  public void set_color(String color)
  {
    this.color = color;
  }

  public void set_make_and_model(String make_and_model)
  {
    this.make_and_model = make_and_model;
  }

// 4 get methods
  public int getYear()
  {
    return year;
  }

  public String getColor()
  {
    return color;
  }

  public Double getCurrentSpeed()
  {
    return current_speed;
  }

  public String getMakeAndModel()
  {
    return make_and_model;
  }

// move method
  public void move(Double speed)
  {
    if (isValidspeed(speed))
    {
      this.speed = speed;
    }
    else
    {
      System.out.println("Please enter speed between 0km/h and 200km/h");
      System.exit(0);
    }
  }

// stop method
  public Double stop(Double current_speed)
  {
    current_speed = 0.0;
    return current_speed;
  }

// calculate journey time method
  public Double CalculateJourney(Double distance)
  {
    if (current_speed == 0.0)
    {
      time = -1.0;
      return time;
    }
    else
    {
      time = distance / current_speed;
      return time;
    }
  }

// car ID method
  public static int carID()
  {
    carID++;
    return carID;
  }

// number of "active" instances method
  public static int ActiveObjects()
  {
    active_cars++;
    return active_cars;
  }

// toString method
  public String toString()
  {
    String s = new String();
		s = "";
		s = s + "Car make/model: "+ this.make_and_model + "\nYear: " + this.year + "\nColor: " + this.color;
		return s;
  }



}
