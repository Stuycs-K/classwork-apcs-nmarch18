import java.util.*;
import java.security.*;
import java.math.*;

public class tester{

  public static String fiveZeroHash(String id){

    try{
      MessageDigest m = MessageDigest.getInstance("MD5");
      m.reset();
      m.update(id.getBytes());
      byte[] digest = m.digest();
      BigInteger bigInt = new BigInteger(1,digest);

      String hash = bigInt.toString(16);
      while(hash.length() < 32){
        hash = "0"+hash;
      }

      if (hash.substring(0,5).equals("00000")){
        return hash.substring(0,7);
      }
      return "no";
    }

    catch(NoSuchAlgorithmException e){
      return null;
    }

  }

  public static String getPassword(String doorID){
    String pass = "";
    int i = 0;
    while (pass.length() < 8){
      if (fiveZeroHash(doorID + i).length() == 7){
        System.out.println("found " + fiveZeroHash(doorID + i) + " at i = " + i);
        pass += fiveZeroHash(doorID + i).substring(5,6);
      }
      i++;
    }
    return pass;
  }

  public static String getPosPassword(String doorID){
    ArrayList<String> pass = new ArrayList<String>(Arrays.asList("", "", "", "", "", "", "", ""));
    ArrayList<Character> pos = new ArrayList<Character>();
    int i = 0, s = 0;

    while (s < 8){
      String result = fiveZeroHash(doorID+i);
      if (result.length() == 7 && result.charAt(5) <= '7'){
        if (!pos.contains(result.charAt(5))){
          System.out.println("found " + result + " at i = " + i);
          pass.set(Integer.parseInt(result.substring(5,6)), result.substring(6));
          System.out.println("current password slots: " + pass);
          pos.add(result.charAt(5));
          s++;
        }
      }
      i++;
    }

    String password = "";
    for (int x = 0; x < 8; x++){
      password += pass.get(x);
    }

    return password;
  }

}
