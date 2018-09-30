import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class View extends JFrame
{
  private int number;
  private JTextField ioUpperBound;
  private JTextField ioLowerBound;
  private JTextField ioIncrement;
  private JTextField ioDelay;
  private JTextField errorMessage;
  private JTextArea window;

  private JButton start;
  private JButton pause;
  private JButton continueButton;


  public static final int WIDTH = 700;
  public static final int HEIGHT = 500;
  public static final int WELCOME_FONT_SIZE = 19;
  public static final int INPUT_FONT_SIZE = 14;


  public String getUpperBoundInput(){
    return ioUpperBound.getText();
  }
  public String getLowerBoundInput(){
    return ioLowerBound.getText();
  }
  public String getIncrementInput(){
    return ioIncrement.getText();
  }
  public String getDelayInput(){
    return ioDelay.getText();
  }

  public void setOutputResult(int number)
  {
    this.window.append(number + " ");
  }


  public void setEventListener(ActionListener listener)
  {
    start.addActionListener(listener);
    pause.addActionListener(listener);
    continueButton.addActionListener(listener);
  }

  public void setOutputErrorMesssage()
  {
    this.errorMessage.setText("           invalid input!!");
  }

  public View()
  {
    super("Counter Simulator - BenKun Chen");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(WIDTH, HEIGHT);
    setLayout(new BorderLayout());

    JPanel picture = new JPanel();
    picture.setBackground(Color.LIGHT_GRAY);
    picture.setLayout(new FlowLayout());
    ImageIcon javaIcon = new ImageIcon("java.gif");
    JLabel stand = new JLabel(javaIcon);
    JLabel stand1 = new JLabel(javaIcon);
    JLabel welcome = new JLabel("Welcome to the Counter Simulator");
    welcome.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, WELCOME_FONT_SIZE));
    picture.add(stand);
    picture.add(welcome);
    picture.add(stand1);
    add(picture, BorderLayout.NORTH);

    //JTextArea
    JPanel textPanel = new JPanel();
    window = new JTextArea(16, 12);
    window.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    window.setLineWrap(true);
    JScrollPane scrolledText = new JScrollPane(window);
    scrolledText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    textPanel.add(scrolledText);

    add(textPanel, BorderLayout.CENTER);

    //inputs
    JPanel inputs = new JPanel();
    JPanel seperate = new JPanel();
    inputs.setBackground(Color.ORANGE);
    inputs.setLayout(new GridLayout(4,2));
    seperate.setLayout(new GridLayout(2, 1));
    JLabel upperBoundNumber = new JLabel("  upper bound number: ");
    upperBoundNumber.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    ioUpperBound = new JTextField();
    ioUpperBound.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    JLabel lowerBoundNumber = new JLabel("  lower bound number: ");
    lowerBoundNumber.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    ioLowerBound = new JTextField();
    ioLowerBound.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    JLabel incrementNumber = new JLabel(" counter's increment: ");
    incrementNumber.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    ioIncrement = new JTextField();
    ioIncrement.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    JLabel delayNumber = new JLabel(" delay between each count(s): ");
    delayNumber.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    ioDelay = new JTextField();
    ioDelay.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    errorMessage = new JTextField("     --I will tell you if you entered something invalid--");
    errorMessage.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, INPUT_FONT_SIZE));
    inputs.add(upperBoundNumber);
    inputs.add(ioUpperBound);
    inputs.add(lowerBoundNumber);
    inputs.add(ioLowerBound);
    inputs.add(incrementNumber);
    inputs.add(ioIncrement);
    inputs.add(delayNumber);
    inputs.add(ioDelay);
    seperate.add(inputs);
    seperate.add(errorMessage);
    add(seperate, BorderLayout.WEST);

    //button
    JPanel buttonPanel = new JPanel();
    buttonPanel.setBackground(Color.WHITE);
    buttonPanel.setLayout(new FlowLayout());
    start = new JButton("start");
    buttonPanel.add(start);
    pause = new JButton("pause");
    buttonPanel.add(pause);
    continueButton = new JButton("continue");
    buttonPanel.add(continueButton);
    add(buttonPanel, BorderLayout.SOUTH);


  }
}
