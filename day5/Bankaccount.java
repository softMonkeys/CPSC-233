class Bankaccount
{
  private String ac_name;
  private int ac_number;
  private int ac_balance;
  private int amount;

  Bankaccount(String name, int number, int balance)
  {
    setName(name);
    setNumber(number);
    setBalance(balance);
  }

  public void setName(String newName)
  {
    ac_name = newName;
  }
  public String getName()
  {
    return ac_name;
  }

  public void setNumber(int newNumber)
  {
    ac_number = newNumber;
  }
  public int getNumber()
  {
    return ac_number;
  }

  public void setBalance(int newBalance)
  {
    ac_balance = newBalance;
  }
  public int getBalance()
  {
    return ac_balance;
  }

  public void setAmount(int newAmount)
  {
    amount = this.ac_balance - newAmount;
  }

  public int getAmount()
  {
    return amount;
  }

  public String toString()
  {
    String s = new String();
    s = "Account Name: " + this.getName() + " Account Number: " + this.getNumber() + " Account Balance: " + this.getBalance();
    s = s + "\n" + "Money Left: " + this.getAmount();
    return s;
  }
}
