public class Point_3D extends Point
{
  double z;

  Point_3D()
  {
    super();
    z = 0.0;
  }

  Point_3D(double x, double y, double z)
  {
    super(x,y);
    this.z = z;
  }

  public double distance(Point_3D P)
  {
    double dist = Math.sqrt( Math.pow((P1.x - P2.x), 2) + Math.pow((P1.y - P2.y), 2) );
  }


}
