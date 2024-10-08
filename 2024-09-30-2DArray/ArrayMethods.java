//1. Write both your names + emails at the top of the document as a comment.

// Nicolas Marchese - nicolasm73@nycstudents.net (git email: nicktmarchese@gmail.com?)
// Joyce Lin - joycel78@nycstudents.net

//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/

public class ArrayMethods{

  public static String arrToString (int[] nums){
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

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */

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

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
    int sum = 0;
    for (int r = 0; r < nums.length; r++) {
      for (int c = 0; c < nums[r].length; c++) {
        sum += nums[r][c];
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length]; // We know it is rectangular, so we can use nums[0]'s length
    for (int r = 0; r < nums[0].length; r++){
      for (int c = 0; c < nums.length; c++){
        arr[r][c] = nums[c][r];
      }
    }
    return arr;
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

  /* Personally, I don't see the need for a helper function. It would only separate two for loops that should be together. */

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

  // MAIN w/ tests vvv
  public static void main(String[] args){
    int[] arr;
    int[][] arr2D;

    // 3 test cases for arrToString: expect the array in string form

    arr = new int[]{1, 2, 3, 4};
    System.out.println("\narrToString test 1: " + arrToString(arr));

    arr = new int[]{};
    System.out.println("arrToString test 2: " + arrToString(arr));

    arr = new int[]{91, 24, 13, 4, 0, 9, 15, 62};
    System.out.println("arrToString test 3: " + arrToString(arr) + "\n");

    // 3 test cases for arrToString (2D): expect the array in string form

    arr2D = new int[2][4];
    System.out.println("arrToString 2D test 1: " + arrToString(arr2D));

    arr2D = new int[][]{{1, 2, 3}, {2, 3}, {3}, {}};
    System.out.println("arrToString 2D test 2: " + arrToString(arr2D));

    arr2D = new int[0][0];
    System.out.println("arrToString 2D test 3: " + arrToString(arr2D) + "\n");

    // 3 test cases for arr2DSum: expect some int which is the sum

    arr2D = new int[][]{{3, 4, 2}, {8, 0, 1}, {5, 2, 2}, {6, 3, 0}, {1, 4, 4}};
    System.out.println("arr2DSum test 1: " + arr2DSum(arr2D));

    arr2D = new int[100][100];
    System.out.println("arr2DSum test 2: " + arr2DSum(arr2D));

    arr2D = new int[][]{{410}, {41, 0}, {4, 10}, {4, 1, 0}};
    System.out.println("arr2DSum test 3: " + arr2DSum(arr2D) + "\n");

    // 3 test cases for swapRC: expect a 2d array w/ opposite dimensions and same values, in the right order

    arr2D = new int[][]{{1, 2, 3}, {4, 5, 6}};
    System.out.println("swapRC test 1: " + arrToString(swapRC(arr2D)));

    arr2D = new int[][]{{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
    System.out.println("swapRC test 2: " + arrToString(swapRC(arr2D)));

    arr2D = new int[3][6];
    System.out.println("swapRC test 3: " + arrToString(swapRC(arr2D)) + "\n");

    // 3 test cases for replaceNegative: expect a slightly changed array from the original

    arr2D = new int[][]{{-3, -3, 3, 3}, {-4, 4, -4}, {5, 5, -5, 5, -5}};
    System.out.println("replaceNegative test 1: " + arrToString(replaceNegative(arr2D)));

    arr2D = new int[][]{{-6}, {-6, 6}, {-6, 6, -6}, {-6, 6, -6, 6}};
    System.out.println("replaceNegative test 1: " + arrToString(replaceNegative(arr2D)));

    arr2D = new int[][]{{}, {}, {}, {2, -2, 2, -2, 2, -2}};
    System.out.println("replaceNegative test 1: " + arrToString(replaceNegative(arr2D)) + "\n");

    // 3 test cases for copy: expected unequal addresses and the same array when displayed as a string

    arr2D = new int[][]{{1, 2, 3}, {4, 5}, {6}, {7, 8}, {9, 10, 11, 12}};
    System.out.println("copy test 1: original address " + arr2D + "\t copy address " + copy(arr2D) + "\t copy array " + arrToString(copy(arr2D)));

    arr2D = new int[4][3];
    System.out.println("copy test 2: original address " + arr2D + "\t copy address " + copy(arr2D) + "\t copy array " + arrToString(copy(arr2D)));

    arr2D = new int[][]{{},{0, 96, 0},{}};
    System.out.println("copy test 3: original address " + arr2D + "\t copy address " + copy(arr2D) + "\t copy array " + arrToString(copy(arr2D)) + "\n");

  }
}

// Conclusion: tests were successful. If other test cases exist that give an unexpected result, so be it.
