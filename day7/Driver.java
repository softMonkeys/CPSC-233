class Driver
{
  public static void main(String []args)
  {
    Point P = new Point(6, 4);

    Shape C = new Circle(P, 3);
    double a = C.area();
    double b = C.circumference();

    Shape R = new Rectangle(P, 2, 2);
    double c = R.area();
    double d = R.circumference();

    System.out.println("Circle:");
    System.out.println("Area is: " + a + " circumference is: " + b);
    System.out.println("Rectangle:");
    System.out.println("Area is: " + c + " circumference is: " + d);
  }
}
