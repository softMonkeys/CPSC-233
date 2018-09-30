import java.lang.InterruptedException;
import java.io.*;
import java.util.Scanner;



public class threadCounter extends Thread
{
  private View aView;

  private int lowerBound = 0;
  private int upperBound = 0;
  private int increment = 0;
  private int delay = 0;
  private boolean flag;

  FileWriter fw = null;
  PrintWriter pw = null;



  threadCounter(View aView, int alowerBound, int aupperBound, int aincrement, int delayTime, boolean f)
  {
    super();
    this.aView = aView;
    this.lowerBound = alowerBound;
    this.upperBound = aupperBound;
    this.increment = aincrement;
    this.delay = delayTime;
    this.flag = f;
  }

  public void run()
  {
    while (flag == true)
    {
      try
      {
        fw = new FileWriter("data.txt");
        pw = new PrintWriter(fw);
        for(int i = lowerBound; i <= upperBound; i = i + increment)
        {
          pw.println("Counting from " + lowerBound + " to " + upperBound);
          aView.setOutputResult(i);
          pw.println(i);
          this.sleep(delay * 1000);
          if (i == upperBound)
          {
            kill();
          }
        }
        fw.close();
      }
      catch (InterruptedException e)
      {
        return;
      }
      catch (IOException ea)
      {
        System.out.println("Error Wrinting to file");
      }

    }

 }

  public void kill() throws InterruptedException
  {
    this.flag = false;
  }

  public synchronized void pauseThread()
  {
    while (flag == false)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e5)
      {
        return;
      }
    }
  }

  public synchronized void pause()
  {
    this.flag = false;
  }

  public synchronized void resumeThread()
  {
    this.flag = true;
    this.notifyAll();
  }


}
