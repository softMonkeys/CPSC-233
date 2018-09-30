/** Description of PoweredVehicle
 *
 * @author BenKun Chen
 * @version 1.0 Jun 16, 2016
 */
public abstract class PoweredVehicle extends Vehicle
{
  private int doorNumber;   //numbers of the door
  private int enginePower;    //engine power (horsepower)
  private int maxPower = 6000;    //maximum horsepower
  private int minPower = 1600;    //minimun horsepower

  /**
  * Set method for the number of doors
  */
  public void setDoorNumber(int doorNumber)
  {
    this.doorNumber = doorNumber;
  }

  /**
  * Get method for the number of doors
  */
  public int getDoorNumber()
  {
    return this.doorNumber;
  }

  /**
  * Set method for the engine Power
  */
  public void setEnginePower(int enginePower)
  {
    //with force values ranging between 1600 and 6000
    if (enginePower >= this.minPower && enginePower <= this.maxPower)
    {
      this.enginePower = enginePower;
    }
    else
    {
      System.out.println("Engine power out of range");
      System.exit(0);
    }
  }

  /**
  * Get method for the engine Power
  */
  public int getEnginePower()
  {
    return this.enginePower;
  }

  /**
  * Returns a String which represents the current state of the powered vehicle.
  */
  public String toString()
  {
    String s = super.toString();
    return (s + "\n" + "Door number: " + this.doorNumber + "\n" + "Engine power: " + this.enginePower + " HP");
  }

}
