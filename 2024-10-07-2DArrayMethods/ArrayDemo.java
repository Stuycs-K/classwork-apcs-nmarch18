import java.util.Arrays;

public class ArrayDemo{
  public static void main(String[]args){

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

    // 3 test cases for countZeros2D: expected the number of 0s in the array

    arr2D = new int[20][25];
    System.out.println("countZeros2D test 1: " + countZeros2D(arr2D));

    arr2D = new int[][]{{1, 0, 3}, {-1, 0, -3}, {0, 0, 0}};
    System.out.println("countZeros2D test 2: " + countZeros2D(arr2D));

    arr2D = new int[11][111];
    System.out.println("countZeros2D test 3: " + countZeros2D(arr2D) + "\n");

    // 3 test cases for arr2DSum: expect some int which is the sum

    arr2D = new int[][]{{3, 4, 2}, {8, 0, 1}, {5, 2, 2}, {6, 3, 0}, {1, 4, 4}};
    System.out.println("arr2DSum test 1: " + arr2DSum(arr2D));

    arr2D = new int[100][100];
    System.out.println("arr2DSum test 2: " + arr2DSum(arr2D));

    arr2D = new int[][]{{410}, {41, 0}, {4, 10}, {4, 1, 0}};
    System.out.println("arr2DSum test 3: " + arr2DSum(arr2D) + "\n");

    // 3 test cases for replaceNegative: expect a slightly changed array from the original

    arr2D = new int[][]{{-3, -3, 3, 3}, {-4, 4, -4}, {5, 5, -5, 5, -5}};
    System.out.println("replaceNegative test 1: " + arrToString(replaceNegative(arr2D)));

    arr2D = new int[][]{{-6}, {-6, 6}, {-6, 6, -6}, {-6, 6, -6, 6}};
    System.out.println("replaceNegative test 2: " + arrToString(replaceNegative(arr2D)));

    arr2D = new int[][]{{}, {}, {}, {2, -2, 2, -2, 2, -2}};
    System.out.println("replaceNegative test 3: " + arrToString(replaceNegative(arr2D)) + "\n");

    // 3 test cases for copy: expected unequal addresses and the same array when displayed as a string

    arr2D = new int[][]{{1, 2, 3}, {4, 5}, {6}, {7, 8}, {9, 10, 11, 12}};
    System.out.println("copy test 1: original address " + arr2D + "\t copy address " + copy(arr2D) + "\t copy array " + arrToString(copy(arr2D)));

    arr2D = new int[4][3];
    System.out.println("copy test 2: original address " + arr2D + "\t copy address " + copy(arr2D) + "\t copy array " + arrToString(copy(arr2D)));

    arr2D = new int[][]{{},{0, 96, 0},{}};
    System.out.println("copy test 3: original address " + arr2D + "\t copy address " + copy(arr2D) + "\t copy array " + arrToString(copy(arr2D)) + "\n");

    // 3 test cases for swapRC: expect a 2d array w/ opposite dimensions and same values, in the right order

    arr2D = new int[][]{{1, 2, 3}, {4, 5, 6}};
    System.out.println("swapRC test 1: " + arrToString(swapRC(arr2D)));

    arr2D = new int[][]{{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
    System.out.println("swapRC test 2: " + arrToString(swapRC(arr2D)));

    arr2D = new int[][]{{2, 0, 1}, {2, 0, 1}, {2, 0, 1}, {2, 0, 1}};
    System.out.println("swapRC test 3: " + arrToString(swapRC(arr2D)) + "\n");

    // 3 test cases for htmlTable: expect a single line with proper formatting and rows being each sub-array

    arr2D = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("htmlTable test 1: " + htmlTable(arr2D));

    arr2D = new int[4][2];
    System.out.println("htmlTable test 2: " + htmlTable(arr2D));

    arr2D = new int[][]{{-5}, {}, {2}, {}, {9}};
    System.out.println("htmlTable test 3: " + htmlTable(arr2D));
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
    int count = 0;
    for (int r = 0; r < nums.length; r++){
      for (int c = 0; c < nums[r].length; c++){
        if (nums[r][c] == 0){ // goes once thru every value
          count += 1;
        }
      }
    }
    return count;
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
    for (int r = 0; r < vals.length; r++) { // treat vals[row][col] like a coordinate
      for (int c = 0; c < vals[r].length; c++) {
        if (r == c && vals[r][c] < 0) {
          vals[r][c] = 1;
        }
        else if (vals[r][c] < 0) {
          vals[r][c] = 0;
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
      newcopy[x] = new int[nums[x].length]; // make a matching non-rectangular array this way, setting each sub-array's length
    }
    for (int r = 0; r < nums.length; r++){
      for (int c = 0; c < nums[r].length; c++){
        newcopy[r][c] = nums[r][c]; // then fill the array one by one in each corresponding index
      }
    }
    return newcopy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}

  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length]; // We know it is rectangular, so we can use nums[0]'s length
    for (int r = 0; r < arr.length; r++){
      for (int c = 0; c < arr[r].length; c++){
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
    String html = "<table>";
    for (int r = 0; r < nums.length; r++){
      html += "<tr>";
      for (int c = 0; c < nums[r].length; c++){
        html += "<td>" + nums[r][c] + "</td>";
      }
      html += "</tr>";
    }
    return (html + "</table>");
  }
}
