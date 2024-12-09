public class Text{

//use this to convert from color to background (30 to 37 becomes 40 to 47)
public static int background(int color){
  return color + 10;
}
public static int bright(int color){
  return color + 60;
}

//terminal specific character to move the cursor to a location
//top left is 1,1
//row is y (higher numbers go down)
//column is x
public static void go(int row,int col){
    System.out.print("\033[" + row + ";" + col + "H");
}

//Overloarded color commands (give 1 or more colors/modifiers)
public static void color(int m){
  System.out.print ("\033[;" + m + "m");
}
public static void color(int m1, int m2){
  System.out.print ("\033["+ m1 + ";" + m2 + "m");
}
public static void color(int m1, int m2, int m3){
  System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + "m");
}
public static void color(int m1, int m2, int m3, int m4){
  System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + ";"+m4+"m");
}

//And don't forget you can easily delay the printing if needed:
public static void wait(int millis){
  try {
    Thread.sleep(millis);
  }
    catch (InterruptedException e) {
  }
}

//erase (black bakground)
public static void erase(int r, int c, int size){
  go(r,c);
  System.out.print("\033[0m");
  for(int i = 0; i < size;i++){
    System.out.print(" ");
  }
}

}