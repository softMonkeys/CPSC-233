import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener
{

	private View aView;
	private Model aStudent;

	Controller(View aView, Model aStudent)
	{
		this.aView = aView;
		this.aStudent = aStudent;
		aView.setEventListener((ActionListener) this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String stdName = aView.getInput1();
		String input2 = aView.getInput2();
		String input3 = aView.getInput3();

		aStudent.setName(stdName);
		int grade = Integer.parseInt(aView.getInput2());
		aStudent.setGrade(grade);
		aStudent.calculateLetterGrade();

		char letterGrade = aStudent.getLetterGrade();
		aView.setOutput(String.valueOf(letterGrade));

	}

	public static void main(String []args)
	{
		View aView = new View();
		Model aStudent = new Model();
		Controller thisController = new Controller(aView, aStudent);

	}


}
