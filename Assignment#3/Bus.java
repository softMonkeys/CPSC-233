/** Description of Bus
 *
 * @author BenKun Chen
 * @version 1.0 Jun 16, 2016
 */
public class Bus extends PoweredVehicle
{
  private boolean accessibleSeats;    //true -> seat avaliable; flse -> seat unavaliable
  private int maxPower = 6000;    //maximum horsepower
  private int minPower = 1600;    //minimun horsepower
  private boolean temp;   //temperate boolean expression

  /**
  * Constructor for the default values
  */
  Bus()
  {
    this.accessibleSeats = true;
    setDoorNumber(4);
    setEnginePower(4500);
    setMaxPassengersCount(2);
    setWheels(4);
  }

  /**
  * Constructor for specify the availability of accessibility seats, the
  * number of doors, engine power, and the maximum number of passengers
  */
  Bus(boolean accessibleSeats, int doorNumber, int enginePower, int maxPassenger)
  {
    this.accessibleSeats = accessibleSeats;
    setDoorNumber(doorNumber);
    setEnginePower(enginePower);
    setMaxPassengersCount(maxPassenger);
    setWheels(4);
  }

  /**
  * Set method for avaliable seats
  */
  public void setAccessibleSeats(boolean accessibleSeats)
  {
    this.accessibleSeats = accessibleSeats;
  }

  /**
  * Get method for avaliable seats
  */
  public boolean getAccessibleSeats()
  {
    return this.accessibleSeats;
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
  * Increases the speed of the bus based on its engine power and the number of wheels
  */
  public void accelerate()
  {
    setSpeed(getSpeed() + getEnginePower() / 1100 * getWheelsCount());
  }

  /*
  * Reduces the speed of the bus based on its engine power and the number of wheels
  */
  public void brake()
  {
    double newSpeed = getSpeed() - getEnginePower() / 1100 * getWheelsCount();
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
  * Returns a String which represents the current state of the bus
  */
  public String toString()
  {
    String type;
    if (this.accessibleSeats)
    {
      type = "Yes";
    }
    else
    {
      type = "No";
    }
    String s = super.toString();
    return("Type: Bus\n" + s + "\n" + "Seats avalibilty: " + type);
  }

  public String getName()
  {
    String name = "bus";
    return name;
  }

}
