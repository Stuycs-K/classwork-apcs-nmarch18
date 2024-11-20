import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static boolean validateABBA(String ip){

    boolean inHypernet = false;
    boolean hasABBA = false;

    for (int i = 0; i < ip.length() - 3; i++){
      if (ip.charAt(i+3) == '['){
        inHypernet = true;
      }
      if (ip.charAt(i+3) == ']'){
        inHypernet = false;
      }
      if (ip.charAt(i) == ip.charAt(i+3) && ip.charAt(i+1) == ip.charAt(i+2) && ip.charAt(i) != ip.charAt(i+1)){
        if (inHypernet){
          return false;
        }
        else{
          hasABBA = true;
        }
      }
    }

    return hasABBA;

  }

  public static int countABBA(String filename){

    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      String ip;

      while (input.hasNextLine()){
        ip = input.nextLine();
        if (validateABBA(ip)){
          count += 1;
        }
      }

      return count;

    }

    catch(FileNotFoundException e){
      return 0;
    }

  }

  public static boolean validateSSL(String ip){

    boolean inHypernet = false;
    boolean hasSSL = false;
    char a = ' ';
    char b = ' ';

    for (int i = 0; i < ip.length() - 2; i++){
      if (ip.charAt(i+2) == '['){
        inHypernet = true;
      }
      if (ip.charAt(i+2) == ']'){
        inHypernet = false;
      }
      if (!inHypernet && ip.charAt(i) == ip.charAt(i+2) && Character.isAlphabetic(ip.charAt(i+1))){
        a = ip.charAt(i);
        b = ip.charAt(i+1);

        for (int j = 0; j < ip.length() - 2; j++){

          if (ip.charAt(j+2) == '['){
            inHypernet = true;
          }

          if (ip.charAt(j+2) == ']'){
            inHypernet = false;
          }

          if (inHypernet && ip.charAt(j) == b && ip.charAt(j+1) == a && ip.charAt(j+2) == b){
            hasSSL = true;
          }
        }
      }
    }
    return hasSSL;
  }

  public static int countSSL(String filename){

    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      String ip;

      while (input.hasNextLine()){
        ip = input.nextLine();
        if (validateSSL(ip)){
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
