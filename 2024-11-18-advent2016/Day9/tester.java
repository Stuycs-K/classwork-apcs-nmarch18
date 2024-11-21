import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static String decompress(String filename){
    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      




    }

    catch(FileNotFoundException e){
      return null;
    }
  }

  public static int getDecompressedLength(String filename){
    return decompress(filename).length();
  }

}
