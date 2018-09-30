import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.*;

public class View extends JFrame
{
	private JTextField input1;
	private JTextField input2;
	private JTextField input3;

	private JButton aButton;
	private JLabel subject1;
	private JLabel subject2;
	private JLabel subject3;
	private Jlabel result;
	private int total = 0;


	private JPanel myPanel;

	public void setEventListener(ActionListener listener)
	{
		aButton.addActionListener(listener);
	}

	public String getInput1()
	{
		return input1.getText();
	}
	public String getInput2()
	{
		return input2.getText();
	}
	public String getInput3()
	{
		return input3.getText();
	}

	public void setOutput(String ouputString)
	{
		this.output.setText(ouputString);
	}


	View()
	{
		super("Student Grading System");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);

		myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(4,2));
		subject1 = new JLabel("Subject 1: ");
		input1 = new JTextField(20);
		subject2 = new JLabel("Subject 2: ");
		input2 = new JTextField(20);
		subject3 = new JLabel("Subject 3: ");
		input3 = new JTextField(20);
		result = new Jlabel("Total: " + total);
		aButton = new JButton("Get Result");
		myPanel.add(subject1);
		myPanel.add(input1);
		myPanel.add(subject2);
		myPanel.add(input2);
		myPanel.add(subject3);
		myPanel.add(input3);
		myPanel.add(result);
		myPanel.add(aButton);

		add(myPanel);

		setVisible(true);


	}



}
