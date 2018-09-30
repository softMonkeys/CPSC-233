/** Description of Bike
 *
 * @author BenKun Chen
 * @version 1.0 Jun 16, 2016
 */
public class Bike extends NonPoweredVehicle
{
  private String material;    //material of the frame
  private boolean temp;   //temperate boolean expression

  /**
  * Constructor that initializes to 20 kg, and steel
  */
  Bike()
  {
    setWeight(20);
    this.material = "steel";
    setWheels(2);
    setMaxPassengersCount(1);
  }

  /**
  * Constructor that that allows you to specify the weight and frame material
  */
  Bike(double weight, String material)
  {
    setWeight(weight);
    this.material = material;
    setWheels(2);
    setMaxPassengersCount(1);
  }

  /**
  * Set method for the frame
  */
  public void setFrame(String material)
  {
    this.material = material;
  }

  /**
  * Get method for the frame
  */
  public String getFrame()
  {
    return this.material;
  }

  /**
  * Returns true if the passenger’s class is any value other than -1
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
    else if (passenger.getLicenceClass() != -1)
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
  * Increases the speed of the bike constantly
  */
  public void accelerate()
  {
    setSpeed(getSpeed() + 5.0);
  }

  /**
  * Reduces the speed of the bike linearly
  */
  public void brake()
  {
    double newSpeed = getSpeed() - 5.0;
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
  * Returns a String which represents the current state of the bike
  */
  public String toString()
  {
    String s = super.toString();
    return ("Type: Bike\n" + s + "\n" + "Frame Material: " + this.material);
  }

  public String getName()
  {
    String name = "bike";
    return name;
  }

}
