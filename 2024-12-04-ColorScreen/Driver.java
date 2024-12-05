public class Driver{

  public static final int BRIGHT = 1;
  public static final int DARK = 2;
  public static final int ITALICS = 3;
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;
  public static final String CLEAR_SCREEN =  "\033[2J";
  public static final String HIDE_CURSOR =  "\033[?25l";
  public static final String SHOW_CURSOR =  "\033[?25h";
  public static final String RESET = "\033[0m"+SHOW_CURSOR;

  public static void addBorder(){
    for (int y = 1; y <= 30; y++){
      for (int x = 1; x <= 80; x++){
        Text.go(y,x);
        if ((x + y) % 2 == 0){
          Text.color(CYAN);
          System.out.print("X");
          Text.wait(1);
        }
        else{
          Text.color(BLUE);
          System.out.print("O");
          Text.wait(1);
        }
      }
    }
    for (int row = 15; row >= 2; row--){
      Text.erase(row,2,78);
      Text.wait(50);
      Text.erase(31-row,2,78);
      Text.wait(50);
    }
  }

  public static void example(){
  Text.go(14,20);
  Text.color(YELLOW,Text.background(BLUE),ITALICS);
  System.out.print("ITALICS FISH!~~~~");
  Text.go(12,10);
  Text.color(GREEN,Text.background(YELLOW),BRIGHT);
  System.out.print("_#o.o#_");
  Text.wait(500);
  Text.erase(14,20,2);
  Text.wait(500);
  Text.erase(14,22,2);
  Text.wait(500);
  Text.erase(14,24,2);
  Text.wait(500);
  Text.erase(14,26,2);
  Text.go(15,0);
  System.out.println(RESET);
  }

  public static void main(String[] args){
    System.out.println(CLEAR_SCREEN);
    addBorder();
    Text.go(31,0);
  }
}
