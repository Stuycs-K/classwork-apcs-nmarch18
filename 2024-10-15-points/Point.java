public class Point{
  private double x,y;

  public String toString(){
    return ("(" + x + ", " + y + ")");
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    x = other.x;
    y = other.y;
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    return Math.sqrt((Math.pow(this.x - other.x, 2.0) + Math.pow(this.y - other.y, 2.0)));
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code.
  */
  public static double distance(Point a, Point b){
    return (Math.sqrt((Math.pow(a.x - b.x, 2.0) + Math.pow(a.y - b.y, 2.0))));
  }


}
