import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  // PART 1

  public static boolean checker(String room){

    int length = room.length();

    String checksum = room.substring(length-6).replaceAll("]",""); // separate checksum and letters in room
    char[] checksumArr = new char[5];

    for (int i = 0; i < 5; i++){
      checksumArr[i] = checksum.charAt(i);
    }

    room = room.replaceAll("[^a-z]", "");
    length = room.length();

    String key = room.substring(0,length-5);

    int count;
    int[] counts = new int[26];

    for (int i = 0; i < 26; i++){
      count = 0;
      for (int j = 0; j < key.length(); j++){
        if (key.charAt(j) == 'a' + i){
          count += 1;
        }
      }
      counts[i] = count;
    }

    char[] topLetters = new char[5];
    int maxCount = -1;
    int index;

    for (int i = 0; i < 5; i++){
      maxCount = 0;
      index = 0;
      for (int j = 0; j < 26; j++){
        if (counts[j] > maxCount){
          maxCount = counts[j];
          index = j;
        }
      }
      topLetters[i] = (char)('a' + index);
      counts[index] = -1;
    }

    return (Arrays.equals(checksumArr, topLetters));

  }

  public static int getID(String room){
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
          sum += getID(room);
        }
      }
      return sum;
    }

    catch(FileNotFoundException e){
      System.out.println("File not found!");
      return 0;
    }

  }

  // PART 2

  public static boolean hasObjects(String room, int id){

    room = room.replaceAll("[^a-z], [^-]", "");

    String key = room.substring(0,room.length()-7);

    String decrypted = "";
    int offset = id % 26;
    char decryptedChar;

    for (int i = 0; i < key.length(); i++){
      if (key.charAt(i) == '-'){
        decryptedChar = '-';
      }
      else
      decryptedChar = (char)(key.charAt(i) + offset);
      if (decryptedChar > 122){
        decryptedChar -= 26;
      }
      decrypted += Character.toString(decryptedChar);
    }

    decrypted = decrypted.substring(0,decrypted.length()-4);
    return (decrypted.equals("northpole-object-storage"));
    
  }

  public static int findObjects(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int id = 0;
      String room;

      while (input.hasNextLine()){
        room = input.nextLine();
        if (hasObjects(room, getID(room))){
          id = getID(room);
        }
      }
      return id;
    }

    catch(FileNotFoundException e){
      System.out.println("File not found!");
      return 0;
    }
  }
