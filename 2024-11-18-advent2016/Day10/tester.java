import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  public static int[] sortArr(int[] arr){
    if (arr[0] > arr[1]){
      return (new int[]{arr[1], arr[0]});
    }
    else return arr;
  }

  public static int returnBot(String filename){

    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      String step;

      int[][] robots = new int[210][2];
      int[][] adds = new int[21][2];

      int index = 0;

      while (input.hasNextLine()){
        step = input.nextLine();
        if (step.contains("goes")){
          adds[index][0] = Integer.parseInt(step.substring(6,9).replaceAll("[^0-9]", ""));
          adds[index][1] = Integer.parseInt(step.substring(13).replaceAll("[^0-9]", ""));
          index++;
        }
      }

      for (int a = 0; a < 21; a++){
        if (robots[adds[a][1]][0] == 0){
          robots[adds[a][1]][0] = adds[a][0];
        }
        else
        robots[adds[a][1]][1] = adds[a][0];
      }

      input = new Scanner(file);

      int giver;
      int receiverLow;
      int receiverHigh;
      int[][] operations = new int[210][3];

      while (input.hasNextLine()){

        step = input.nextLine();

        if (step.contains("gives")){

          giver = Integer.parseInt(step.substring(4,7).replaceAll("[^0-9]", ""));
          receiverLow = Integer.parseInt(step.substring(20,33).replaceAll("[^0-9]", ""));
          receiverHigh = Integer.parseInt(step.substring(33).replaceAll("[^0-9]", ""));

          if (!step.contains("output")){
            operations[giver] = new int[]{giver, receiverLow, receiverHigh};
          }
          else
          if (giver != 80){
            operations[giver] = new int[]{giver, -1, receiverHigh};
          }
          else{
            operations[giver] = new int[]{80, -1, -1};
          }
        }
      }

      System.out.println(Arrays.deepToString(robots));
      System.out.println(Arrays.deepToString(operations));

      while (true){

        for (int i = 0; i < 210; i++){

          for (int j = 0; j < 210; j++){
            robots[j] = sortArr(robots[j]);
          }

          if (robots[i][0] > 0 && robots[i][1] > 0){

            if (i == 180){ // REPLACE WITH ANY TO GET HOW LONG IT TAKES TO GET THERE. THIS WAS PART B
              return robots[i][0];
            }

            if (operations[i][1] == -1){
              if (operations[i][2] != -1){
                robots[i][0] = 0;
                robots[operations[i][2]][0] = robots[i][1];
              }
              else
              if (operations[i][2] == -1){
                robots[i][0] = 0;
                robots[i][1] = 0;
              }
            }
            else
            {
              robots[operations[i][1]][0] = robots[i][0];
              robots[i][0] = 0;
              robots[operations[i][2]][0] = robots[i][1];
              robots[i][1] = 0;
            }

          }
        }

      }

    }

    catch(FileNotFoundException e){
      return 0;
    }

  }
}
