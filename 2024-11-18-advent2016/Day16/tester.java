import java.io.*;

public class tester{

  public static String incData(String input){
    StringBuilder rev = new StringBuilder();
    rev.append(input);
    rev.reverse();
    String reverse = rev.toString().replaceAll("0", "2").replaceAll("1", "0").replaceAll("2", "1");
    return (input + "0" + reverse);
  }

  public static String getChecksum(String input, int size){

    while (input.length() < size){
      input = incData(input);
    }
    input = input.substring(0,size);

    StringBuilder str = new StringBuilder();
    str.append(input);
    StringBuilder checksum = new StringBuilder();

    while (str.length() % 2 == 0){
      checksum.setLength(0);
      for (int i = 0; i < str.length()-1; i += 2){
        if (str.charAt(i) == str.charAt(i+1)) {checksum.append(1);}
        else {checksum.append(0);}
        System.out.println("checksum length = " + checksum.length());
      }
      str.setLength(0);
      str.append(checksum.toString());
    }

    return checksum.toString();

  }

}
