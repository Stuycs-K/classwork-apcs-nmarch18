import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static int getNumPairs(String filename){
    
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int[][] node = new int[1020][3];
      int x = 0;
      while (input.hasNextLine()){
        String data = input.nextLine();
        int total = Integer.parseInt(data.substring(24,28).replaceAll("[^0-9]", ""));
        int use = Integer.parseInt(data.substring(30,34).replaceAll("[^0-9]", ""));
        int avail = Integer.parseInt(data.substring(38,42).replaceAll("[^0-9]", ""));
        node[x] = new int[]{total, use, avail};
        x++;
      }
      System.out.println(Arrays.deepToString(node));
      int count = 0;
      for (int i = 0; i < 1020; i++){
        for (int j = 0; j < 1020; j++){
          if (i != j && node[i][1] <= node[j][2] && node[i][1] != 0){
            count += 1;
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
