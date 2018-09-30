public class Model
{

	private String name;
	private int grade = 0;
	private char letterGrade;
	private int total = 0;
	private int[3] marks;

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getGrade()
	{
		return grade;
	}
	public void setGrade(int grade)
	{
		this.grade = mark[0] + mark[1] + mark[2];
	}

	public char getLetterGrade()
	{
		return letterGrade;
	}
	public void setLetterGrade(char letter)
	{
		this.letterGrade = letter;
	}

	public void setResult(int total)
	{
		this.total = this.total + total;
	}

	public int getResult()
	{
		return this.total;
	}



	public void calculateLetterGrade()
	{
		if(grade>=90)
			letterGrade = 'A';
		else if(grade >=80)
			letterGrade = 'B';

		else if(grade >=70)
			letterGrade = 'C';
		else letterGrade = 'F';
	}



}
