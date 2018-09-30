package ThreadExample;

class PingPong2 extends Object implements Runnable
{
  private String word;
  private int delay;

  PingPong2(String aWord, int delayTime)
  {
    super();
    this.word = aWord;
    this.delay = delayTime;
  }

  public void run()
  {
    try
    {
      for(;;)
      {
        System.out.println(word);
        Thread.sleep(delay);
      }
    }
    catch(InterruptedException e)
    {
        return;
    }

  }
}
