import java.io.*;
import java.util.*;

public class tester{

  public static int findWinnerA(int amt){

    // initialize array
    ArrayList<int[]> elves = new ArrayList<int[]>();
    for (int a = 1; a < amt+1; a++){
      elves.add(new int[]{a, 1});
    }

    int[] temp;

    // steal
    while (elves.size() > 1){
      elves.remove(1);
      temp = elves.get(0);
      elves.remove(0);
      elves.add(temp);
      System.out.println("elves.size() = " + elves.size());
    }

    return elves.get(0)[0];

  }

  public static int findWinnerB(int amt){

    // initialize array
    ArrayList<int[]> elves = new ArrayList<int[]>();
    for (int a = 1; a < amt+1; a++){
      elves.add(new int[]{a, 1});
    }

    int[] temp;

    // steal
    while (elves.size() > 1){
      elves.remove(elves.size() / 2);
      temp = elves.get(0);
      elves.remove(0);
      elves.add(temp);
      System.out.println("elves.size() = " + elves.size());
    }

    return elves.get(0)[0];

  }

}
