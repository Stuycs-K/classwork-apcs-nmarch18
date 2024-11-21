import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static Long getMinAllowed(String filename){
    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      int a = 0;
      String ip;
      String[][] strRanges = new String[945][2];

      while (input.hasNextLine()){
        ip = input.nextLine();
        strRanges[a] = ip.split("-");
        a++;
      }

      Long[][] ranges = new Long[945][2];

      for (int b = 0; b < 945; b++){
        ranges[b][0] = Long.parseLong(strRanges[b][0]);
        ranges[b][1] = Long.parseLong(strRanges[b][1]);
      }

      boolean check;

      for (Long ans = 0L; ans < Math.pow(2,32); ans++){
        check = true;
        for (int i = 0; i < 945; i++){
          if (ranges[i][0] <= ans && ans <= ranges[i][1]){
            check = false;
          }
        }
        if (check){return ans;}
      }

      return 0L;

    }

    catch(FileNotFoundException e){
      return 0L;
    }

  }

  public static int getNumAllowed(String filename){
    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      int a = 0;
      String ip;
      String[][] strRanges = new String[945][2];

      while (input.hasNextLine()){
        ip = input.nextLine();
        strRanges[a] = ip.split("-");
        a++;
      }

      Long[] extremes = new Long[1890];

      for (int b = 0; b < 945; b++){
        extremes[2*b] = Long.parseLong(strRanges[b][0]);
        extremes[2*b+1] = Long.parseLong(strRanges[b][1]);
      }

      int count = 0;
      Long dist = 0L;

      for (int i = 0; i < 1890; i++){
        for (int j = i; j < 1890; j++){
          dist = Math.abs(extremes[j] - extremes[i]);
          if (dist == 2){
            count += 1;
          }
          if (dist == 3){
            count += 2;
          }
          if (dist == 4){
            count += 3;
          }
        }
      }
      return count;
    }

    catch(FileNotFoundException e){
      return 0;
    }

  }

}
