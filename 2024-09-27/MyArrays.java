public class MyArrays{

  public static String aryToString (int[] nums){
    String str = "[";
    for (int i = 0; i < nums.length; i++){
      while (i < nums.length - 1){
        str += nums[i] + ", ";
      }
    }
    str += "]";
    return str;
  }

  public static int returnCopy(int[]ary) {
    return 0;
  }

  public static int concatArray(int[]ary1,int[]ary2) {
    return 0;
  }

  public static void main (String[] args){
    // 3 test cases for returnCopy
    // Tests for different addresses, same strings.
    System.out.println("Tests for returnCopy; expected true");
    int[] ary = {1, 2, 3, 4, 5};
    System.out.println((returnCopy(ary) != ary) && aryToString(returnCopy(ary)).equals(aryToString(ary)));

    ary = new int[0];
    System.out.println((returnCopy(ary) != ary) && aryToString(returnCopy(ary)).equals(aryToString(ary)));

    ary = new int[]{100, 60, 20, 19, 40, 81};
    System.out.println((returnCopy(ary) != ary) && aryToString(returnCopy(ary)).equals(aryToString(ary)));

  }
}
