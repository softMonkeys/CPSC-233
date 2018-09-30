/**Model
 *
 * @author BenKun Chen
 * @version 1.0 Jun 28, 2016
 */
public class Model
{
  private double income = 0;
  private double yearlyIncome = 0;
  private double monthlyIncome = 0;
  private double tax = 0;

  private double totalHousingExpense = 0;
  private double rental = 0;
  private double insurance = 0;
  private double bill = 0;

  private double totalTransportationExpense = 0;
  private double fuel = 0;
  private double subscription = 0;
  private double parking = 0;

  private double totalLivingEssentialsExpense = 0;
  private double groceries = 0;
  private double clothing = 0;
  private double personalCare = 0;
  private double medication = 0;

  private double totalLifeStyleExpense = 0;
  private double dinning = 0;
  private double vacation = 0;

  private double totoalExpenseMonth = 0;

  private double totalSaving = 0;

  private double max = -999999999;
  private double min = 999999999;
  private String maxName;
  private String minName;

  /**
  *An instance method that sets income.
  *@param income income
  */
  public void setIncome(double income)
  {
    this.income = income;
  }
  /**
  *An instance method that returns income.
  *@return Returns income
  */
  public double getIncome()
  {
    return this.income;
  }

  /**
  *An instance method that sets yearly net income.
  *@param yearlyIncome yearly income
  */
  public void setNetIncomeYearly(double yearlyIncome)
  {
    this.yearlyIncome = getIncome() * getTax();
  }
  /**
  *An instance method that returns yearly income.
  *@return yearlyIncome yearly income
  */
  public double getNetIncomeYearly()
  {
    return this.yearlyIncome;
  }

  /**
  *An instance method that sets monthly net income.
  *@param monthlyIncome monthly income
  */
  public void setNetIncomeMonthly(double monthlyIncome)
  {
    this.monthlyIncome = getNetIncomeYearly() / 12;
  }
  /**
  *An instance method that returns monthly net income.
  *@return Returns monthly net income
  */
  public double getNetIncomeMonthly()
  {
    return this.monthlyIncome;
  }

  /**
  *An instance method that sets tax.
  *@param tax tax
  */
  public void setTax(double tax)
  {
    this.tax = tax;
  }
  /**
  *An instance method that returns tax.
  *@return Returns tax
  */
  public double getTax()
  {
    return this.tax;
  }

  /**
  *An instance method that sets rental.
  *@param rental rental
  */
  public void setRental(double rental)
  {
    this.rental = rental;
  }
  /**
  *An instance method that returns rental.
  *@return Returns rental
  */
  public double getRental()
  {
    return this.rental;
  }

  /**
  *An instance method that sets insurance.
  *@param insurance insurance
  */
  public void setInsurance(double insurance)
  {
    this.insurance = insurance;
  }
  /**
  *An instance method that returns insurance.
  *@return Returns insurance
  */
  public double getInsurance()
  {
    return this.insurance;
  }

  /**
  *An instance method that sets bill.
  *@param bill bill
  */
  public void setBill(double bill)
  {
    this.bill = bill;
  }
  /**
  *An instance method that returns bill.
  *@return Returns bill
  */
  public double getBill()
  {
    return this.bill;
  }

  /**
  *An instance method that sets total housing expense.
  *@param totalHousingExpense total housing expense
  */
  public void setTotalHousingExpense(double totalHousingExpense)
  {
    this.totalHousingExpense = getRental() + getInsurance() + getBill();
  }
  /**
  *An instance method that returns total housing expense.
  *@return Returns total housing expense
  */
  public double getTotalHousingExpense()
  {
    return this.totalHousingExpense;
  }

  /**
  *An instance method that sets fuel.
  *@param fuel fuel
  */
  public void setFuel(double fuel)
  {
    this.fuel = fuel;
  }
  /**
  *An instance method that returns fuel.
  *@return Returns fuel
  */
  public double getFuel()
  {
    return this.fuel;
  }

  /**
  *An instance method that sets subscription.
  *@param subscription subscription
  */
  public void setSubscription(double subscription)
  {
    this.subscription = subscription;
  }
  /**
  *An instance method that returns subscription.
  *@return Returns subscription
  */
  public double getSubscription()
  {
    return this.subscription;
  }

  /**
  *An instance method that sets parking.
  *@param parking parking
  */
  public void setParking(double parking)
  {
    this.parking = parking;
  }
  /**
  *An instance method that returns parking.
  *@return Returns parking
  */
  public double getParking()
  {
    return this.parking;
  }

  /**
  *An instance method that sets total transportation expense.
  *@param totalTransportationExpense total transportation expense
  */
  public void setTotalTransportationExpense(double totalTransportationExpense)
  {
    this.totalTransportationExpense = getFuel() + getSubscription() + getParking();
  }
  /**
  *An instance method that returns total transportation expense.
  *@return Returns total transportation expense
  */
  public double getTotalTransportationExpense()
  {
    return this.totalTransportationExpense;
  }

