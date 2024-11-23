import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  // public static void cpy

  public static int findLeastSignal(String filename){
    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      String command;
      ArrayList<String[]> cmds = new ArrayList<String[]>();

      while (input.hasNextLine()){
        command = input.nextLine();
        cmds.add(command.split(" "));
      }

      for (int i = 0; i < cmds.size(); i++){
        System.out.println(Arrays.toString(cmds.get(i)));
      }

      for (int x = 0; x < 9999999; x++){

        String[] cAway; // for the ONE c-toggle
        String cmd = "", arg1 = "", arg2 = "", type = "";
        int i = 0, k = 0, n = 0;
        int a = x, b = 0, c = 0, d = 0;
        String output = "";

        while (i < cmds.size() && output.length() < 100){

          cmd = cmds.get(i)[0];
          arg1 = cmds.get(i)[1];
          if (cmds.get(i).length > 2){
            arg2 = cmds.get(i)[2];
          }

          if (cmd.contains("inc")){
            if (arg1.equals("a")){a++;}
            if (arg1.equals("b")){b++;}
            if (arg1.equals("c")){c++;}
            if (arg1.equals("d")){d++;}
          }

          else

          if (cmd.contains("dec")){
            if (arg1.equals("a")){a--;}
            if (arg1.equals("b")){b--;}
            if (arg1.equals("c")){c--;}
            if (arg1.equals("d")){d--;}
          }

          else

          if (cmd.contains("cpy")){

            n = 0;

            if (arg1.equals("a")){
              if (arg2.equals("b")){b = a;}
              if (arg2.equals("c")){c = a;}
              if (arg2.equals("d")){d = a;}
            }
            else
            if (arg1.equals("b")){
              if (arg2.equals("a")){a = b;}
              if (arg2.equals("c")){c = b;}
              if (arg2.equals("d")){d = b;}
            }
            else
            if (arg1.equals("c")){
              if (arg2.equals("a")){a = c;}
              if (arg2.equals("b")){b = c;}
              if (arg2.equals("d")){d = c;}
            }
            else
            if (arg1.equals("d")){
              if (arg2.equals("a")){a = d;}
              if (arg2.equals("b")){b = d;}
              if (arg2.equals("c")){c = d;}
            }
            else{
              n = Integer.parseInt(arg1);
              if (arg2.equals("a")){a = n;}
              if (arg2.equals("b")){b = n;}
              if (arg2.equals("c")){c = n;}
              if (arg2.equals("d")){d = n;}
            }
          }

          else

          if (cmd.contains("jnz")){ // jnz 1 a -- how?

            k = 0;
            n = 0;

            if (arg1.equals("a")){k = a;}
            else
            if (arg1.equals("b")){k = b;}
            else
            if (arg1.equals("c")){k = c;}
            else
            if (arg1.equals("d")){k = d;}
            else {k = Integer.parseInt(arg1);}

            if (arg2.equals("a")){n = a;}
            else
            if (arg2.equals("b")){n = b;}
            else
            if (arg2.equals("c")){n = c;}
            else
            if (arg2.equals("d")){n = d;}
            else {n = Integer.parseInt(arg2);}

            if (k != 0){
              i += (n-1);
            }

          }

          else

          if (cmd.contains("out")){
            output += b;
          }

          i++;

        }

        System.out.println(x + ": " + output);

        if (output.equals("0101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101")){
          return x;
        }

      }

      return 0;

    }

    catch(FileNotFoundException e){
      return 0;
    }

  }

}
