import java.lang.Math;

class Point extends Object
{
  protected double x;
  protected double y;

  public Point()
  {
    x = 0;
    y = 0;
  }

  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public static double distance(Point P2, Point P1)
  {
    double dist = Math.sqrt( Math.pow((P1.x - P2.x), 2) + Math.pow((P1.y - P2.y), 2) );
    return dist;
  }

}