  /**
  *An instance method that sets groceries.
  *@param groceries groceries
  */
  public void setGroceries(double groceries)
  {
    this.groceries = groceries;
  }
  /**
  *An instance method that returns groceries.
  *@return Returns groceries
  */
  public double getGroceries()
  {
    return this.groceries;
  }

  /**
  *An instance method that sets clothing.
  *@param clothing clothing
  */
  public void setClothing(double clothing)
  {
    this.clothing = clothing;
  }
  /**
  *An instance method that returns clothing.
  *@return Returns clothing
  */
  public double getClothing()
  {
    return this.clothing;
  }

  /**
  *An instance method that sets personal care.
  *@param personalCare personal care
  */
  public void setPersonalCare(double personalCare)
  {
    this.personalCare = personalCare;
  }
  /**
  *An instance method that returns personal care.
  *@return Returns personal care
  */
  public double getPersonalCare()
  {
    return this.personalCare;
  }

  /**
  *An instance method that sets medication.
  *@param medication medication
  */
  public void setMedication(double medication)
  {
    this.medication = medication;
  }
  /**
  *An instance method that returns medication.
  *@return Returns medication
  */
  public double getMedication()
  {
    return this.medication;
  }

  /**
  *An instance method that sets total living essentials expense.
  *@param totalLivingEssentialsExpense total living essentials expense
  */
  public void setTotalLivingEssentialsExpense(double totalLivingEssentialsExpense)
  {
    this.totalLivingEssentialsExpense = getGroceries() + getClothing() + getPersonalCare() + getMedication();
  }
  /**
  *An instance method that returns total living essentials expense.
  *@return Returns total living essentials expense
  */
  public double getTotalLivingEssentialsExpense()
  {
    return this.totalLivingEssentialsExpense;
  }

  /**
  *An instance method that sets dinning.
  *@param dinning dinning
  */
  public void setDinning(double dinning)
  {
    this.dinning = dinning;
  }
  /**
  *An instance method that returns dinning.
  *@return Returns dinning
  */
  public double getDinning()
  {
    return this.dinning;
  }

  /**
  *An instance method that sets vacation.
  *@param vacation vacation
  */
  public void setVacation(double vacation)
  {
    this.vacation = vacation;
  }
  /**
  *An instance method that returns vacation.
  *@return Returns vacation
  */
  public double getVacation()
  {
    return this.vacation;
  }

  /**
  *An instance method that sets total life style expense.
  *@param totalLifeStyleExpense total life style expense
  */
  public void setTotalLifeStyleExpense(double totalLifeStyleExpense)
  {
    this.totalLifeStyleExpense = getDinning() + getVacation();
  }
  /**
  *An instance method that returns total life style expense.
  *@return Returns total life style expense
  */
  public double getTotalLifeStyleExpense()
  {
    return this.totalLifeStyleExpense;
  }

  /**
  *An instance method that sets totoal expense monthly.
  *@param totoalExpenseMonth vacation
  */
  public void setTotalExpenseMonthly(double totoalExpenseMonth)
  {
    this.totoalExpenseMonth = getTotalHousingExpense() + getTotalTransportationExpense() + getTotalLivingEssentialsExpense() + getTotalLifeStyleExpense();
  }
  /**
  *An instance method that returns totoal expense monthly.
  *@return Returns totoal expense monthly
  */
  public double getTotalExpenseMonthly()
  {
    return this.totoalExpenseMonth;
  }

  /**
  *An instance method that sets total saving.
  *@param totalSaving vacation
  */
  public void setTotalSaving(double totalSaving)
  {
    if ((getNetIncomeYearly() - getTotalHousingExpense() - getTotalTransportationExpense() - getTotalLivingEssentialsExpense() - getTotalLifeStyleExpense()) >= 0.0)
    {
      this.totalSaving = getNetIncomeYearly() - getTotalHousingExpense() - getTotalTransportationExpense() - getTotalLivingEssentialsExpense() - getTotalLifeStyleExpense();
    }
    else
    {
      this.totalSaving = 0.0;
    }
  }
  /**
  *An instance method that returns total saving.
  *@return Returns total saving
  */
  public double getTotalSaving()
  {
    return this.totalSaving;
  }

