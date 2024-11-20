import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static int returnBot(String filename){

    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      String step;
      int[][] chips = new int[210][2];
      int giver;
      int taker1;
      int taker2;

      while (input.hasNextLine()){
        step = input.nextLine();
        if (step.contains("gives")){

        }
        else
        if (step.contains("goes")){

        }
      }

      return count;

    }

    catch(FileNotFoundException e){
      return 0;
    }

  }
}
