package ThreadExample;

import java.lang.InterruptedException;

public class PingPong extends Thread
{
  private String word;
  private int delay;
  private boolean flag;

  PingPong(String aWord, int delayTime, boolean f)
  {
    super();
    this.word = aWord;
    this.delay = delayTime;
    this.flag = f;
  }

  public void run()
  {
    while(this.flag == true)
    {
      try
      {
        for(;;)
        {
          System.out.println(word);
          this.sleep(delay);
        }
      }
      catch(InterruptedException e)
      {
          return;
      }
    }
  }

  public void kill()
  {
    this.flag = false;
  }
}
