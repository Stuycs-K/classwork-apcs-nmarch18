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

  public static int[] concatArray(int[]ary1,int[]ary2) {
    int[] answer = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++){
      answer[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++){
      answer[i + ary1.length] = ary2[i];
    }
    return answer;
  }

  public static void main (String[] args){
    
    // 5 test cases for returnCopy
    // Tests for different addresses AND same strings under arrayToString.

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
    // Tests for same strings under arrayToString.

    int[] nums1;
    int[] nums2;
    System.out.println("2) Tests for concatArray: arrays expected to be EQUAL\n");

    nums1 = new int[]{1,2,3};
    nums2 = new int[]{6,7,8};
    System.out.println("expected [1, 2, 3, 6, 7, 8]: " + aryToString(concatArray(nums1, nums2)));

    nums1 = new int[1];
    nums2 = new int[2];
    System.out.println("expected [0, 0, 0]: " + aryToString(concatArray(nums1, nums2)));

    nums1 = new int[]{0,3,0,4};
    nums2 = new int[2];
    System.out.println("expected [0, 3, 0, 4, 0, 0]: " + aryToString(concatArray(nums1, nums2)));

    nums1 = new int[]{1, -4, 9};
    nums2 = new int[]{-3, 6, -10};
    System.out.println("expected [1, -4, 9, -3, 6, -10]: " + aryToString(concatArray(nums1, nums2)));

    nums1 = new int[0];
    nums2 = new int[0];
    System.out.println("expected []: " + aryToString(concatArray(nums1, nums2)));
  
  }
}
