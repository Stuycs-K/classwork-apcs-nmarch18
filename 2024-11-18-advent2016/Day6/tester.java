import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static String getMessageA(String filename){

    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);

      String[] strings = new String[]{"", "", "", "", "", "", "", ""};
      String current;

      while (input.hasNextLine()){
        current = input.nextLine();
        for (int i = 0; i < 8; i++){
          strings[i] += Character.toString(current.charAt(i));
        }
      }

      System.out.println(Arrays.toString(strings));

      String ans = "";
      String mostCommon;
      int maxCount;
      int count;

      for (int i = 0; i < 8; i++){

        maxCount = 0;
        mostCommon = "";

        for (char c = 'a'; c <= 'z'; c++){
          count = 0;
          for (int j = 0; j < strings[i].length(); j++){
            if (c == strings[i].charAt(j)){
              count += 1;
            }
          }
          if (count > maxCount){
            maxCount = count;
            mostCommon = Character.toString(c);
          }
        }

        ans += mostCommon;

      }

      return ans;

    }
    catch(FileNotFoundException e){
      System.out.println("File not found!");
      return null;
    }
  }

  public static String getMessageB(String filename){

    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);

      String[] strings = new String[]{"", "", "", "", "", "", "", ""};
      String current;

      while (input.hasNextLine()){
        current = input.nextLine();
        for (int i = 0; i < 8; i++){
          strings[i] += Character.toString(current.charAt(i));
        }
      }

      System.out.println(Arrays.toString(strings));

      String ans = "";
      String leastCommon;
      int minCount = 100;
      int count;

      for (int i = 0; i < 8; i++){

        minCount = 100;
        leastCommon = "";

        for (char c = 'a'; c <= 'z'; c++){
          count = 0;
          for (int j = 0; j < strings[i].length(); j++){
            if (c == strings[i].charAt(j)){
              count += 1;
            }
          }
          if (count < minCount){
            minCount = count;
            leastCommon = Character.toString(c);
          }
        }

        ans += leastCommon;

      }

      return ans;

    }
    catch(FileNotFoundException e){
      System.out.println("File not found!");
      return null;
    }
  }


}
