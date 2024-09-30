public class MyArrays{

  public static String aryToString (int[] nums){
    String str = "[";
    for (int i = 0; i < nums.length; i++){
      if (i < nums.length - 1){
        str += nums[i] + ", ";
      }
      else
      str += nums[i];
    }
    str += "]";
    return str;
  }

  public static int[] returnCopy(int[] ary) {
    int[] answer = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      answer[i] = ary[i];
    }
    return answer;
  }

  public static int concatArray(int[]ary1,int[]ary2) {
    return 0;
  }

  public static void main (String[] args){
    
    // 5 test cases for returnCopy
    // Tests for different addresses AND same strings.

    int[] nums;
    System.out.println("\n1) Tests for returnCopy: addresses expected to be UNEQUAL, arrays expected to be EQUAL\n");

    nums = new int[]{1,2,3,4,5};
    System.out.println("expected NOT " + nums + ": " + returnCopy(nums));
    System.out.println("expected " + aryToString(nums) + ": " + aryToString(returnCopy(nums)) + "\n");

    nums = new int[0];
    System.out.println("expected NOT " + nums + ": " + returnCopy(nums));
    System.out.println("expected " + aryToString(nums) + ": " + aryToString(returnCopy(nums)) + "\n");

    nums = new int[10];
    System.out.println("expected NOT " + nums + ": " + returnCopy(nums));
    System.out.println("expected " + aryToString(nums) + ": " + aryToString(returnCopy(nums)) + "\n");

    nums = new int[]{100, 99, 98, 3, 2, 1};
    System.out.println("expected NOT " + nums + ": " + returnCopy(nums));
    System.out.println("expected " + aryToString(nums) + ": " + aryToString(returnCopy(nums)) + "\n");

    nums = new int[]{0, -2, -4, 5, 0, 0};
    System.out.println("expected NOT " + nums + ": " + returnCopy(nums));
    System.out.println("expected " + aryToString(nums) + ": " + aryToString(returnCopy(nums)) + "\n");

    // 5 test cases for concatArray
    // Tests for 
    
  }
}
