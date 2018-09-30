public class Employee extends Person
{
  double salary;

  Employee()
  {
    super(); //call the default constructor
    salary = 0.0;
  }

  Employee(String name, int age, char sex, double salary)
  {
      super(name, age, sex);
      this.salary = salary;
  }

  public String toString()
  {
    String s = "";
    s = s + this.name + " " + this.age + " " + this. sex + " " + this.salary;
    return s;
  }
}
