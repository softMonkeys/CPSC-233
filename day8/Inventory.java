public class Inventory
{
  public final int CRITICAL = 10;
  public final int MIN = 0;
  public final int MAX = 100;

  private int stockLevel = 50;

  public boolean inventoryTooLow()
  {
    if (stockLevel < CRITICAL)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void add(int amount) throws InventoryOverMaxException
  {
    int temp;
    temp = stockLevel + amount;
    if (temp > MAX)
    {
      throw new InventoryOverMaxException("Adding" + amount + "items will cause overflow");
    }
    else
    {
      stockLevel = stockLevel + amount;
    }
  }


  public void remove(int amount) throws InventoryUnderMinException
  {
    int temp;
    temp = stockLevel - amount;
    if (temp < MIN)
    {
      throw new InventoryUnderMinException("Adding" + amount + "items will cause overflow");
    }
    else
    {
      stockLevel = stockLevel - amount;
    }
  }

  public String showwStockLevel()
  {
    return ("Inventory: " + stockLevel);
  }
}
