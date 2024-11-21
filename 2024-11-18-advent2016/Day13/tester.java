import java.util.*;

public class tester{

  public static int oneBitCounter(int input){

    String binary = Integer.toBinaryString(input);
    int countOnes = 0;

    for (int i = 0; i < binary.length(); i++){
      if (binary.charAt(i) == '1'){
        countOnes += 1;
      }
    }
    return countOnes;

  }

  public static void getDiagram(int fav){

    String[][] diagram = new String[50][50];

    for (int x = 0; x < 50; x++){
      for (int y = 0; y < 50; y++){
        if (oneBitCounter(x*x + 3*x + 2*x*y + y + y*y + fav) % 2 == 0){
          diagram[y][x] = "_";
        }
        else
        if (oneBitCounter(x*x + 3*x + 2*x*y + y + y*y + fav) % 2 == 1){
          diagram[y][x] = "█";
        }
      }
    }

    diagram[39][31] = "X";
    diagram[1][1] = "O";

    for (int i = 0; i < 50; i++){
      System.out.println(Arrays.toString(diagram[i]));
    }

    // At this point I solved the maze by filling in all dead ends (not hard). I'm not sure how you would do that in Java.

  }

}
