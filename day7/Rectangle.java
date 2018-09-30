public class Rectangle extends Shape
{
  private double length;
  private double width;

  Rectangle()
  {
    super();
    length = 0.0;
    width = 0.0;
  }

  Rectangle(Point center, double l, double w)
  {
    super(center);
    this.length = l;
    this.width = w;
  }

  public void setLength(double l)
  {
    this.length = l;
  }

  public void setwidth(double w)
  {
    this.width = w;
  }

  public double getLength()
  {
    return length;
  }

  public double getWidth()
  {
    return width;
  }

  //2 from shape.java
  public double area()
  {
    return this.length * this.width;
  }

  public double circumference()
  {
    return this.length * 2 + this.width * 2;
  }
}
