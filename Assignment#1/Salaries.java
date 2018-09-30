//import java scanner
import java.util.Scanner;

//main() method
class Salaries
{
  public static void main(String [] args)
  {
    //create an object of the Scanner which is called the "scannerObject"
    Scanner scannerObject = new Scanner(System.in);

    //variables for storing the user's initial and salaries in a string
    String initial = "";
    String data = "";
    String space = "                           ";
    double salaries = 0;
    double sum = 0;
    int total = 0;

    //variables for the Maximum and Minimum salaries
    double min = 9999999;
    double max = -9999999;

    //variables for the Bonus:
    //numbers of developers’ level of seniority
    int internship_developer = 0;
    int junior_developer = 0;
    int developer = 0;
    int senior_developer = 0;
    int project_lead_developer = 0;
    int technical_leader = 0;

    //the range of salaries
    int min_internship_salary = -1;
    int max_internship_salary = 50000;
    int min_junior_salary = 50000;
    int max_junior_salary = 59999;
    int min_developer_salary = 60000;
    int max_developer_salary = 74999;
    int min_senior_salary = 75000;
    int max_senior_salary = 94999;
    int min_project_lead_salary = 95000;
    int max_project_lead_salary = 109999;
    int min_technical_salary = 110000;

    //total sum of salaries for developers’ level of seniority
    double internship_developer_sum = 0;
    double junior_developer_sum = 0;
    double developer_sum = 0;
    double senior_developer_sum = 0;
    double project_lead_developer_sum = 0;
    double technical_leader_sum = 0;

    //average salaries for developers’ level of seniority
    double internship_developer_average = 0;
    double junior_developer_average = 0;
    double developer_average = 0;
    double senior_developer_average = 0;
    double project_lead_developer_average = 0;
    double technical_leader_average = 0;

    //print out the welcome screen
    System.out.println("******************************************");
    System.out.println("Welcome to the Developer salaries Program!");
    System.out.println("******************************************");

    //create a while loop, which asks user input their initials and salaries
    while (true)
    {
      //print out the questions and make user input
      System.out.println("Please enter your initial: ");
      initial = scannerObject.nextLine();
      System.out.println("Please enter your annual salary: ");
      //checks if the user input a "Double" number; if not, go to else statement
      if (scannerObject.hasNextDouble())
        {
          salaries=scannerObject.nextDouble();
          //checks if user input a empty initial or a sentinel value of -1 or less
          if (initial.isEmpty() || salaries <= -1 || initial.contains(" "))
          {
            //checks if there is zero user input in the storage in order to avoid displaying wrong data
            if (total == 0)
            {
              System.out.println("You have entered nothing");
              break;
            }
            //list all initials and their salaries and then display all the statistics
            else
            {

              System.out.println("********************************************************************************");
              System.out.println("NAME:                            SALARY:");
              System.out.println(" ");
              System.out.println(data);
              System.out.println("*********************************************************************************");
              System.out.println("Total salaries entered: " + total);
              System.out.println("Minimum salary: " + "$" + min);
              System.out.println("Maximum salary: " + "$" + max);
              System.out.println("Sum of salaries: " + "$" + sum);
              System.out.println("********************************************************************************");
              System.out.println("|   DEVELOPERS' LEVEL OF SENIORITY  | NUMBER(S) |         AVERAGE($)       |");
              System.out.println("|___________________________________|___________|__________________________|");
              System.out.println("|       Internship Developer        |" + "    " + internship_developer + "      |  Average salary: $" + internship_developer_average + "|");
              System.out.println("|           Junior Developer        |" + "    " + junior_developer + "      |  Average salary: $" + junior_developer_average + "|");
              System.out.println("|             Developer             |" + "    " + developer + "      |  Average salary: $" + developer_average + "|");
              System.out.println("|           Senior Developer        |" + "    " + senior_developer + "      |  Average salary: $" + senior_developer_average + "|");
              System.out.println("|      Project Lead Developer       |" + "    " + project_lead_developer + "      |  Average salary: $" + project_lead_developer_average + "|");
              System.out.println("|        Technical Developer        |" + "    " + technical_leader + "      |  Average salary: $" + technical_leader_average + "|");
              System.out.println("********************************************************************************");
              break;
            }
          }
          //continue if the user input is valid
          else
          {
            //sort the Maximum and Minimum values of the salaries
            if (max < salaries)
            {
              max = salaries;
            }
            if (min > salaries)
            {
              min = salaries;
            }
            //keep track of the distribution of developers’ level of seniority
            if (salaries > min_internship_salary && salaries < max_internship_salary)
            {
              internship_developer += 1;
              internship_developer_sum += salaries;
              internship_developer_average = internship_developer_sum / internship_developer;
            }
            if (salaries >= min_junior_salary && salaries <= max_junior_salary)
            {
              junior_developer += 1;
              junior_developer_sum += salaries;
              junior_developer_average = junior_developer_sum / junior_developer;
            }
            if (salaries >= min_developer_salary && salaries <= max_developer_salary)
            {
              developer += 1;
              developer_sum += salaries;
              developer_average = developer_sum / developer;
            }
            if (salaries >= min_senior_salary && salaries <= max_senior_salary)
            {
              senior_developer += 1;
              senior_developer_sum += salaries;
              senior_developer_average = senior_developer_sum / senior_developer;
            }
            if (salaries >= min_project_lead_salary && salaries <= max_project_lead_salary)
            {
              project_lead_developer += 1;
              project_lead_developer_sum += salaries;
              project_lead_developer_average = project_lead_developer_sum / project_lead_developer;
            }
            if (salaries >= min_technical_salary)
            {
              technical_leader += 1;
              technical_leader_sum += salaries;
              technical_leader_average = technical_leader_sum / technical_leader;
            }
            //adding the salaries each time the user input
            sum += salaries;
            //adding the total user input each time the user input
            total += 1;
            //convert the salaries(int) to a string in order to store it in the data
            String salariesAsString = Double.toString(salaries);
            //storage for the user inputs
            data = data + initial + space + "$" + salaries + "\n";
            scannerObject.nextLine();
          }
        }
      //if the user input invalid salary
      else
        {
          System.out.println("------Please enter a valid salaries------");
          scannerObject.nextLine();
        }
      }
  }
}

/*
A java Developer Salaries Program, by
BenKun Chen <benkun.chen@ucalgary.ca>.
*/
