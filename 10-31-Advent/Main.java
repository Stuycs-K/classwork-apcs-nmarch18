import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    Scanner sc1 = new Scanner("This is a bunch of words");
    while (sc1.hasNext()) {
      System.out.println(sc1.next());
    }

    double sum = 0;
    Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    while (sc2.hasNextDouble()){
      sum += sc2.nextDouble();
    }
    System.out.println(sum);
  }
  }
