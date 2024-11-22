import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static int decompressA(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String str = input.nextLine(); // whole string
      boolean op = false;
      char c;
      String exp = "";
      String nextX = "";
      String ans = "";
      for (int i = 0; i < str.length(); i++){
        c = str.charAt(i);
        if (c == '('){
          op = true;
        }
        else
        if (c == ')'){
          op = false;
          String[] ops = exp.split("[x]");
          exp = "";
          System.out.println(Arrays.toString(ops));
          nextX = str.substring(i+1,i+Integer.parseInt(ops[0])+1);
          for (int n = 0; n < Integer.parseInt(ops[1]); n++){
            ans += nextX;
          }
          i += nextX.length();
        }
        else
        if (op && c != '('){
          exp += Character.toString(c);
        }
        else{
          ans += Character.toString(c);
        }
      }
      System.out.println(ans);
      return ans.length();
    }
    catch(FileNotFoundException e){
      return 0;
    }
  }

  public static int decompressB(String filename){
    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);

    }
    catch(FileNotFoundException e){
      return 0;
    }
  }


}
