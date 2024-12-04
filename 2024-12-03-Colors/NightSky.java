import java.util.*;

public class NightSky{
  public static void main(String[] args){

    // java NightSky length width (ints)

    System.out.print("\u001b[2J");

    try{int a = Integer.parseInt(args[0]); int b = Integer.parseInt(args[1]);}
    catch(Exception e){System.out.println(" *** valid args are two ints, for width and length *** ");}

    int w = Integer.parseInt(args[0]);
    int l = Integer.parseInt(args[1]);
    int g = 20;
    int b = 50;
    char c;

    for (int x = 0; x < l; x++){
      for (int y = 0; y < w; y++){

        c = (char)(int)(95 * Math.random() + 32);

        if (c == '*'){System.out.print("\u001b[38;2;128;115;0m*");}
        else System.out.print("\u001b[38;2;0;" + g + ";" + b + "m" + Character.toString(c));

        b += (int)(3 * Math.random()) - 1;
        g += (int)(3 * Math.random()) - 1;

        if (b <= 30){b++;} else if (b >= 70){b--;}
        if (g <= 10){g++;} else if (g >= 30){g--;}

      }

      System.out.println();

    }

    System.out.print("\u001b[0m");

  }
}
