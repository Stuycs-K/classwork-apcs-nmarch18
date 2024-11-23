import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tester{

  // public static void cpy

  public static String getA(String filename, int a, int b, int c, int d){
    try{

      File file = new File(filename);
      Scanner input = new Scanner(file);
      String command;
      ArrayList<String> cmds = new ArrayList<String>();

      while (input.hasNextLine()){
        command = input.nextLine();
        cmds.add(command);
      }

      int i = 0;
      String cmd;
      char arg, arg2;
      int n = 0, k = 0;

      while (i < cmds.size()){

        cmd = cmds.get(i);
        arg = cmd.charAt(4);

        System.out.println("a = " + a + "\t b = " + b + "\t c = " + c + "\t d = " + d);

        if (cmd.contains("inc")){
          if (arg == 'a'){a++;}
          if (arg == 'b'){b++;}
          if (arg == 'c'){c++;}
          if (arg == 'd'){d++;}
        }

        if (cmd.contains("dec")){
          if (arg == 'a'){a--;}
          if (arg == 'b'){b--;}
          if (arg == 'c'){c--;}
          if (arg == 'd'){d--;}
        }

        if (cmd.contains("cpy")){
          arg2 = cmd.charAt(cmd.length()-1);
          if (arg == 'a'){
            if (arg2 == 'b'){b = a;}
            if (arg2 == 'c'){c = a;}
            if (arg2 == 'd'){d = a;}
          }
          else
          if (arg == 'b'){
            if (arg2 == 'a'){a = b;}
            if (arg2 == 'c'){c = b;}
            if (arg2 == 'd'){d = b;}
          }
          else
          if (arg == 'c'){
            if (arg2 == 'a'){a = c;}
            if (arg2 == 'b'){b = c;}
            if (arg2 == 'd'){d = c;}
          }
          else
          if (arg == 'd'){
            if (arg2 == 'a'){a = d;}
            if (arg2 == 'b'){b = d;}
            if (arg2 == 'c'){c = d;}
          }
          else{
            n = Integer.parseInt(cmd.substring(4,6).replaceAll("[^0-9]", ""));
            if (arg2 == 'a'){a = n;}
            if (arg2 == 'b'){b = n;}
            if (arg2 == 'c'){c = n;}
            if (arg2 == 'd'){d = n;}
          }
        }

        if (cmd.contains("jnz")){

          k = 0;

          if (arg == 'a'){k = a;}
          else
          if (arg == 'b'){k = b;}
          else
          if (arg == 'c'){k = c;}
          else
          if (arg == 'd'){k = d;}
          else
          if ('0' < arg){k = (int)arg - 48;}

          if (k != 0){
            n = Integer.parseInt(cmd.substring(6).replaceAll("[a-z, ]", ""));
            i += (n-1);
          }
        }

        i++;
      }
      return ("\n🌟🎉 a = " + a + " 🎉🌟"); // Trust the process.
    }

    catch(FileNotFoundException e){
      return null;
    }
  }

}
