public abstract class Shape extends Object
{
  private Point origin;

  Shape()
  {
    origin = new Point();
  }

  Shape(Point P)
  {
    origin = new Point(P.getX(), P.getY());
  }

  public void setOrigin(Point P)
  {
    origin.setX(P.getX());
    origin.setY(P.getY());
  }

  public Point getOrigin()
  {
    return this.origin;
  }

  public abstract double area();
  public abstract double circumference();



}
