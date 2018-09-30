public class Circle extends Shape
{
  private double radius;

  Circle()
  {
    super();
    radius = 0.0;
  }

  Circle(Point center, double r)
  {
    super(center);
    this.radius = r;
  }

  public void setRadius(double r)
  {
    this.radius = r;
  }

  public double getRadius()
  {
    return radius;
  }

//Two from Shape.java
  public double area()
  {
    return 3.1416 * this.radius * this.radius;
  }

  public double circumference()
  {
    return 2 * 3.1416 * this.radius;
  }
}
