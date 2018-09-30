package ThreadExample;

class Driver
{
  public static void main(String[] args)
  {
    /*
    PingPong p1, p2;
    p1 = new PingPong("Ping", 33);
    p2 = new PingPong("Pong", 100);

    p1.start();
    p2.start();
    */

    Thread t1, t2;
    t1 = new Thread(new PingPong2("Ping", 33));
    t2 = new Thread(new PingPong2("Pong", 100));

    t1.start();
    t2.start();
  }
}
