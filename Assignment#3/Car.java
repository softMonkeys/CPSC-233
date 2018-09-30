/** Description of Car
 *
 * @author BenKun Chen
 * @version 1.0 Jun 16, 2016
 */
public class Car extends PoweredVehicle
{
  private String color;   //color for car
  private String model;   //car's model
  private int maxPower = 4500;    //maximum horsepower
  private int minPower = 1600;    //minimun horsepower
  private boolean temp;   //temperate boolean expression

  /**
  * Constructor that initializes to red, ford, 4 doors, 2200 horsepower, and 5 people
  */
  Car()
  {
    this.color = "red";
    this.model = "ford";
    setDoorNumber(4);
    setEnginePower(2200);
    setMaxPassengersCount(5);
    setWheels(4);
  }

  /**
  * Constructor that allows you to specify the color, model, number of doors, engine
  * power, and the maximum number of passengers
  */
  Car(String color, String model, int doorNumber, int enginePower, int maxPassenger)
  {

    this.color = color;
    this.model = model;
    setDoorNumber(doorNumber);
    setEnginePower(enginePower);
    setMaxPassengersCount(maxPassenger);
    setWheels(4);
  }

  /**
  * Set method for the color
  */
  public void setColor(String color)
  {
    this.color = color;
  }

  /**
  * Get method for the color
  */
  public String getColor()
  {
    return this.color;
  }

  /**
  * Set method for the Model
  */
  public void setModel(String model)
  {
    this.model = model;
  }

  /**
  * Get method for the Model
  */
  public String getModel()
  {
    return model;
  }

  /**
  * Returns true if the passenger’s class is 1 or if the class is 5 and
  * the number of wheels less than or equal to 4
  */
  public boolean canBeDriven(Passenger passenger)
  {
    boolean temp = true;
    if (passenger == null)
    {
      System.out.println("Fatal Error canBeDriven");
      System.exit(0);
      return temp;
    }
    else if (passenger.getLicenceClass() == 1 || passenger.getLicenceClass() == 5 && getWheelsCount() <= 4)
    {
      return temp;
    }
    else
    {
      temp = false;
      return temp;
    }
  }

  /**
  * Increases the speed of the car based on its engine power and the number of wheels
  */
  public void accelerate()
  {
    setSpeed(getSpeed() + getEnginePower() / 1000 * getWheelsCount());
  }

  /**
  * Reduces the speed of the car based on its engine power and the number of wheels
  */
  public void brake()
  {
    double newSpeed = getSpeed() - getEnginePower() / 1000 * getWheelsCount();
    if (newSpeed >= 0)
    {
      setSpeed(newSpeed);
    }
    else
    {
      setSpeed(0);
    }
  }

  /**
  * Returns a String which represents the current state of the car
  */
  public String toString()
  {
    String s = super.toString();
    return ("Type: Car\n" + s + "\n" + "Model: " + this.model + "\n" + "Color: " + this.color);
  }

  public String getName()
  {
    String name = "car";
    return name;
  }

}
