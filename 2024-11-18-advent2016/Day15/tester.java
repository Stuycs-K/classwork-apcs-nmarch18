import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static int findTimeA(String filename){
    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      String command;
      int len;
      int n = 0;
      int[] wheel = new int[6];
      int[] pos0 = new int[6];

      while (input.hasNextLine()){
        command = input.nextLine();
        len = command.length();
        wheel[n] = Integer.parseInt(command.substring(12,14).replaceAll("[^0-9]", ""));
        pos0[n] = Integer.parseInt(command.substring(len-3).replaceAll("[^0-9]", ""));
        n += 1;
      }

      System.out.println(Arrays.toString(wheel));
      System.out.println(Arrays.toString(pos0));

      int[] waits = new int[6];

      for (int i = 0; i < 6; i++){
        waits[i] = wheel[i] - pos0[i] - (i+1);
        if (waits[i] < 0){
          waits[i] += wheel[i];
        }
        if (waits[i] < 0){
          waits[i] += wheel[i];
        }
        if (waits[i] < 0){
          waits[i] += wheel[i];
        }
      }

      System.out.println(Arrays.toString(waits));

      // The GCD of the 6 primes is like 400k. You only have to check up to there for the one time that works.

      boolean check = true;

      for (int ans = 0; ans < 500000; ans++){
        check = true;
        for (int k = 0; k < 6; k++){
          if (ans % wheel[k] != waits[k]){
            check = false;
          }
        }
        if (check){return ans;}
      }

      return 0;

    }

    catch(FileNotFoundException e){
      return 0;
    }
  }

  public static int findTimeB(String filename){
    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      String command;
      int len;
      int n = 0;
      int[] wheel = new int[7];
      int[] pos0 = new int[7];

      while (input.hasNextLine()){
        command = input.nextLine();
        len = command.length();
        wheel[n] = Integer.parseInt(command.substring(12,14).replaceAll("[^0-9]", ""));
        pos0[n] = Integer.parseInt(command.substring(len-3).replaceAll("[^0-9]", ""));
        n += 1;
      }

      wheel[6] = 11;
      pos0[6] = 0;

      System.out.println(Arrays.toString(wheel));
      System.out.println(Arrays.toString(pos0));

      int[] waits = new int[7];

      for (int i = 0; i < 7; i++){
        waits[i] = wheel[i] - pos0[i] - (i+1);
        if (waits[i] < 0){
          waits[i] += wheel[i];
        }
        if (waits[i] < 0){
          waits[i] += wheel[i];
        }
        if (waits[i] < 0){
          waits[i] += wheel[i];
        }
      }

      System.out.println(Arrays.toString(waits));

      // The GCD of the 7 primes is like 5M. You only have to check up to there for the one time that works.

      boolean check = true;

      for (int ans = 0; ans < 5000000; ans++){
        check = true;
        for (int k = 0; k < 7; k++){
          if (ans % wheel[k] != waits[k]){
            check = false;
          }
        }
        if (check){return ans;}
      }

      return 0;

    }

    catch(FileNotFoundException e){
      return 0;
    }
  }

}
