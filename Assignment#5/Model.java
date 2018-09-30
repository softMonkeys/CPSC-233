public class Model
{
  private int lowerBound = 0;
  private int upperBound = 0;
  private int increment = 0;
  private int delay = 0;

  public void setLowerBound(int lowerBound)
  {
    this.lowerBound = lowerBound;
  }
  public int getLowerBound()
  {
    return this.lowerBound;
  }

  public void setUpperBound(int upperBound)
  {
    this.upperBound = upperBound;
  }
  public int getUpperBound()
  {
    return this.upperBound;
  }

  public void setIncrement(int increment)
  {
    this.increment = increment;
  }
  public int getIncrement()
  {
    return this.increment;
  }

  public void setDelay(int delay)
  {
    this.delay = delay;
  }
  public int getDelay()
  {
    return this.delay;
  }
}
