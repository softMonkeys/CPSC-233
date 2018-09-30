public class Driver extends Point
{
  public static void main(String []args)
  {
    Point P1 = new Point(0,0);
    Point P2 = new Point(3,4);

    double distance = Point.distance(P2, P1);

    System.out.println(distance);

  }
}
