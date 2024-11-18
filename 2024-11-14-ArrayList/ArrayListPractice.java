import java.util.ArrayList;

public class ArrayListPractice{

  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String>answer = new ArrayList<String>(size);
    int currentInt;
    for (int i = 0; i < size; i++){
      currentInt = (int)(Math.random() * 10);
      if (currentInt == 0){
        answer.add("");
      }
      else
      answer.add("" + currentInt);
    }
    return answer;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }

   public static ArrayList<String> makeReversedList( ArrayList<String> original){
  // //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String>reverse = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--){
      reverse.add(original.get(i));
    }
    return reverse;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String> answer = new ArrayList<String>();
    int inCommon = Math.min(a.size(), b.size());
    int i = 0;
    while (i <= inCommon-1){ // add the first indices which exist in both arrays
      answer.add(a.get(i));
      answer.add(b.get(i));
      i++;
    }
    if (a.size() > b.size()){ // keep adding from A if that's what's left over
      while (i < a.size()){
        answer.add(a.get(i));
        i++;
      }
    }
    else
    if (b.size() > a.size()){ // else keep adding from B if that's what's left over
      while (i < b.size()){
        answer.add(b.get(i));
        i++;
      }
    }
    return answer;
  }

}
