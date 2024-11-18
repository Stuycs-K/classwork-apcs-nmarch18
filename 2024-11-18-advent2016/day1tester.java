import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day1tester{

  public static int distance(String filename){

    try{

      int xPos = 0;
      int yPos = 0;
      int dir = 1; // 1, 2, 3, 4 are N, E, S, W
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String current;
      String turn;
      int dist;

      input.useDelimiter(", ");

      while (input.hasNext()){

        current = input.next();
        turn = current.substring(0,1);
        if (current.length() >= 2){
          dist = Integer.parseInt(current.substring(1));
        }
        else
        {
          dist = 0;
        }

        if (turn.equals("R")){
          dir += 1;
          if (dir == 5){
            dir = 1;
          }
        }

        if (turn.equals("L")){
          dir -= 1;
          if (dir == 0){
            dir = 4;
          }
        }

        if (dir == 1){
          yPos += dist;
        }

        if (dir == 2){
          xPos += dist;
        }

        if (dir == 3){
          yPos -= dist;
        }

        if (dir == 4){
          xPos -= dist;
        }

        System.out.print("(" + xPos + ", " + yPos + "),");

      }

      return (Math.abs(xPos) + Math.abs(yPos));

    }

    catch(FileNotFoundException e){
      System.out.println("File not found!");
      return 0;
    }

  }

}
