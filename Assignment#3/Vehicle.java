/** Description of Vehicle
 *
 * @author BenKun Chen
 * @version 1.0 Jun 16, 2016
 */
public abstract class Vehicle extends Object
{
  private int wheels;   //number of the wheels
  private int maxPassenger;   //maximum passengers
  private int passengerCount = 0;   //counter for counting the number of passengers
  private double speed;   //speed of the vehicle

  //create an array for storing passenger objects
  Passenger[] passenger_list = new Passenger[maxPassenger];

  /**
  * A set of methods for keeping track of passengers inside the vehicle
  */

  /**
  * Add passengers methods
  */
  public void addPassenger(Passenger passenger)
  {
    if (passenger == null)
    {
      System.out.println("Fatal Error addPassenger");
      System.exit(0);
    }
    else if (this.passengerCount < maxPassenger)
    {
      this.passenger_list[this.passengerCount] = passenger;
      this.passengerCount++;
    }
    else
    {
      System.out.println("Vehicle passengers have reached the limit");
    }
  }

  /**
  * Get passengers method
  */
  public int getPassengerCount()
  {
    return this.passengerCount;
  }

  /**
  * Removing passengers method
  */
  public void RemovePassenger(Passenger passenger)
  {
    if (passenger == null)
    {
      System.out.println("Fatal Error RemovePassenger");
      System.exit(0);
    }
    else
    {
      String name = passenger.getName();
      Passenger[] new_list = new Passenger[maxPassenger];
      int count = 0;
      for (int i = 0; i < passengerCount; i++)
      {
        if (passenger_list[i].getName() != name)
        {
          new_list[count] = passenger_list[i];
          count++;
        }
      }
      this.passenger_list = new_list;
      passengerCount--;
    }
  }

  /**
  * Set maximum passengers method
  */
  public void setMaxPassengersCount(int maxPassenger)
  {
    this.maxPassenger = maxPassenger;
    passenger_list = new Passenger[maxPassenger];
  }

  /**
  * Get maximum passengers method
  */
  public int getMaxPassengersCount()
  {
    return this.maxPassenger;
  }

  /**
  * Set number of wheels method
  */
  public void setWheels(int wheels)
  {
    this.wheels = wheels;
  }

  /**
  * Get number of wheels method
  */
  public int getWheelsCount()
  {
    return this.wheels;
  }

  /**
  * Get driver method, searches for and returns the (first) driver among the any existing
  * passengers of the vehicle
  */
  public Passenger getDriver()
  {
    for (int i = 0; i < passengerCount; i++)
    {
      if (this.passenger_list[i].getDriverStatus())
      {
        return this.passenger_list[i];
      }
    }
    return null;
  }

  /**
  * Set method of current speed
  */
  public void setSpeed(double speed)
  {
    this.speed = speed;
  }

  /**
  * Get method of current speed
  */
  public double getSpeed()
  {
    return this.speed;
  }

  /**
  * Updates the current speed of the vehicle only when there is at least a
  * passenger with a valid (driving) license, and based on the current speed, the number of
  * wheels and whether an engine exist
  */
  public abstract void accelerate();

  /**
  * Once applied the vehicle should attempt to reduce speed only when there
  * is at least a passenger with a valid (driving) license, and based on the number of wheels
  * and the current speed
  */
  public abstract void brake();

  /**
  * A method that asserts if this vehicle can be driven by a given passenger
  */
  public abstract boolean canBeDriven(Passenger passenger);

  /**
  * Returns a String which shows the current state of the vehicle
  */
  public String toString()
  {
    String canBeDriven;
    if (this.passengerCount > 0 && getDriver() != null && canBeDriven(getDriver())) {
      canBeDriven = "yes";
    } else {
      canBeDriven = "no";
    }

    return ("Wheels: " + this.wheels + "\n" + "Speed: " + this.speed + "\n" +
    "Maximum passenger: " + this.maxPassenger + "\n" + "Current passenger: " + this.passengerCount + "\n" + "Can be driven: " + canBeDriven);
  }

  /**
  * Create abstract method for the test code
  */
  public abstract String getName();
}
