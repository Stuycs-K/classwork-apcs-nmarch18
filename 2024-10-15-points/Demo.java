public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return (Math.sqrt((Math.pow(a.getX() - b.getX(), 2.0) + Math.pow(a.getY() - b.getY(), 2.0))));
  }

  public static void main(String[]args){
    // make point objects
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);

    // TESTS
    System.out.println("toString test: expected coordinates (1.0, 1.0), (-1.0, -1.0), (3.0, 4.0)");
    System.out.println( p1);
    System.out.println( p2);
    System.out.println( p3 + "\n");

    System.out.println("distance methods test1: expected sqrt8 (~2.8284)");
    System.out.println( distance(p2,p1));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p2.distanceTo(p1) + "\n");

    System.out.println("distance methods test2: expected sqrt13 (~3.6056)");
    System.out.println( distance(p1,p3));
    System.out.println( Point.distance(p3,p1));
    System.out.println( p1.distanceTo(p3) + "\n");

    System.out.println("distance methods test3: expected sqrt41 (~6.4031)");
    System.out.println( distance(p3,p2));
    System.out.println( Point.distance(p2,p3));
    System.out.println( p3.distanceTo(p2) + "\n");

  }
}
