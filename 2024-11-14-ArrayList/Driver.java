import java.util.ArrayList;

public class Driver{
  public static void main (String[] args){

    ArrayList<String> a1 = ArrayListPractice.createRandomArray(10);
    System.out.println(a1);

    ArrayListPractice.replaceEmpty(a1);
    System.out.println(a1);

    ArrayList<String> a2 = ArrayListPractice.makeReversedList(a1);
    System.out.println(a2);

    ArrayList<String> a3 = ArrayListPractice.createRandomArray(6);
    ArrayList<String> a4 = ArrayListPractice.createRandomArray(5);

    System.out.println(a3);
    System.out.println(a4);
    System.out.println(ArrayListPractice.mixLists(a3,a4));


  }
}
