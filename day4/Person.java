/** This is a person class
*It has name, age and sex as attributes
*/


class Person
{
  private String name;
  private int age;
  private char sex;
  //Employee ep;   <--error
  private int objId;
  public static int ID = 0;


  Person()  //constructor #1
  {
    setName("No name");
    setAge(0);
    setSex('U'); //only use '' for character
    objId = ID;
    ID++;
    objId = ID;
    //ep = new Employee();    <--error
  }

/**
*@parameter name Person's name
*@parameter age Peron's age
*@parameter sex Person's sex
*/

  Person(String name, int age, char sex)  //constructor must have the same name as the class
  {
    setName(name);
    setAge(age);
    setSex(sex);
    objId = ID;
    ID++;
    //ep = new Employee("Developer", 4000); <-- error
  }

/*
  Person(Person P)
  {
    name = P.getname();
    age = P.getAge();
    sex = P.getSex();

  }
*/


//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
//Get age
  public void setAge(int newAge) //Methods:
  {
    age = newAge;
  }

  public int getAge()
  {
    return age;
  }

//Get sex
  public void setSex(char newSex)
  {
    sex = newSex;
  }

  public char getSex()
  {
    return sex;
  }

//Get name
  public void setName(String newName)  //return type must be void
  {
    name = newName;
  }

  public String getName()
  {
    return name;
  }

//Get ID
  public int getId()
  {
    return this.objId;
  }
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

  public int sayAge(int newAge, int a)
  {
    int b = newAge + a;

    return b;
  }

  public static void fullGC()
  {
    Runtime rt = Runtime.getRuntime();
    long isFree = rt.freeMemory();
    long wasFree;
    do
    {
      wasFree = isFree;
      rt.runFinalization();
      rt.gc();
      isFree = rt.freeMemory();
    }while(isFree > wasFree);
  }
  protected void finalize() throws Throwable
  {
    super.finalize();
    ID--;
  }

  public String toString()
  {
    String s = new String();
    s = "Name is: " + this.getName();
    s = s + " Age is: " + this.getAge() + " Sex is:" + this.getSex();
    s = s + " ID is: " + this.objId;
    return s;
  }
    /*

    String temp;

    if (newAge > 20)
    {
      temp = "adult";
    }
    else temp = "kids";

    return temp;

    */

}
