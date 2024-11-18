import java.util.ArrayList;

public class Driver{
  public static void main (String[] args){

    /* createRandomArray */

    ArrayList<String> a0 = ArrayListPractice.createRandomArray(0);
    ArrayList<String> a3 = ArrayListPractice.createRandomArray(3);
    ArrayList<String> a5 = ArrayListPractice.createRandomArray(5);
    ArrayList<String> a10 = ArrayListPractice.createRandomArray(10);

    System.out.println("\nARRAYS");
    System.out.println("a0 = " + a0);
    System.out.println("a3 = " + a3);
    System.out.println("a5 = " + a5);
    System.out.println("a10 = " + a10 + "\n");

    /* replaceEmpty tests */

    System.out.println("replaceEmpty");
    ArrayListPractice.replaceEmpty(a0);
    ArrayListPractice.replaceEmpty(a3);
    ArrayListPractice.replaceEmpty(a5);
    ArrayListPractice.replaceEmpty(a10);
    System.out.println("a0 = " + a0);
    System.out.println("a3 = " + a3);
    System.out.println("a5 = " + a5);
    System.out.println("a10 = " + a10 + "\n");

    /* makeReversedList tests */

    System.out.println("makeReversedList");
    System.out.println("a0 = " + ArrayListPractice.makeReversedList(a0));
    System.out.println("a3 = " + ArrayListPractice.makeReversedList(a3));
    System.out.println("a5 = " + ArrayListPractice.makeReversedList(a5));
    System.out.println("a10 = " + ArrayListPractice.makeReversedList(a10) + "\n");

    /* mixLists tests */

    System.out.println("mixLists");
    System.out.println("mix a3, a0 = " + ArrayListPractice.mixLists(a3,a0));
    System.out.println("mix a0, a3 = " + ArrayListPractice.mixLists(a0,a3));
    System.out.println("mix a5, a3 = " + ArrayListPractice.mixLists(a5,a3));
    System.out.println("mix a3, a5 = " + ArrayListPractice.mixLists(a3,a5));
    System.out.println("mix a10, a5 = " + ArrayListPractice.mixLists(a10,a5));
    System.out.println("mix a5, a10 = " + ArrayListPractice.mixLists(a5,a10) + "\n");

    /* Can my methods handle large data sets? */

    // This whole section can be commented out to see the actual tests.

    System.out.println("Good luck!");

    ArrayList<String> a292827 = ArrayListPractice.createRandomArray(292827);
    ArrayList<String> a293031 = ArrayListPractice.createRandomArray(293031);

    System.out.println(a292827);
    ArrayListPractice.replaceEmpty(a293031);
    System.out.println(a293031);
    System.out.println(ArrayListPractice.makeReversedList(a292827));
    System.out.println(ArrayListPractice.mixLists(a293031,a292827));

    // All that matters is a lot got printed out up here ^

    System.out.println("You did it!\n");

  }
}
