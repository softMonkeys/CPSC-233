/** Description of NonPoweredVehicle
 *
 * @author BenKun Chen
 * @version 1.0 Jun 16, 2016
 */
public abstract class NonPoweredVehicle extends Vehicle
{
  private double weight;    //weight of non powered vehicle

  /**
  * Set method for weight of the NonPoweredVehicle
  */
  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  /**
  * Get method for weight of the NonPoweredVehicle
  */
  public double getWeight()
  {
    return this.weight;
  }

  /**
  * Returns a String which represents the current state of the non-powered vehicle
  */
  public String toString()
  {
    String s = super.toString();
    return (s + "\n" + "Weight: " + this.weight + " kg");
  }

}
