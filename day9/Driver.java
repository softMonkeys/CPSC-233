import java.util.Scanner;
import java.io.*;


public class Driver
{
  final static int MAX = 4;
  public static void main(String[] args)
  {
    String line = null;
    String [] paragraph = null;
    int i;
    Scanner in;

    PrintWriter pw = null;
    FileWriter fw = null;
    BufferedReader br = null;
    FileReader fr = null;

    in = new Scanner(System.in);
    paragraph = new String[MAX];

    for (i = 0; i < MAX; i++)
    {
      System.out.println("Enter line of text: ");
      line = in.nextLine();
      paragraph[i] = line;
    }

    try
    {
      fw = new FileWriter("data.text"); //it opens a file
      pw = new PrintWriter(fw);
      for (i = 0; i < MAX; i++)
      {
        pw.println(paragraph[i]);
      }
      fw.close();
    }
    catch(IOException e)
    {
      System.out.println("Error Wrinting to file");
    }

    try
    {
      fr = new FileReader("read.text");
      br = new BufferedReader(fr);
      line = br.readLine();
      if (line == null)
      {
        System.out.println("Empty File");
      }

      while (line != null)
      {
        System.out.println(line);
        line = br.readLine();
      }
      fr.close();
    }

    catch(FileNotFoundException e)
    {
      System.out.println("File doesn't exist");
    }
    catch(IOException e)
    {
      System.out.println("Difficult to read");
    }
  }




}
