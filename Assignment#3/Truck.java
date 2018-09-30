/** Description of Truck
 *
 * @author BenKun Chen
 * @version 1.0 Jun 16, 2016
 */
public class Truck extends Car
{
  private int maxPower = 6000;    //maximum horsepower
  private int minPower = 3500;   //minimun horsepower
  private int size;   //size of the truck (square meter)
  private boolean temp;   //temperate boolean expression

  /**
  * Constructor that initializes to 13 square meter, 4 doors,
  * 5000 horsepower, and 2 people
  */
  Truck()
  {
    this.size = 13;
    setDoorNumber(4);
    setEnginePower(5000);
    setMaxPassengersCount(2);
    setWheels(4);
  }

  /**
  * Constructor that allows you to specify the size, number of doors, engine power, and
  * the maximum number of passengers
  */
  Truck(int size, int doorNumber, int enginePower, int maxPassenger, String color, String model)
  {
    this.size = size;
    setDoorNumber(doorNumber);
    setEnginePower(enginePower);
    setMaxPassengersCount(maxPassenger);
    setWheels(4);
    setColor(color);
    setModel(model);
  }

  /**
  * Set method for the size
  */
  public void setSize(int size)
  {
    this.size = size;
  }

  /**
  * Get method for the size
  */
  public int getSize()
  {
    return this.size;
  }

  /**
  * Returns true if the passenger’s class is 1
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
    else if (passenger.getLicenceClass() == 1)
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
  * Increases the speed of the truck based on its engine power and the number of wheels
  */
  public void accelerate()
  {
    setSpeed(getSpeed() + getEnginePower() / 1200 * getWheelsCount());
  }

  /**
  * Reduces the speed of the truck based on its engine power and the number of wheels
  */
  public void brake()
  {
    double newSpeed = getSpeed() - getEnginePower() / 1200 * getWheelsCount();
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
  * Returns a String which represents the current state of the truck
  */
  public String toString()
  {
    String s = super.toString();
    s = s.replace("Type: Car", "Type: Truck");
    return(s + "\n" + "Size: " + this.size + " square meter");
  }

  public String getName()
  {
    String name = "truck";
    return name;
  }

}
