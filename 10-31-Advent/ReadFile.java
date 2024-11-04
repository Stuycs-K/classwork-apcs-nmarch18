import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //1 Prints every other line of text
    try {
      File file = new File("RandomText.txt");//1
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        input.nextLine();
        System.out.println(input.nextLine());
      }
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }

    //2 Prints if there is a {
    try {
      File file = new File("RandomText.txt");//1
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String value = input.nextLine();
        if (value.contains("{")){
          System.out.println(value);
        }
      }
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }


  }
}
