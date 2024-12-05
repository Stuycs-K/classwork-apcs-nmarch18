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
        }
        else{
          Text.color(BLUE);
          System.out.print("O");
        }
      }
      Text.wait(5);
    }
    for (int row = 15; row >= 2; row--){
      Text.erase(row,2,78);
      Text.wait(50);
      Text.erase(31-row,2,78);
      Text.wait(50);
    }
  }

  public static int[] addInts(){ // need to save array for the result print
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
    return nums;
  }

  public static void addSeparator(){
    for (int d = 2; d <= 4; d++){
      for (int x = d; x <= 79; x+= 3){
        Text.go(3,x);
        if (x % 2 == 0){
          Text.color(BLUE);
          System.out.print("-");
        }
        else{
          Text.color(CYAN);
          System.out.print("~");
        }
        Text.wait(5);
      }
    }
  }

  public static void addResult(int[] nums){
    int w = 0;
    int l = 0;
    for (int i : nums){
      if (i > 75){w++;}
      if (i < 25){l++;}
    }
    Text.go(5, 35);
    Text.color(Text.bright(YELLOW));
    System.out.print(" * RESULTS * ");
    Text.wait(500);
    Text.go(7, 35);
    Text.color(Text.bright(WHITE));
    System.out.print("Hits: ");
    Text.color(Text.bright(GREEN));
    System.out.print(w);
    Text.wait(500);
    Text.go(9, 35);
    Text.color(Text.bright(WHITE));
    System.out.print("Misses: ");
    Text.color(Text.bright(RED));
    System.out.print(l);
    Text.wait(500);
    Text.go(11, 35);
    Text.color(Text.bright(YELLOW));
    System.out.print(" * PRIZE * ");
    Text.wait(500);
    Text.go(13, 20);
    Text.color(Text.bright(WHITE));
    System.out.print("You ");
    for (int i = 0; i < 3; i++){
      System.out.print(".");
      Text.wait(750);
    }
    if (l > 0){
      System.out.print(" lost! You got a miss. Try again!");
    }
    else if (w == 0){
      System.out.print(" wasted your time! You got nothing. Try again!");
    }
    else{
      System.out.print(" won ");
      if (w == 3){
        System.out.print("the MEGA jackpot of $1.00! Congrats!");
      }
      if (w == 2){
        System.out.print("a prize of $0.10! Congrats!");
      }
      if (w == 1){
        System.out.print("a prize of $0.01! Congrats!");
      }
    }

  }

  public static void main(String[] args){
    System.out.println(CLEAR_SCREEN + HIDE_CURSOR);
    addBorder();
    int[] nums = addInts();
    addSeparator();
    addResult(nums);
    Text.go(31,0);
  }
}
