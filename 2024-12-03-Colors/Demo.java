public class Demo{
  public static void main(String[] args){

    System.out.print("\u001b[2J");

    for (int r = 0; r < 256; r+=16){
      for (int g = 0; g < 256; g+=16){
        for (int b = 0; b < 256; b+=16){
          System.out.print("\u001b[48;2;"+r+";"+g+";"+b+"m\s");
        }
        System.out.println();
      }
      System.out.println();
    }

    System.out.print("\u001b[0m");

  }
}
