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

  public static void addInts(){
    int[] nums = new int[3];
    for (int i = 0; i < 3; i++){
      nums[i] = (int)(100 * Math.random());
      for (int k = 0; k < 3; k++){
        Text.color(Text.bright(YELLOW));
        Text.go(2,20*i+20);
        System.out.print("?");
        Text.wait(250);
        Text.erase(2,20*i+20,1);
        Text.wait(250);
      }
      Text.go(2,20*i+20);
      Text.color(WHITE);
      if (nums[i] < 25){Text.color(Text.bright(RED));}
      if (nums[i] > 75){Text.color(Text.bright(GREEN));}
      System.out.print(nums[i]);
      Text.wait(100);
    }
  }

  public static void main(String[] args){
    System.out.println(CLEAR_SCREEN + HIDE_CURSOR);
    addBorder();
    addInts();




    Text.go(31,0);
  }
}
