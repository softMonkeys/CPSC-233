public class Driver
{
  public static void main(String[] args)
  {
    Inventory chinook = new Inventory();
    try
    {
      chinook.add(100);
    }
    catch(InventoryOverMaxException e)
    {
      System.out.println("System over flows");
    }

    try
    {
      chinook.remove(120);
    }
    catch(InventoryUnderMinException e)
    {
      System.out.println("amount too big");
    }

    System.out.println(chinook.showwStockLevel());
  }
}
