/**
*
*
*/

import java.util.Scanner;

class Driver
{
  public static void main(String[] args)
  {
    /*
    Person jim = new Person();
    Person bob = new Person("Bob", 50, 'm'); //String newName, int newAge, char newSex
    Employee kim = new Employee();
    */
    Scanner in = new Scanner(System.in);

    Person Kim = new Person();

    Person Jim = new Person("Jim", 20, 'M');

    System.out.println(Kim);

    Kim = null;

    System.gc();

    System.out.println("Number of generated Person is: " + Person.ID);

    System.out.println(Jim);

/*
    String name = new String();
    String temp = new String();


    Person [] P = new Person[5];

    for (int i = 0; i < 5; i++)
    {
      P[i] = new Person();
      name = in.nextLine();
      P[i].setName(name);
      age = in.nextInt();
      P[i].setAge(age);
      sex = in.nextchar();
      P[i].setSex(sex);
    }
    for (int i = 0; i < 5; i++)
    {
      System.out.println(P[i].getName());
      System.out.println(P[i].getAge());
      System.out.println(P[i].getSex());
    }

    for (int i = 0; i < 5; i++)
    {
      temp = P[i].getName();

      System.out.println(P[i].getName());
      System.out.println(P[i].getAge());
      System.out.println(P[i].getSex());
    }
/*
    System.out.println(kim.profession);
    System.out.println(kim.salary);

    System.out.println(jim.name);
    System.out.println(jim.age);
    System.out.println(jim.sex);
*/

/*
    System.out.println(bob.getName());  //calling method()
    bob.setName("Jacob");
    System.out.println(bob.getName());  //calling method()
    System.out.println(bob.getAge());
    System.out.println(bob.getSex());
*/

/*
    System.out.println(bob.age);
    System.out.println(bob.sex);
    int temp = bob.sayAge(50, 90);
    System.out.println(temp);
    System.out.println(bob.ep);  <--This will generate error b/c the calss is not variable
*/
  }


}
