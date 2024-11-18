import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day2tester{

  public static int getPosition(int start, String filename){
    File file = new File(filename);
    Scanner input = new Scanner(file);

    input.useDelimiter("");

    while (input.hasNext){
      System.out.println(input);
    }

    return 0;
  }

  public static int getCode(String filename){
    File file = new File(filename);
    Scanner input = new Scanner(file);
    String code = "";
    int start = 5;
    int result;
    while (input.hasNextLine()){
      result = getPosition(start, filename);
      code += result;
      start = result;
    }
    return code;
  }

}
