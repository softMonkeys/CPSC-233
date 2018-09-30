/**Controller
 *
 * @author BenKun Chen
 * @version 1.0 Jun 28, 2016
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener
{
  private View aView;

  private double totalHousingExpense = 0;
  private double totalTransportationExpense = 0;
  private double totalLivingEssentialsExpense = 0;
  private double totalLifeStyleExpense = 0;
  private double yearlyIncome = 0;
  private double monthlyIncome = 0;
  private double totalSaving = 0;
  private double totoalExpenseMonth = 0;
  private double max = -999999999;
  private double min = 999999999;
  private double maxMonth = -999999999;
  private double minMonth = 999999999;
  private String maxMonthName;
  private String minMonthNmae;
  private String maxName;
  private String minName;
  private double yearlyHousing = 0;
  private double yearlyTransportation = 0;
  private double yearlyLiving = 0;
  private double yearlyLifeStyle = 0;
  private double yearlySaving = 0;

  /**
  * A constructor that assigns the properties of aView, aModel, as well as
  * registering a listener, the parameters are the type of other two classes with
  * the program.
  *@param aView This is an object of the class View passed in as a parameter to set attributes
  *@param aModel This is a array object of the class Model passed in as a array to set attributes
  */
  Controller(View aView, Model[] aModel)
  {
    this.aModel = aModel;
    this.aView = aView;
    aView.setEventListener((ActionListener) this);
  }

  /**
  *An override of the actionPerformedmethod found in the View class, which lays out
  *the logical sequence of the program after auser event occurs. It catch NumberFormatException
  *whenever user makes invalid input.
  *
  *@param e The user generated event is represented by e to indicate an action event has occured
  */
  public void actionPerformed (ActionEvent e)
  {
    try
    {
      assumingCorrectNumberFormat(e);
    }
    catch (NumberFormatException e2)
    {
      aView.setOuputErroeMessage();
    }
    catch (ArrayIndexOutOfBoundsException ea)
    {
      aView.setOuputArray();
      n = 11;
    }
  }

  int n = 0;
  Model[] aModel = null;

  /**
  *A method in actionPerformed method, it runs whenever user makes valid input.
  *It parses string to double, so calculations can take place with double values,
  *
  *@param e The user generated event is represented by e to indicate an action event has occured
  */
  public void assumingCorrectNumberFormat(ActionEvent e)
  {
    String actionCommand = e.getActionCommand();
    aModel[n] = new Model();

    if (actionCommand.equals("Confirm"))
    {
      Double rentalInput = Double.parseDouble(aView.getRentalInput());
      aModel[n].setRental(rentalInput);

      Double insuranceInput = Double.parseDouble(aView.getInsuranceInput());
      aModel[n].setInsurance(insuranceInput);

      Double billInput = Double.parseDouble(aView.getBillInput());
      aModel[n].setBill(billInput);

      Double fuelInput = Double.parseDouble(aView.getFuelInput());
      aModel[n].setFuel(fuelInput);

      Double subscriptionInput = Double.parseDouble(aView.getSubscriptionInput());
      aModel[n].setSubscription(subscriptionInput);

      Double parkingInput = Double.parseDouble(aView.getParkingInput());
      aModel[n].setParking(parkingInput);

      Double groceriesInput = Double.parseDouble(aView.getGroceriesInput());
      aModel[n].setGroceries(groceriesInput);

      Double clothingInput = Double.parseDouble(aView.getClothingInput());
      aModel[n].setClothing(clothingInput);

      Double personalCareInput = Double.parseDouble(aView.getPersionalCareInput());
      aModel[n].setPersonalCare(personalCareInput);

      Double medicationInput = Double.parseDouble(aView.getMedicationInput());
      aModel[n].setMedication(medicationInput);

      Double dinningInput = Double.parseDouble(aView.getDinningInput());
      aModel[n].setDinning(dinningInput);

      Double vacationInput = Double.parseDouble(aView.getVacationInput());
      aModel[n].setVacation(vacationInput);

      Double incomeInput = Double.parseDouble(aView.getIncomeInput());
      aModel[n].setIncome(incomeInput);

      Double taxInput = Double.parseDouble(aView.getTaxInput());
      aModel[n].setTax(taxInput);

      //Net income yearly and monthly
      aModel[n].setNetIncomeYearly(yearlyIncome);
      aModel[n].setNetIncomeMonthly(monthlyIncome);

      //Total housing
      aModel[n].setTotalHousingExpense(totalHousingExpense);
      aModel[n].setTotalTransportationExpense(totalTransportationExpense);
      aModel[n].setTotalLivingEssentialsExpense(totalLivingEssentialsExpense);
      aModel[n].setTotalLifeStyleExpense(totalLifeStyleExpense);

      //Total saving
      aModel[n].setTotalSaving(totalSaving);

      //Highest and lowest Expense
      aModel[n].setHighestExpense(max);
      aModel[n].setLowestExpense(min);
      aModel[n].setHighestExpenseName(maxName);
      aModel[n].setLowestExpenseName(minName);

      //Total expense of each month
      aModel[n].setTotalExpenseMonthly(totoalExpenseMonth);

      aView.setOutputConfirm(String.valueOf(aModel[n].getRental()), String.valueOf(aModel[n].getInsurance()), String.valueOf(aModel[n].getBill()),
      String.valueOf(aModel[n].getFuel()), String.valueOf(aModel[n].getSubscription()), String.valueOf(aModel[n].getParking()), String.valueOf(aModel[n].getGroceries()),
      String.valueOf(aModel[n].getClothing()), String.valueOf(aModel[n].getPersonalCare()), String.valueOf(aModel[n].getMedication()), String.valueOf(aModel[n].getDinning()),
      String.valueOf(aModel[n].getVacation()), String.valueOf(aModel[n].getNetIncomeYearly()), String.valueOf(aModel[n].getNetIncomeMonthly()), String.valueOf(aModel[n].getTotalHousingExpense()),
      String.valueOf(aModel[n].getTotalTransportationExpense()), String.valueOf(aModel[n].getTotalLivingEssentialsExpense()), String.valueOf(aModel[n].getTotalLifeStyleExpense()),
      aModel[n].getHighestExpenseName(), aModel[n].getLowestExpenseName(), String.valueOf(aModel[n].getTotalSaving()));

      n++;
    }
    else if (actionCommand.equals("Clear"))
    {
      aView.setOutputClear();
    }
    else if (actionCommand.equals("January"))
    {

      aView.setOutputMonths(String.valueOf(aModel[0].getRental()), String.valueOf(aModel[0].getInsurance()), String.valueOf(aModel[0].getBill()),
      String.valueOf(aModel[0].getFuel()), String.valueOf(aModel[0].getSubscription()), String.valueOf(aModel[0].getParking()), String.valueOf(aModel[0].getGroceries()),
      String.valueOf(aModel[0].getClothing()), String.valueOf(aModel[0].getPersonalCare()), String.valueOf(aModel[0].getMedication()), String.valueOf(aModel[0].getDinning()),
      String.valueOf(aModel[0].getVacation()), String.valueOf(aModel[0].getNetIncomeYearly()), String.valueOf(aModel[0].getNetIncomeMonthly()), String.valueOf(aModel[0].getTotalHousingExpense()),
      String.valueOf(aModel[0].getTotalTransportationExpense()), String.valueOf(aModel[0].getTotalLivingEssentialsExpense()), String.valueOf(aModel[0].getTotalLifeStyleExpense()),
      aModel[0].getHighestExpenseName(), aModel[0].getLowestExpenseName(), String.valueOf(aModel[0].getTotalSaving()), 1);
    }
    else if (actionCommand.equals("February"))
    {
      if (aModel[1] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[1].getRental()), String.valueOf(aModel[1].getInsurance()), String.valueOf(aModel[1].getBill()),
        String.valueOf(aModel[1].getFuel()), String.valueOf(aModel[1].getSubscription()), String.valueOf(aModel[1].getParking()), String.valueOf(aModel[1].getGroceries()),
        String.valueOf(aModel[1].getClothing()), String.valueOf(aModel[1].getPersonalCare()), String.valueOf(aModel[1].getMedication()), String.valueOf(aModel[1].getDinning()),
        String.valueOf(aModel[1].getVacation()), String.valueOf(aModel[1].getNetIncomeYearly()), String.valueOf(aModel[1].getNetIncomeMonthly()), String.valueOf(aModel[1].getTotalHousingExpense()),
        String.valueOf(aModel[1].getTotalTransportationExpense()), String.valueOf(aModel[1].getTotalLivingEssentialsExpense()), String.valueOf(aModel[1].getTotalLifeStyleExpense()),
        aModel[1].getHighestExpenseName(), aModel[1].getLowestExpenseName(), String.valueOf(aModel[1].getTotalSaving()), 2);
      }

    }
    else if (actionCommand.equals("March"))
    {
      if (aModel[2] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[2].getRental()), String.valueOf(aModel[2].getInsurance()), String.valueOf(aModel[2].getBill()),
        String.valueOf(aModel[2].getFuel()), String.valueOf(aModel[2].getSubscription()), String.valueOf(aModel[2].getParking()), String.valueOf(aModel[2].getGroceries()),
        String.valueOf(aModel[2].getClothing()), String.valueOf(aModel[2].getPersonalCare()), String.valueOf(aModel[2].getMedication()), String.valueOf(aModel[2].getDinning()),
        String.valueOf(aModel[2].getVacation()), String.valueOf(aModel[2].getNetIncomeYearly()), String.valueOf(aModel[2].getNetIncomeMonthly()), String.valueOf(aModel[2].getTotalHousingExpense()),
        String.valueOf(aModel[2].getTotalTransportationExpense()), String.valueOf(aModel[2].getTotalLivingEssentialsExpense()), String.valueOf(aModel[2].getTotalLifeStyleExpense()),
        aModel[2].getHighestExpenseName(), aModel[2].getLowestExpenseName(), String.valueOf(aModel[2].getTotalSaving()), 3);
      }
    }
    else if (actionCommand.equals("April"))
    {
      if (aModel[3] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[3].getRental()), String.valueOf(aModel[3].getInsurance()), String.valueOf(aModel[3].getBill()),
        String.valueOf(aModel[3].getFuel()), String.valueOf(aModel[3].getSubscription()), String.valueOf(aModel[3].getParking()), String.valueOf(aModel[3].getGroceries()),
        String.valueOf(aModel[3].getClothing()), String.valueOf(aModel[3].getPersonalCare()), String.valueOf(aModel[3].getMedication()), String.valueOf(aModel[3].getDinning()),
        String.valueOf(aModel[3].getVacation()), String.valueOf(aModel[3].getNetIncomeYearly()), String.valueOf(aModel[3].getNetIncomeMonthly()), String.valueOf(aModel[3].getTotalHousingExpense()),
        String.valueOf(aModel[3].getTotalTransportationExpense()), String.valueOf(aModel[3].getTotalLivingEssentialsExpense()), String.valueOf(aModel[3].getTotalLifeStyleExpense()),
        aModel[3].getHighestExpenseName(), aModel[3].getLowestExpenseName(), String.valueOf(aModel[3].getTotalSaving()), 4);
      }
    }
    else if (actionCommand.equals("May"))
    {
      if (aModel[4] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[4].getRental()), String.valueOf(aModel[4].getInsurance()), String.valueOf(aModel[4].getBill()),
        String.valueOf(aModel[4].getFuel()), String.valueOf(aModel[4].getSubscription()), String.valueOf(aModel[4].getParking()), String.valueOf(aModel[4].getGroceries()),
        String.valueOf(aModel[4].getClothing()), String.valueOf(aModel[4].getPersonalCare()), String.valueOf(aModel[4].getMedication()), String.valueOf(aModel[4].getDinning()),
        String.valueOf(aModel[4].getVacation()), String.valueOf(aModel[4].getNetIncomeYearly()), String.valueOf(aModel[4].getNetIncomeMonthly()), String.valueOf(aModel[4].getTotalHousingExpense()),
        String.valueOf(aModel[4].getTotalTransportationExpense()), String.valueOf(aModel[4].getTotalLivingEssentialsExpense()), String.valueOf(aModel[4].getTotalLifeStyleExpense()),
        aModel[4].getHighestExpenseName(), aModel[4].getLowestExpenseName(), String.valueOf(aModel[4].getTotalSaving()), 5);
      }
    }
    else if (actionCommand.equals("June"))
    {
      if (aModel[5] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[5].getRental()), String.valueOf(aModel[5].getInsurance()), String.valueOf(aModel[5].getBill()),
        String.valueOf(aModel[5].getFuel()), String.valueOf(aModel[5].getSubscription()), String.valueOf(aModel[5].getParking()), String.valueOf(aModel[5].getGroceries()),
        String.valueOf(aModel[5].getClothing()), String.valueOf(aModel[5].getPersonalCare()), String.valueOf(aModel[5].getMedication()), String.valueOf(aModel[5].getDinning()),
        String.valueOf(aModel[5].getVacation()), String.valueOf(aModel[5].getNetIncomeYearly()), String.valueOf(aModel[5].getNetIncomeMonthly()), String.valueOf(aModel[5].getTotalHousingExpense()),
        String.valueOf(aModel[5].getTotalTransportationExpense()), String.valueOf(aModel[5].getTotalLivingEssentialsExpense()), String.valueOf(aModel[5].getTotalLifeStyleExpense()),
        aModel[5].getHighestExpenseName(), aModel[5].getLowestExpenseName(), String.valueOf(aModel[5].getTotalSaving()), 6);
      }
    }
    else if (actionCommand.equals("July"))
    {
      if (aModel[6] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[6].getRental()), String.valueOf(aModel[6].getInsurance()), String.valueOf(aModel[6].getBill()),
        String.valueOf(aModel[6].getFuel()), String.valueOf(aModel[6].getSubscription()), String.valueOf(aModel[6].getParking()), String.valueOf(aModel[6].getGroceries()),
        String.valueOf(aModel[6].getClothing()), String.valueOf(aModel[6].getPersonalCare()), String.valueOf(aModel[6].getMedication()), String.valueOf(aModel[6].getDinning()),
        String.valueOf(aModel[6].getVacation()), String.valueOf(aModel[6].getNetIncomeYearly()), String.valueOf(aModel[6].getNetIncomeMonthly()), String.valueOf(aModel[6].getTotalHousingExpense()),
        String.valueOf(aModel[6].getTotalTransportationExpense()), String.valueOf(aModel[6].getTotalLivingEssentialsExpense()), String.valueOf(aModel[6].getTotalLifeStyleExpense()),
        aModel[6].getHighestExpenseName(), aModel[6].getLowestExpenseName(), String.valueOf(aModel[6].getTotalSaving()), 7);
      }
    }
    else if (actionCommand.equals("August"))
    {
      if (aModel[7] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[7].getRental()), String.valueOf(aModel[7].getInsurance()), String.valueOf(aModel[7].getBill()),
        String.valueOf(aModel[7].getFuel()), String.valueOf(aModel[7].getSubscription()), String.valueOf(aModel[7].getParking()), String.valueOf(aModel[7].getGroceries()),
        String.valueOf(aModel[7].getClothing()), String.valueOf(aModel[7].getPersonalCare()), String.valueOf(aModel[7].getMedication()), String.valueOf(aModel[7].getDinning()),
        String.valueOf(aModel[7].getVacation()), String.valueOf(aModel[7].getNetIncomeYearly()), String.valueOf(aModel[7].getNetIncomeMonthly()), String.valueOf(aModel[7].getTotalHousingExpense()),
        String.valueOf(aModel[7].getTotalTransportationExpense()), String.valueOf(aModel[7].getTotalLivingEssentialsExpense()), String.valueOf(aModel[7].getTotalLifeStyleExpense()),
        aModel[7].getHighestExpenseName(), aModel[7].getLowestExpenseName(), String.valueOf(aModel[7].getTotalSaving()), 8);
      }
    }
    else if (actionCommand.equals("September"))
    {
      if (aModel[8] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[8].getRental()), String.valueOf(aModel[8].getInsurance()), String.valueOf(aModel[8].getBill()),
        String.valueOf(aModel[8].getFuel()), String.valueOf(aModel[8].getSubscription()), String.valueOf(aModel[8].getParking()), String.valueOf(aModel[8].getGroceries()),
        String.valueOf(aModel[8].getClothing()), String.valueOf(aModel[8].getPersonalCare()), String.valueOf(aModel[8].getMedication()), String.valueOf(aModel[8].getDinning()),
        String.valueOf(aModel[8].getVacation()), String.valueOf(aModel[8].getNetIncomeYearly()), String.valueOf(aModel[8].getNetIncomeMonthly()), String.valueOf(aModel[8].getTotalHousingExpense()),
        String.valueOf(aModel[8].getTotalTransportationExpense()), String.valueOf(aModel[8].getTotalLivingEssentialsExpense()), String.valueOf(aModel[8].getTotalLifeStyleExpense()),
        aModel[8].getHighestExpenseName(), aModel[8].getLowestExpenseName(), String.valueOf(aModel[8].getTotalSaving()), 9);
      }
    }
    else if (actionCommand.equals("October"))
    {
      if (aModel[9] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[9].getRental()), String.valueOf(aModel[9].getInsurance()), String.valueOf(aModel[9].getBill()),
        String.valueOf(aModel[9].getFuel()), String.valueOf(aModel[9].getSubscription()), String.valueOf(aModel[9].getParking()), String.valueOf(aModel[9].getGroceries()),
        String.valueOf(aModel[9].getClothing()), String.valueOf(aModel[9].getPersonalCare()), String.valueOf(aModel[9].getMedication()), String.valueOf(aModel[9].getDinning()),
        String.valueOf(aModel[9].getVacation()), String.valueOf(aModel[9].getNetIncomeYearly()), String.valueOf(aModel[9].getNetIncomeMonthly()), String.valueOf(aModel[9].getTotalHousingExpense()),
        String.valueOf(aModel[9].getTotalTransportationExpense()), String.valueOf(aModel[9].getTotalLivingEssentialsExpense()), String.valueOf(aModel[9].getTotalLifeStyleExpense()),
        aModel[9].getHighestExpenseName(), aModel[9].getLowestExpenseName(), String.valueOf(aModel[9].getTotalSaving()), 10);
      }
    }
    else if (actionCommand.equals("November"))
    {
      if (aModel[10] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[10].getRental()), String.valueOf(aModel[10].getInsurance()), String.valueOf(aModel[10].getBill()),
        String.valueOf(aModel[10].getFuel()), String.valueOf(aModel[10].getSubscription()), String.valueOf(aModel[10].getParking()), String.valueOf(aModel[10].getGroceries()),
        String.valueOf(aModel[10].getClothing()), String.valueOf(aModel[10].getPersonalCare()), String.valueOf(aModel[10].getMedication()), String.valueOf(aModel[10].getDinning()),
        String.valueOf(aModel[10].getVacation()), String.valueOf(aModel[10].getNetIncomeYearly()), String.valueOf(aModel[10].getNetIncomeMonthly()), String.valueOf(aModel[10].getTotalHousingExpense()),
        String.valueOf(aModel[10].getTotalTransportationExpense()), String.valueOf(aModel[10].getTotalLivingEssentialsExpense()), String.valueOf(aModel[10].getTotalLifeStyleExpense()),
        aModel[10].getHighestExpenseName(), aModel[10].getLowestExpenseName(), String.valueOf(aModel[10].getTotalSaving()), 11);
      }
    }
    else if (actionCommand.equals("December"))
    {
      if (aModel[11] == null){}
      else
      {
        aView.setOutputMonths(String.valueOf(aModel[11].getRental()), String.valueOf(aModel[11].getInsurance()), String.valueOf(aModel[11].getBill()),
        String.valueOf(aModel[11].getFuel()), String.valueOf(aModel[11].getSubscription()), String.valueOf(aModel[11].getParking()), String.valueOf(aModel[11].getGroceries()),
        String.valueOf(aModel[11].getClothing()), String.valueOf(aModel[11].getPersonalCare()), String.valueOf(aModel[11].getMedication()), String.valueOf(aModel[11].getDinning()),
        String.valueOf(aModel[11].getVacation()), String.valueOf(aModel[11].getNetIncomeYearly()), String.valueOf(aModel[11].getNetIncomeMonthly()), String.valueOf(aModel[11].getTotalHousingExpense()),
        String.valueOf(aModel[11].getTotalTransportationExpense()), String.valueOf(aModel[11].getTotalLivingEssentialsExpense()), String.valueOf(aModel[11].getTotalLifeStyleExpense()),
        aModel[11].getHighestExpenseName(), aModel[11].getLowestExpenseName(), String.valueOf(aModel[11].getTotalSaving()), 12);
      }
    }
    else if (actionCommand.equals("Analysis"))
    {
      if (aModel[0] == null || aModel[1] == null || aModel[2] == null || aModel[3] == null || aModel[4] == null || aModel[5] == null ||
      aModel[6] == null || aModel[7] == null || aModel[8] == null || aModel[9] == null || aModel[10] == null || aModel[11] == null){}
      else
      {
        for (int i = 0; i < 12 ; i++)
        {
          yearlyHousing = yearlyHousing + aModel[i].getTotalHousingExpense();
          yearlyTransportation = yearlyTransportation + aModel[i].getTotalTransportationExpense();
          yearlyLiving = yearlyLiving + aModel[i].getTotalLivingEssentialsExpense();
          yearlyLifeStyle = yearlyLifeStyle + aModel[i].getTotalLifeStyleExpense();
        }

        yearlySaving = aModel[0].getNetIncomeYearly() - yearlyHousing - yearlyTransportation - yearlyLiving - yearlyLifeStyle;

        if (yearlySaving < 0)
        {
          yearlySaving = 0;
        }

        for (int i = 0; i < 12; i++)
        {
          if (this.maxMonth < aModel[i].getTotalExpenseMonthly()){
            this.maxMonth = aModel[i].getTotalExpenseMonthly();
          }
          if (this.minMonth > aModel[i].getTotalExpenseMonthly()){
            this.minMonth = aModel[i].getTotalExpenseMonthly();
          }
        }

        if (this.maxMonth == aModel[0].getTotalExpenseMonthly()){
          maxMonthName = "January";
        }
        else if (this.maxMonth == aModel[1].getTotalExpenseMonthly()){
          maxMonthName = "February";
        }
        else if (this.maxMonth == aModel[2].getTotalExpenseMonthly()){
          maxMonthName = "March";
        }
        else if (this.maxMonth == aModel[3].getTotalExpenseMonthly()){
          maxMonthName = "April";
        }
        else if (this.maxMonth == aModel[4].getTotalExpenseMonthly()){
          maxMonthName = "May";
        }
        else if (this.maxMonth == aModel[5].getTotalExpenseMonthly()){
          maxMonthName = "June";
        }
        else if (this.maxMonth == aModel[6].getTotalExpenseMonthly()){
          maxMonthName = "July";
        }
        else if (this.maxMonth == aModel[7].getTotalExpenseMonthly()){
          maxMonthName = "August";
        }
        else if (this.maxMonth == aModel[8].getTotalExpenseMonthly()){
          maxMonthName = "September";
        }
        else if (this.maxMonth == aModel[9].getTotalExpenseMonthly()){
          maxMonthName = "October";
        }
        else if (this.maxMonth == aModel[10].getTotalExpenseMonthly()){
          maxMonthName = "November";
        }
        else if (this.maxMonth == aModel[11].getTotalExpenseMonthly()){
          maxMonthName = "December";
        }

        if (this.minMonth == aModel[0].getTotalExpenseMonthly()){
          minMonthNmae = "January";
        }
        else if (this.minMonth == aModel[1].getTotalExpenseMonthly()){
          minMonthNmae = "February";
        }
        else if (this.minMonth == aModel[2].getTotalExpenseMonthly()){
          minMonthNmae = "March";
        }
        else if (this.minMonth == aModel[3].getTotalExpenseMonthly()){
          minMonthNmae = "April";
        }
        else if (this.minMonth == aModel[4].getTotalExpenseMonthly()){
          minMonthNmae = "May";
        }
        else if (this.minMonth == aModel[5].getTotalExpenseMonthly()){
          minMonthNmae = "June";
        }
        else if (this.minMonth == aModel[6].getTotalExpenseMonthly()){
          minMonthNmae = "July";
        }
        else if (this.minMonth == aModel[7].getTotalExpenseMonthly()){
          minMonthNmae = "August";
        }
        else if (this.minMonth == aModel[8].getTotalExpenseMonthly()){
          minMonthNmae = "September";
        }
        else if (this.minMonth == aModel[9].getTotalExpenseMonthly()){
          minMonthNmae = "October";
        }
        else if (this.minMonth == aModel[10].getTotalExpenseMonthly()){
          minMonthNmae = "November";
        }
        else if (this.minMonth == aModel[11].getTotalExpenseMonthly()){
          minMonthNmae = "December";
        }
        aView.setOutputYearly(String.valueOf(aModel[0].getNetIncomeYearly()), String.valueOf(aModel[0].getNetIncomeMonthly()),
        String.valueOf(yearlyHousing), String.valueOf(yearlyTransportation), String.valueOf(yearlyLiving), String.valueOf(yearlyLifeStyle),
        String.valueOf(yearlySaving), maxMonthName, minMonthNmae);
      }

    }
    else
    {
      System.out.println("Unanticipated error.");
    }
  }

  /**
  *The main method of the Controller class, which instantiates the three objects
  *necessary to run the program as a whole
  */
  public static void main(String[] args)
  {
    View w = new View();
    w.setVisible(true);
    Model[] m = new Model[13];
    Controller thisController = new Controller(w, m);
  }
}
