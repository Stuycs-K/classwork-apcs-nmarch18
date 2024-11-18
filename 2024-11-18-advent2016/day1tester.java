import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1tester{
  public static int distanceA(String filename){
    try{
      int[] currentLine = new int[3];
      int xPos = 0;
      int yPos = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);

      input.split(", ");

      


    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
      return -1;

    }
  }
