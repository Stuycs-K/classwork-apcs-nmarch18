import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static boolean checker(String room){

    int length = room.length();

    String checksum = room.substring(length-6).replaceAll("]",""); // separate checksum and letters in room

    room = room.replaceAll("[^a-z]", "");
    length = room.length();

    String key = room.substring(0,length-5);

    System.out.println(checksum);
    System.out.println(key);

    int count;
    int[] counts = new int[5];

    for (int i = 0; i < 5; i++){
      count = 0;
      for (int j = 0; j < key.length(); j++){
        if (key.charAt(j) == checksum.charAt(i)){
          count += 1;
        }
      }
      counts[i] = count;
    }

    System.out.println(Arrays.toString(counts));

    boolean result = true;

    for (int i = 0; i < 4; i++){
      if (result){
        if (counts[i] > counts[i+1]){
          result = true;
        }
        else
        if (counts[i] == counts[i+1]){
          result = (checksum.charAt(i) < checksum.charAt(i+1));
        }
        else
        result = false;
      }
    }

    return result;

  }

  public static int getVal(String room){
    String val = room.replaceAll("[^0-9]", ""); // I saw a regular expression tutorial on w3schools a while back.
    return Integer.parseInt(val); // I could do it the long way but this is much simpler
  }

  public static int getSum(String filename){

    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int sum = 0;
      String room;

      while (input.hasNextLine()){
        room = input.nextLine();
        if (checker(room)){
          sum += getVal(room);
        }
      }
      return sum;
    }

    catch(FileNotFoundException e){
      System.out.println("File not found!");
      return 0;
    }

  }



}
