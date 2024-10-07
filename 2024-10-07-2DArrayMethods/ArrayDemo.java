import java.util.Arrays;

public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.

  public static String arrToString (int[] ary){
    String str = "[";
    for (int i = 0; i < ary.length; i++){
      if (i < ary.length - 1){
        str += ary[i] + ", ";
      }
      else
      str += ary[i];
    }
    str += "]";
    return str;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!

  public static String arrToString (int[][] ary){ // 2D version
    String str = "[";
    for (int i = 0; i < ary.length; i++){
      if (i < ary.length - 1){
        str += arrToString(ary[i]) + ", ";
      }
      else {
        str += arrToString(ary[i]);
      }
    }
    return str + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    return 0;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/

   public static int arr2DSum(int[][]nums){
     int sum = 0;
     for (int r = 0; r < nums.length; r++) {
       for (int c = 0; c < nums[r].length; c++) {
         sum += nums[r][c];
       }
     }
     return sum;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0

  public static int[][] replaceNegative(int[][] vals){
    for (int row = 0; row < vals.length; row++) { // treat vals[row][col] like a coordinate
      for (int col = 0; col < vals[row].length; col++) {
        if (row == col && vals[row][col] < 0) {
          vals[row][col] = 1;
        }
        else if (vals[row][col] < 0) {
          vals[row][col] = 0;
        }
      }
    }
    return vals;
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] newcopy = new int[nums.length][];
    for (int x = 0; x < nums.length; x++){
      newcopy[x] = new int[nums[x].length]; // make a matching non-rectangular array this way, set individual sub-arrays' lengths
    }
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        newcopy[i][j] = nums[i][j]; // then fill the array one by one in each corresponding index
      }
    }
    return newcopy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}

  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length]; // We know it is rectangular, so we can use nums[0]'s length
    for (int r = 0; r < nums[0].length; r++){
      for (int c = 0; c < nums.length; c++){
        arr[r][c] = nums[c][r];
      }
    }
    return arr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
