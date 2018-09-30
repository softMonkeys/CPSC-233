/** Description of Passenger
 *
 * @author BenKun Chen
 * @version 1.0 Jun 16, 2016
 */
public class Passenger extends Object
{
  private String name;    //name of the passenger
  private int drivingClass = -1;    //class that can drive anything(also means 'passenger')
  private boolean status;   //true -> Driver; false -> Passenger
  private int class7 = 7;   //class that can only drive 2 wheelers such as bikes
  private int class5 = 5;   //class that can only drive regular 4 wheelers such as regular cars
  private int class1 = 1;   //class that can drive all types of vehicles including trucks and buses
  private int cantDrive = -1;   ////class that can drive anything

  /**
  * Constructor to specify the name of the passenger
  */
  Passenger(String name)
  {
    this.name = name;
  }

  /**
  * Set driver's status method. ture for Driver and false for passenger
  */
  public void setDriverStatus(boolean status)
  {
    this.status = status;
  }

  /**
  * Get driver's status method. ture for Driver and false for passenger
  */
  public boolean getDriverStatus()
  {
    return this.status;
  }

  /**
  * Set name method
  */
  public void setName(String name)
  {
    if (name == null)
    {
      System.out.println("Fatal Error setting passenger name");
      System.exit(0);
    }
    this.name = name;
  }

  /**
  * Get name method
  */
  public String getName()
  {
    return this.name;
  }

  /**
  * Set driver's license Class method
  */
  public void updateLicenseClass(int drivingClass)
  {
    if (drivingClass == cantDrive ||
    drivingClass == class1 ||
    drivingClass == class5 ||
    drivingClass == class7 )
    {
      this.drivingClass = drivingClass;
    }
    else
    {
      System.out.println("Invalid license class");
      System.exit(0);
    }
  }

  /**
  * Get driver's license Class method
  */
  public int getLicenceClass()
  {
    return this.drivingClass;
  }

  /**
  * Returns a String which shows the current state of the Passenger
  */
  public String toString()
  {
    String type;
    //true for driver and false for passenger
    if (this.status)
    {
      type = "driver";
    }
    else
    {
      type = "passenger";
    }
    return ("Type: Passenger\nPassenger Name: " + this.name + "\n" + "Driver or Passenger: " + type
    + "\n" + "Driving Class: " + this.drivingClass);
  }

}
