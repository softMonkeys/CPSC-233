class Person extends Object
{
  protected String name;
  protected int age;
  protected char sex;

  Person()
  {
    name = "No name";
    age = 0;
    sex = 'u';
  }

  Person(String name, int age, char sex)
  {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public String toString()
  {
    String s = "";
    s = s + this.name + " " + this.age + " " + this. sex;
    return s;
  }

}
