import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static boolean validate(String ip){

  }

  public static int countIPs(String filename){

    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      String ip;

      while (input.hasNextLine()){
        ip = input.nextLine();
        if (validate(ip)){
          count += 1;
        }
      }

      return count;

    }

    catch(FileNotFoundException e){
      return 0;
    }

  }

}
