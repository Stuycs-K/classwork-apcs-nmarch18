import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  // PART 1 (took me too long)

  public static int[][] rect(int[][] input, int x, int y){

    for (int i = 0; i < y; i++){
      for (int j = 0; j < x; j++){
        input[i][j] = 1;
      }
    }

    return input;

  }

  public static int[][] rotateCol(int[][] input, int col, int amt){

    amt %= 6;
    int[] valsC = new int[6];

    for (int i = 0; i < 6; i++){
      valsC[i] = input[i][col];
    }

    for (int i = 0; i < 6; i++){
      if (i - amt >= 0){
        input[i][col] = valsC[i-amt];
      }
      else
      input[i][col] = valsC[i-amt+6];
    }

    return input;

  }

  public static int[][] rotateRow(int[][] input, int row, int amt){

    amt %= 50;
    int[] valsR = new int[50];

    for (int i = 0; i < 50; i++){
      valsR[i] = input[row][i];
    }

    for (int i = 0; i < 50; i++){
      if (i - amt >= 0){
        input[row][i] = valsR[i-amt];
      }
      else
      input[row][i] = valsR[i-amt+50];
    }
    return input;
  }

  public static int getArrayVal(String filename){

    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);

      int[] arguments = new int[2];
      int[][] pixels = new int[6][50];
      String command;

      while (input.hasNextLine()){
        command = input.nextLine();
        if (command.substring(0,4).equals("rect")){
          arguments[1] = Integer.parseInt(command.substring(command.length() - 1));
          arguments[0] = Integer.parseInt(command.substring(5,7).replaceAll("[^0-9]",""));
          pixels = rect(pixels, arguments[0], arguments[1]);
        }
        else
        if (command.substring(0,10).equals("rotate col")){
          arguments[1] = Integer.parseInt(command.substring(command.length() - 1));
          arguments[0] = Integer.parseInt(command.substring(16,18).replaceAll("[^0-9]",""));
          pixels = rotateCol(pixels, arguments[0], arguments[1]);
        }
        else
        if (command.substring(0,10).equals("rotate row")){
          arguments[0] = Integer.parseInt(command.substring(13,14));
          arguments[1] = Integer.parseInt(command.substring(18).replaceAll("[^0-9]",""));
          pixels = rotateRow(pixels, arguments[0], arguments[1]);
        }
      }

      int count = 0;
      String[][] pictureArray = new String[6][50];

      for (int i = 0; i < 6; i++){
        for (int j = 0; j < 50; j++){
          if (pixels[i][j] == 1){
            count += 1;
            pictureArray[i][j] = "█";
          }
          else
          pictureArray[i][j] = " ";
        }
      }

      // This is part 2. I really loved this day's premise

      for (int i = 0; i < 6; i++){
        System.out.println(Arrays.toString(pictureArray[i]));
      }

      return count;

    }

    catch(FileNotFoundException e){
      return 0;
    }

  }
}
