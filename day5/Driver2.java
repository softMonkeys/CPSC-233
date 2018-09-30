import java.util.Scanner;
class Driver2
{
  public static void main(String[] args)
  {
    Bankaccount Ben = new Bankaccount("Ben", 30005337, 3000);
    int withdraw = 0;

    Scanner in = new Scanner(System.in);
    System.out.println("Withdraw money: ");
    withdraw = in.nextInt();
    Ben.setAmount(withdraw);
    System.out.println(Ben);


  }
}