  /**
  *An instance method that sets maximun expense.
  *@param max maximun expense
  */
  public void setHighestExpense(double max)
  {
    if (this.max < getRental()){
      this.max = getRental();
    }
    if (this.max < getInsurance()){
      this.max = getInsurance();
    }
    if (this.max < getBill()){
      this.max = getBill();
    }
    if (this.max < getFuel()){
      this.max = getFuel();
    }
    if (this.max < getSubscription()){
      this.max = getSubscription();
    }
    if (this.max < getParking()){
      this.max = getParking();
    }
    if (this.max < getGroceries()){
      this.max = getGroceries();
    }
    if (this.max < getClothing()){
      this.max = getClothing();
    }
    if (this.max < getPersonalCare()){
      this.max = getPersonalCare();
    }
    if (this.max < getMedication()){
      this.max = getMedication();
    }
    if (this.max < getDinning()){
      this.max = getDinning();
    }
    if (this.max < getVacation()){
      this.max = getVacation();
    }
  }
  /**
  *An instance method that returns maximun expense.
  *@return Returns total maximun expense
  */
  public double getHighestExpense()
  {
    return this.max;
  }

  /**
  *An instance method that convert maximun expense into string.
  *@param maxName the name is going to be converted from double
  */
  public void setHighestExpenseName(String maxName)
  {
    if (getHighestExpense() == getRental()){
      this.maxName = "Rental or mortgage";
    }
    if (getHighestExpense() == getInsurance()){
      this.maxName = "Insurance";
    }
    if (getHighestExpense() == getBill()){
      this.maxName = "Bills for utilities";
    }
    if (getHighestExpense() == getFuel()){
      this.maxName = "Fuel";
    }
    if (getHighestExpense() == getSubscription()){
      this.maxName = "Transportation tickets or subscription";
    }
    if (getHighestExpense() == getParking()){
      this.maxName = "Parking";
    }
    if (getHighestExpense() == getGroceries()){
      this.maxName = "Groceries";
    }
    if (getHighestExpense() == getClothing()){
      this.maxName = "Clothing";
    }
    if (getHighestExpense() == getPersonalCare()){
      this.maxName = "Personal care";
    }
    if (getHighestExpense() == getMedication()){
      this.maxName = "Medication";
    }
    if (getHighestExpense() == getDinning()){
      this.maxName = "Dinning out";
    }
    if (getHighestExpense() == getVacation()){
      this.maxName = "Vacation";
    }
  }
  /**
  *An instance method that returns maximun expense in string.
  *@return Returns maximun expense
  */
  public String getHighestExpenseName()
  {
    return this.maxName;
  }

  /**
  *An instance method that sets minimum expense.
  *@param min minimum expense
  */
  public void setLowestExpense(double min)
  {
    if (this.min > getRental()){
      this.min = getRental();
    }
    if (this.min > getInsurance()){
      this.min = getInsurance();
    }
    if (this.min > getBill()){
      this.min = getBill();
    }
    if (this.min > getFuel()){
      this.min = getFuel();
    }
    if (this.min > getSubscription()){
      this.min = getSubscription();
    }
    if (this.min > getParking()){
      this.min = getParking();
    }
    if (this.min > getGroceries()){
      this.min = getGroceries();
    }
    if (this.min > getClothing()){
      this.min = getClothing();
    }
    if (this.min > getPersonalCare()){
      this.min = getPersonalCare();
    }
    if (this.min > getMedication()){
      this.min = getMedication();
    }
    if (this.min > getDinning()){
      this.min = getDinning();
    }
    if (this.min > getVacation()){
      this.min = getVacation();
    }
  }
  /**
  *An instance method that returns minimum expense.
  *@return Returns minimum expense
  */
  public double getLowestExpense()
  {
    return this.min;
  }

  /**
  *An instance method that convert minimum expense into string.
  *@param minName minimum expense
  */
  public void setLowestExpenseName(String minName)
  {
    if (getLowestExpense() == getRental()){
      this.minName = "Rental or mortgage";
    }
    if (getLowestExpense() == getInsurance()){
      this.minName = "Insurance";
    }
    if (getLowestExpense() == getBill()){
      this.minName = "Bills for utilities";
    }
    if (getLowestExpense() == getFuel()){
      this.minName = "Fuel";
    }
    if (getLowestExpense() == getSubscription()){
      this.minName = "Transportation tickets or subscription";
    }
    if (getLowestExpense() == getParking()){
      this.minName = "Parking";
    }
    if (getLowestExpense() == getGroceries()){
      this.minName = "Groceries";
    }
    if (getLowestExpense() == getClothing()){
      this.minName = "Clothing";
    }
    if (getLowestExpense() == getPersonalCare()){
      this.minName = "Personal care";
    }
    if (getLowestExpense() == getMedication()){
      this.minName = "Medication";
    }
    if (getLowestExpense() == getDinning()){
      this.minName = "Dinning out";
    }
    if (getLowestExpense() == getVacation()){
      this.minName = "Vacation";
    }
  }
  /**
  *An instance method that returns minimum expense in string.
  *@return Returns minimum expense in string
  */
  public String getLowestExpenseName()
  {
    return this.minName;
  }
}
