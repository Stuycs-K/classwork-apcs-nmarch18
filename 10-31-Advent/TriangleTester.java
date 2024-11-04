import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    try{
      int[] currentLine = new int[3];
      int count = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextInt()){
        for (int i = 0; i < 3; i++){
          currentLine[i] = input.nextInt();
        }

        int a = currentLine[0];
        int b = currentLine[1];
        int c = currentLine[2];

        if (a + b > c && a + c > b && b + c > a){
          count += 1;
        }
      }
      input.close();
      return count;

    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
      return -1;

    }
  }

  public static int countTrianglesB(String filename){
    try{
      int[][] columns = new int[3][3];
      int count = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextInt()){
        for (int i = 0; i < 3; i++){
          columns[0][i] = input.nextInt();
          columns[1][i] = input.nextInt();
          columns[2][i] = input.nextInt();
        }

        for (int i = 0; i < 3; i++){
          int a = columns[i][0];
          int b = columns[i][1];
          int c = columns[i][2];

          if (a + b > c && a + c > b && b + c > a){
            count += 1;
          }
        }
      }

      return count;

    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
      return -1;
    }
  }

}
