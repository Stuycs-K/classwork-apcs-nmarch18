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

}
