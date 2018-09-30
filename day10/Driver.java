import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Color;

public class Driver
{
  public static final int WIDTH = 600;
  public static final int HEIGHT = 600;

//Name
  public static final int X_Name = 50;
  public static final int Y_Name = 40;
  public static final int Name_width = 100;
  public static final int Name_height = 20;

  public static final int X_NameField = 100;
  public static final int Y_NameField  = 40;
  public static final int NameField_width = 100;
  public static final int NameField_height = 20;

//Age
  public static final int X_Age = 50;
  public static final int Y_Age = 70;
  public static final int Age_width = 100;
  public static final int Age_height = 20;

  public static final int X_AgeField = 100;
  public static final int Y_AgeField = 70;
  public static final int AgeField_width = 100;
  public static final int AgeField_height = 20;


  public static void main(String[] args)
  {
    MyFrame myFrame = new MyFrame("Hello World");
    myFrame.setLayout(null);
    Container c = myFrame.getContentPane();
    c.setBackground(Color.white);
    MyWindowListener aListener = new MyWindowListener();
    myFrame.addWindowListener(aListener);

//Name
    JLabel name = new JLabel("Name:");
    name.setBounds(X_Name, Y_Name, Name_width, Name_height);
    myFrame.add(name);

    JTextField nameField = new JTextField();
    nameField.setBounds(X_NameField, Y_NameField, NameField_width, NameField_height);
    myFrame.add(nameField);

//Age
    JLabel age = new JLabel("Age:");
    age.setBounds(X_Age, Y_Age, Age_width, Age_height);
    myFrame.add(age);

    JTextField ageField = new JTextField();
    ageField.setBounds(X_AgeField, Y_AgeField, AgeField_width, AgeField_height);
    myFrame.add(ageField);

    myFrame.setSize(WIDTH, HEIGHT);
    myFrame.setVisible(true);

//Sex
    JLabel sex = new JLabel("Sex:");

  }



}
