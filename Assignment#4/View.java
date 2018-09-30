/**View
 *
 * @author BenKun Chen
 * @version 1.0 Jun 28, 2016
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;


public class View extends JFrame
{
  private JTextField errorMessage;
  private JTextField ioRental;
  private JTextField ioInsurance;
  private JTextField ioBill;
  private JTextField ioFuel;
  private JTextField ioSubscription;
  private JTextField ioParking;
  private JTextField ioGroceries;
  private JTextField ioClothing;
  private JTextField ioPersionalCare;
  private JTextField ioMedication;
  private JTextField ioDinning;
  private JTextField ioVacation;
  private JTextField ioIncome;
  private JTextField ioTax;
  private JButton confirm;
  private JButton clear;

  private JLabel rentalInstruction;
  private JLabel insuranceInstruction;
  private JLabel billsInstruction;
  private JLabel fuelInstruction;
  private JLabel transportationInstruction;
  private JLabel parkingInstruction;
  private JLabel groceriesInstruction;
  private JLabel clothingInstruction;
  private JLabel personalCareInstruction;
  private JLabel medicationInstruction;
  private JLabel dinningInstruction;
  private JLabel vacationInstruction;

  private JLabel rental_or_mortgage;
  private JLabel insurance_amount;
  private JLabel bills_for_utilites;
  private JLabel fuel_fivth;
  private JLabel transportation_tickets;
  private JLabel parking_fivth;
  private JLabel groceries_fivth;
  private JLabel clothing_fivth;
  private JLabel personal_care;
  private JLabel medication_fivth;
  private JLabel dinning_out;
  private JLabel vacation_fivth;
  private JLabel yearlyIncome;
  private JLabel monthlyIncome;
  private JLabel monthlyHousing;
  private JLabel monthlyTransportation;
  private JLabel monthlyLivingEssentials;
  private JLabel monthlyLifeStyle;
  private JLabel highest;
  private JLabel lowest;
  private JLabel saving;
  private JLabel monthDisplay;

  private JMenuItem january;
  private JMenuItem february;
  private JMenuItem march;
  private JMenuItem april;
  private JMenuItem may;
  private JMenuItem june;
  private JMenuItem july;
  private JMenuItem august;
  private JMenuItem september;
  private JMenuItem october;
  private JMenuItem november;
  private JMenuItem december;
  private JMenuItem analysis;

  public static final int WIDTH = 800;
  public static final int HEIGHT = 1000;
  public static final int FONT_SIZE = 19;

  /**
  *An instance method that register the listeners for button presses, so when
  *the calculate button is clicked whenever an event occurs
  */
  public void setEventListener(ActionListener listener)
  {
    confirm.addActionListener(listener);
    clear.addActionListener(listener);
    january.addActionListener(listener);
    february.addActionListener(listener);
    march.addActionListener(listener);
    april.addActionListener(listener);
    may.addActionListener(listener);
    june.addActionListener(listener);
    july.addActionListener(listener);
    august.addActionListener(listener);
    september.addActionListener(listener);
    october.addActionListener(listener);
    november.addActionListener(listener);
    december.addActionListener(listener);
    analysis.addActionListener(listener);
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getRentalInput(){
    return ioRental.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getInsuranceInput(){
    return ioInsurance.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getBillInput(){
    return ioBill.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getFuelInput(){
    return ioFuel.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getSubscriptionInput(){
    return ioSubscription.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getParkingInput(){
    return ioParking.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getGroceriesInput(){
    return ioGroceries.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getClothingInput(){
    return ioClothing.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getPersionalCareInput(){
    return ioPersionalCare.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getMedicationInput(){
    return ioMedication.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getDinningInput(){
    return ioDinning.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getVacationInput(){
    return ioVacation.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getIncomeInput(){
    return ioIncome.getText();
  }

  /**
  *An instance method that gets user input.
  *@return Returns user input in the JTextField
  */
  public String getTaxInput(){
    return ioTax.getText();
  }

  int v = 1;
  /**
  *An instance method that prints out the result window.
  *@param a Rental or mortgage
  *@param b Insurance amount
  *@param c Bills for utilites
  *@param d Fuel
  *@param e transportation
  *@param f Parking
  *@param g Groceries
  *@param h Clothing
  *@param i Personal care
  *@param j Medication
  *@param k Dinning out
  *@param l Vacation
  *@param m Yearly net income
  *@param n Monthly net income
  *@param o Total housing
  *@param p Total transportation
  *@param q Total living
  *@param r Total life style
  *@param s Highest expense
  *@param t Lowest expense
  *@param u Total saving
  */
  public void setOutputConfirm(String a, String b, String c, String d, String e, String f,
  String g, String h, String i, String j, String k, String l, String m, String n, String o,
  String p, String q, String r, String s, String t, String u)
  {
    if (v > 12)
    {
      v = 12;
    }
    this.rental_or_mortgage.setText("Rental or mortgage: " + a + "$                                    ");
    this.insurance_amount.setText("Insurance amount: " + b + "$");
    this.bills_for_utilites.setText("Bills for utilites: " + c + "$                                    ");
    this.fuel_fivth.setText("Fuel: " + d + "$");
    this.transportation_tickets.setText("transportation: " + e + "$                                    ");
    this.parking_fivth.setText("Parking: " + f + "$");
    this.groceries_fivth.setText("Groceries: " + g + "$                                    ");
    this.clothing_fivth.setText("Clothing: " + h + "$");
    this.personal_care.setText("Personal care: " + i + "$                                    ");
    this.medication_fivth.setText("Medication: " + j + "$");
    this.dinning_out.setText("Dinning out: " + k + "$                                    ");
    this.vacation_fivth.setText("Vacation: " + l + "$");
    this.yearlyIncome.setText("Yearly net income: " + m + "$");
    this.monthlyIncome.setText("Monthly net income: " + n + "$");
    this.monthlyHousing.setText("Total housing: " + o + "$");
    this.monthlyTransportation.setText("Total transportation: " + p + "$");
    this.monthlyLivingEssentials.setText("Total living: " + q + "$");
    this.monthlyLifeStyle.setText("Total life style: " + r + "$");
    this.highest.setText("Highest expense: " + s);
    this.lowest.setText("Lowest expense: " + t);
    this.saving.setText("Total saving: " + u + "$");

    this.monthDisplay.setText("   Month of the year: " + v);
    v++;
  }

  /**
  *An instance method that prints out the month result window.
  *@param a1 Rental or mortgage
  *@param b1 Insurance amount
  *@param c1 Bills for utilites
  *@param d1 Fuel
  *@param e1 transportation
  *@param f1 Parking
  *@param g1 Groceries
  *@param h1 Clothing
  *@param i1 Personal care
  *@param j1 Medication
  *@param k1 Dinning out
  *@param l1 Vacation
  *@param m1 Yearly net income
  *@param n1 Monthly net income
  *@param o1 Total housing
  *@param p1 Total transportation
  *@param q1 Total living
  *@param r1 Total life style
  *@param s1 Highest expense
  *@param t1 Lowest expense
  *@param u1 Total saving
  *@param z Month of the year
  */
  public void setOutputMonths(String a1, String b1, String c1, String d1, String e1, String f1,
  String g1, String h1, String i1, String j1, String k1, String l1, String m1, String n1, String o1,
  String p1, String q1, String r1, String s1, String t1, String u1, int z)
  {
    this.rental_or_mortgage.setText("Rental or mortgage: " + a1 + "$                                    ");
    this.insurance_amount.setText("Insurance amount: " + b1 + "$");
    this.bills_for_utilites.setText("Bills for utilites: " + c1 + "$                                    ");
    this.fuel_fivth.setText("Fuel: " + d1 + "$");
    this.transportation_tickets.setText("transportation: " + e1 + "$                                    ");
    this.parking_fivth.setText("Parking: " + f1 + "$");
    this.groceries_fivth.setText("Groceries: " + g1 + "$                                    ");
    this.clothing_fivth.setText("Clothing: " + h1 + "$");
    this.personal_care.setText("Personal care: " + i1 + "$                                    ");
    this.medication_fivth.setText("Medication: " + j1 + "$");
    this.dinning_out.setText("Dinning out: " + k1 + "$                                    ");
    this.vacation_fivth.setText("Vacation: " + l1 + "$");
    this.yearlyIncome.setText("Yearly net income: " + m1 + "$");
    this.monthlyIncome.setText("Monthly net income: " + n1 + "$");
    this.monthlyHousing.setText("Total housing: " + o1 + "$");
    this.monthlyTransportation.setText("Total transportation: " + p1 + "$");
    this.monthlyLivingEssentials.setText("Total living: " + q1 + "$");
    this.monthlyLifeStyle.setText("Total life style: " + r1 + "$");
    this.highest.setText("Highest expense: " + s1);
    this.lowest.setText("Lowest expense: " + t1);
    this.saving.setText("Total saving: " + u1 + "$");
    this.monthDisplay.setText("   Month of the year: " + z);
  }

  /**
  *An instance method that prints out the yearly result window.
  *@param a2 Yearly net income
  *@param b2 Monthly net income
  *@param c2 Total housing
  *@param d2 Total transportation
  *@param e2 Total living
  *@param f2 Total life style
  *@param h2 Highest expense
  *@param i2 Lowest expense
  *@param g2 Total saving
  */
  public void setOutputYearly(String a2, String b2, String c2, String d2, String e2, String f2,
  String g2, String h2, String i2)
  {
    this.rental_or_mortgage.setText("");
    this.insurance_amount.setText("");
    this.bills_for_utilites.setText("");
    this.fuel_fivth.setText("");
    this.transportation_tickets.setText("");
    this.parking_fivth.setText("");
    this.groceries_fivth.setText("");
    this.clothing_fivth.setText("");
    this.personal_care.setText("");
    this.medication_fivth.setText("");
    this.dinning_out.setText("");
    this.vacation_fivth.setText("");
    this.yearlyIncome.setText("Yearly net income: " + a2 + "$");
    this.monthlyIncome.setText("Monthly net income: " + b2 + "$");
    this.monthlyHousing.setText("Yearly total housing: " + c2 + "$");
    this.monthlyTransportation.setText("Yearly total transportation: " + d2 + "$");
    this.monthlyLivingEssentials.setText("Yearly total living: " + e2 + "$");
    this.monthlyLifeStyle.setText("Yearly total life style: " + f2 + "$");
    this.highest.setText("Highest expense: " + h2);
    this.lowest.setText("Lowest expense: " + i2);
    this.saving.setText("Yearly total saving: " + g2 + "$");
    this.monthDisplay.setText("     -Yearly Analysis-");
  }

  /**
  *An instance method that set all input window to empty string whever user click "clear"
  */
  public void setOutputClear()
  {
    this.ioRental.setText("");
    this.ioInsurance.setText("");
    this.ioBill.setText("");
    this.ioFuel.setText("");
    this.ioSubscription.setText("");
    this.ioParking.setText("");
    this.ioGroceries.setText("");
    this.ioClothing.setText("");
    this.ioPersionalCare.setText("");
    this.ioMedication.setText("");
    this.ioDinning.setText("");
    this.ioVacation.setText("");
    this.ioIncome.setText("");
    this.ioTax.setText("");
  }

  /**
  *An instance method that prints out the error message when user makes invalid input.
  */
  public void setOuputErroeMessage()
  {
    this.errorMessage.setText("                                   Please input valid number!!!");
  }

  /**
  *An instance method that prints out the error message when user gose beyond 12 months array limit.
  */
  public void setOuputArray()
  {
    this.errorMessage.setText("                                         Month out of range!!!");
  }

  /**
  *A constructor for the View class, it is responsible for building the actual GUI itself.
  *It sets attibutes such as window size, defines various JLabel and JTextField, holds JPanels,
  *and uses the border layout manager to organize content.
  */
  public View()
  {
    super("Living Expenses Calculator - BenKun Chen");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(WIDTH, HEIGHT);
    setLayout(new BorderLayout());

    JPanel picture = new JPanel();
    picture.setBackground(Color.LIGHT_GRAY);
    picture.setLayout(new FlowLayout());
    ImageIcon javaIcon = new ImageIcon("java.gif");
    JLabel stand = new JLabel(javaIcon);
    JLabel welcome = new JLabel("Welcome to the Living Expenses Calculator application");
    welcome.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, FONT_SIZE));
    picture.add(stand);
    picture.add(welcome);
    add(picture, BorderLayout.NORTH);

    //Menu Bar
    JMenuBar bar = new JMenuBar();
    JMenu month = new JMenu("-Select Month-");

    january = new JMenuItem("January");
    february = new JMenuItem("February");
    march = new JMenuItem("March");
    april = new JMenuItem("April");
    may = new JMenuItem("May");
    june = new JMenuItem("June");
    july = new JMenuItem("July");
    august = new JMenuItem("August");
    september = new JMenuItem("September");
    october = new JMenuItem("October");
    november = new JMenuItem("November");
    december = new JMenuItem("December");
    JMenu yearAnalysis = new JMenu("-Yearly analysis-");
    analysis = new JMenuItem("Analysis");

    month.add(january);
    month.add(february);
    month.add(march);
    month.add(april);
    month.add(may);
    month.add(june);
    month.add(july);
    month.add(august);
    month.add(september);
    month.add(october);
    month.add(november);
    month.add(december);
    yearAnalysis.add(analysis);
    bar.add(month);
    bar.add(yearAnalysis);
    setJMenuBar(bar);

    //Input Window
    JPanel biggerPanel = new JPanel();
    biggerPanel.setBackground(Color.LIGHT_GRAY);
    biggerPanel.setLayout(new GridLayout(8, 1));

    //Error Message Window
    JPanel errorPanel = new JPanel();
    errorMessage = new JTextField("                   ------I will tell you if you entered something invalid------");
    errorMessage.setBackground(Color.LIGHT_GRAY);
    Font font = new Font("Serif", Font.BOLD|Font.ITALIC, FONT_SIZE);
    errorMessage.setFont(font);
    biggerPanel.add(errorMessage);

    //Housing expenses
    JPanel housingExpenses = new JPanel();
    housingExpenses.setBackground(Color.ORANGE);
    housingExpenses.setLayout(new GridLayout(2, 1));
    JPanel first = new JPanel();
    first.setLayout(new GridLayout(3,2));
    first.setBackground(Color.LIGHT_GRAY);
    JLabel housing = new JLabel("     Housing expenses($): ");
    housing.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, FONT_SIZE));
    rentalInstruction = new JLabel("                             rental or mortgage:");
    ioRental = new JTextField();
    insuranceInstruction = new JLabel("                             insurance amount:");
    ioInsurance = new JTextField();
    billsInstruction = new JLabel("                             bills for utilities:");
    ioBill = new JTextField();
    housingExpenses.add(housing);
    first.add(rentalInstruction);
    first.add(ioRental);
    first.add(insuranceInstruction);
    first.add(ioInsurance);
    first.add(billsInstruction);
    first.add(ioBill);
    housingExpenses.add(first);
    biggerPanel.add(housingExpenses);

    //Transportation expenses
    JPanel transportationExpenses = new JPanel();
    transportationExpenses.setBackground(Color.ORANGE);
    transportationExpenses.setLayout(new GridLayout(2, 1));
    JPanel second = new JPanel();
    second.setBackground(Color.LIGHT_GRAY);
    second.setLayout(new GridLayout(3, 2));
    JLabel transportation = new JLabel("      Transportation expenses($): ");
    transportation.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, FONT_SIZE));
    fuelInstruction = new JLabel("                             fuel:");
    ioFuel = new JTextField();
    transportationInstruction = new JLabel("                             transportation tickets:");
    ioSubscription = new JTextField();
    parkingInstruction = new JLabel("                             parking:");
    ioParking = new JTextField();
    transportationExpenses.add(transportation);
    second.add(fuelInstruction);
    second.add(ioFuel);
    second.add(transportationInstruction);
    second.add(ioSubscription);
    second.add(parkingInstruction);
    second.add(ioParking);
    transportationExpenses.add(second);
    biggerPanel.add(transportationExpenses);

    //Living essentials expenses
    JPanel livingSection = new JPanel();
    livingSection.setBackground(Color.LIGHT_GRAY);
    livingSection.setLayout(new GridLayout(2, 4));

    JPanel livingExpense = new JPanel();
    livingExpense.setLayout(new GridLayout(2, 1));
    livingExpense.setBackground(Color.ORANGE);
    JLabel living = new JLabel("      Living essentials expenses($): ");
    living.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, FONT_SIZE));
    groceriesInstruction = new JLabel("                             groceries:");
    ioGroceries = new JTextField();
    clothingInstruction = new JLabel("                             clothing:");
    ioClothing = new JTextField();
    personalCareInstruction = new JLabel("                       personal care:");
    ioPersionalCare = new JTextField();
    medicationInstruction = new JLabel("                             medication:");
    ioMedication = new JTextField();
    livingExpense.add(living);
    livingSection.add(groceriesInstruction);
    livingSection.add(ioGroceries);
    livingSection.add(clothingInstruction);
    livingSection.add(ioClothing);
    livingSection.add(personalCareInstruction);
    livingSection.add(ioPersionalCare);
    livingSection.add(medicationInstruction);
    livingSection.add(ioMedication);
    livingExpense.add(livingSection);
    biggerPanel.add(livingExpense);

    //Life style expenses
    JPanel lifeStyleEpense = new JPanel();
    lifeStyleEpense.setBackground(Color.ORANGE);
    lifeStyleEpense.setLayout(new GridLayout(2, 1));
    JPanel third = new JPanel();
    third.setBackground(Color.LIGHT_GRAY);
    third.setLayout(new GridLayout(2, 2));
    JLabel life = new JLabel("      Life style expenses($): ");
    life.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, FONT_SIZE));
    dinningInstruction = new JLabel("                             dinning:");
    ioDinning = new JTextField();
    vacationInstruction = new JLabel("                             vacation:");
    ioVacation = new JTextField();
    lifeStyleEpense.add(life);
    third.add(dinningInstruction);
    third.add(ioDinning);
    third.add(vacationInstruction);
    third.add(ioVacation);
    lifeStyleEpense.add(third);
    biggerPanel.add(lifeStyleEpense);

    //Income before tax
    JPanel incomeAndTaxCombine = new JPanel();
    incomeAndTaxCombine.setLayout(new GridLayout(2, 2));
    incomeAndTaxCombine.setBackground(Color.LIGHT_GRAY);

    JPanel fouth = new JPanel();
    fouth.setLayout(new GridLayout(2, 1));
    fouth.setBackground(Color.ORANGE);
    JLabel incomeTitle = new JLabel("     Income($) and Tax(decimal number):");
    incomeTitle.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, FONT_SIZE));
    JLabel income = new JLabel("                             Income before tax: ");
    ioIncome = new JTextField();
    JLabel tax = new JLabel("                             Tax amount: ");
    ioTax = new JTextField();
    fouth.add(incomeTitle);
    incomeAndTaxCombine.add(income);
    incomeAndTaxCombine.add(ioIncome);
    incomeAndTaxCombine.add(tax);
    incomeAndTaxCombine.add(ioTax);
    fouth.add(incomeAndTaxCombine);
    biggerPanel.add(fouth);
    add(biggerPanel, BorderLayout.CENTER);

    //result screen
    JPanel resultScreen = new JPanel();
    resultScreen.setBackground(Color.PINK);
    resultScreen.setLayout(new GridLayout(5, 1));
    JPanel resultScreen2 = new JPanel();
    resultScreen2.setBackground(Color.PINK);

    JPanel firstRow = new JPanel();
    firstRow.setBackground(Color.PINK);
    firstRow.setLayout(new GridLayout(1, 2));
    yearlyIncome = new JLabel();
    monthlyIncome = new JLabel();
    firstRow.add(yearlyIncome);
    firstRow.add(monthlyIncome);

    JPanel secondRow = new JPanel();
    secondRow.setBackground(Color.PINK);
    secondRow.setLayout(new GridLayout(2, 2));
    monthlyHousing = new JLabel();
    monthlyTransportation = new JLabel();
    monthlyLivingEssentials = new JLabel();
    monthlyLifeStyle = new JLabel();
    secondRow.add(monthlyHousing);
    secondRow.add(monthlyTransportation);
    secondRow.add(monthlyLivingEssentials);
    secondRow.add(monthlyLifeStyle);

    JPanel thirdRow = new JPanel();
    thirdRow.setBackground(Color.PINK);
    thirdRow.setLayout(new GridLayout(1, 2));
    highest = new JLabel();
    lowest = new JLabel();
    thirdRow.add(highest);
    thirdRow.add(lowest);

    JPanel fourthRow = new JPanel();
    fourthRow.setBackground(Color.PINK);
    saving = new JLabel();
    fourthRow.add(saving);

    JPanel fivthRow = new JPanel();
    fivthRow.setBackground(Color.PINK);
    fivthRow.setLayout(new GridLayout(6, 2));
    rental_or_mortgage = new JLabel();
    insurance_amount = new JLabel();
    bills_for_utilites = new JLabel();
    fuel_fivth = new JLabel();
    transportation_tickets = new JLabel();
    parking_fivth = new JLabel();
    groceries_fivth = new JLabel();
    clothing_fivth = new JLabel();
    personal_care = new JLabel();
    medication_fivth = new JLabel();
    dinning_out = new JLabel();
    vacation_fivth = new JLabel();
    fivthRow.add(rental_or_mortgage);
    fivthRow.add(insurance_amount);
    fivthRow.add(bills_for_utilites);
    fivthRow.add(fuel_fivth);
    fivthRow.add(transportation_tickets);
    fivthRow.add(parking_fivth);
    fivthRow.add(groceries_fivth);
    fivthRow.add(clothing_fivth);
    fivthRow.add(personal_care);
    fivthRow.add(medication_fivth);
    fivthRow.add(dinning_out);
    fivthRow.add(vacation_fivth);
    resultScreen.add(firstRow);
    resultScreen.add(secondRow);
    resultScreen.add(thirdRow);
    resultScreen.add(fourthRow);
    resultScreen2.add(fivthRow);

    biggerPanel.add(resultScreen);
    biggerPanel.add(resultScreen2);

    //Confirm buttom
    JPanel bottomCockPit = new JPanel();
    bottomCockPit.setLayout(new GridLayout(1, 2));

    JPanel buttonPanel = new JPanel();
    buttonPanel.setBackground(Color.WHITE);
    buttonPanel.setLayout(new FlowLayout());
    confirm = new JButton("Confirm");
    buttonPanel.add(confirm);

    clear = new JButton("Clear");
    buttonPanel.add(clear);

    monthDisplay = new JLabel();
    bottomCockPit.add(buttonPanel);
    bottomCockPit.add(monthDisplay);
    add(bottomCockPit, BorderLayout.SOUTH);
  }

}
