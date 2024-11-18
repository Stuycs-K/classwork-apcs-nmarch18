import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day2tester{

  public static int getPositionA(int pos, String moves){
    int x = (pos-1) % 3;
    int y = 2 - ((pos-1) / 3);
    char thisMove;
    for (int i = 0; moves.length() > 0; i++){
      thisMove = moves.charAt(0);
      if (thisMove == 'U'){
        if (y < 2){y += 1;}
      }
      if (thisMove == 'D'){
        if (y > 0){y -= 1;}
      }
      if (thisMove == 'L'){
        if (x > 0){x -= 1;}
      }
      if (thisMove == 'R'){
        if (x < 2){x += 1;}
      }

      if (moves.length() > 1){
        moves = moves.substring(1);
      }
      else {moves = "";}
    }
    return (7 + x - 3*y);
  }

  public static int getCodeA(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String code = "";
      int start = 5;
      int result;
      while (input.hasNextLine()){
        result = getPositionA(start, input.nextLine());
        code += result;
        start = result;
      }
      return Integer.parseInt(code);
    }
    catch(FileNotFoundException e){
      System.out.println("File not found!");
      return 0;
    }
  }

  public static int getPositionB(int pos, String moves){
    // Tons of casework: not the best code -N
    int x;
    int y;
    if (pos % 4 == 0){
      x = 1;
      y = 2 - (pos / 4);
    }
    if (pos % 4 == 2){
      x = -1;
      y = 1 - (pos / 4);
    }
    if (pos == 5 || pos == 9){
      x = pos - 7;
      y = 0;
    }
    if (pos == 1 || pos == 13){
      x = 0;
      y = 2 - (pos / 3);
    }
    else
    {
      x = 0;
      y = 1 - (pos / 4);
    }
    char thisMove;
    for (int i = 0; moves.length() > 0; i++){
      thisMove = moves.charAt(0);
      if (thisMove == 'U'){
        if (Math.abs(x) + y < 2){y += 1;}
      }
      if (thisMove == 'D'){
        if (Math.abs(x) - y < 2){y -= 1;}
      }
      if (thisMove == 'L'){
        if (Math.abs(y) - x < 2){x -= 1;}
      }
      if (thisMove == 'R'){
        if (Math.abs(y) + x < 2){x += 1;}
      }
      if (moves.length() > 1){
        moves = moves.substring(1);
      }
      else {moves = "";}
    }
    if (x == -2){
      return 5;
    }
    else
    if (x == -1){
      return 6 - (4 * y);
    }
    else
    if (x == 0){
      if (y > 0){
        return 5 - (2 * y);
      }
      else
      if (y < 0){
        return 9 - (2 * y);
      }
      else
      return 7;
    }
    else
    if (x == 1){
      return 8 - (4 * y);
    }
    else
    return 9;
  }

  public static int getCodeB(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String code = "";
      int start = 5;
      int result;
      while (input.hasNextLine()){
        result = getPositionB(start, input.nextLine());
        code += result;
        start = result;
      }
      return Integer.parseInt(code);
    }
    catch(FileNotFoundException e){
      System.out.println("File not found!");
      return 0;
    }
  }

}
