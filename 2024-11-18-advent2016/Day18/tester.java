import java.io.*;
import java.util.*;

public class tester{
  
  public static char[][] makeArray(String input, int rows){
    char[][] grid = new char[rows][input.length()+2];
    grid[0][0] = '.';
    grid[0][input.length()+1] = '.';
    for (int k = 0; k < input.length(); k++){
      grid[0][k+1] = input.charAt(k);
    }
    for (int i = 1; i < rows; i++){
      for (int j = 0; j < input.length()+2; j++){
        if (j == 0 || j == input.length()+1){
          grid[i][j] = '.';
        }
        else
        if (grid[i-1][j-1] == '^' && grid[i-1][j] == '^' && grid[i-1][j+1] == '.'){
          grid[i][j] = '^';
        }
        else
        if (grid[i-1][j-1] == '.' && grid[i-1][j] == '^' && grid[i-1][j+1] == '^'){
          grid[i][j] = '^';
        }
        else
        if (grid[i-1][j-1] == '^' && grid[i-1][j] == '.' && grid[i-1][j+1] == '.'){
          grid[i][j] = '^';
        }
        else
        if (grid[i-1][j-1] == '.' && grid[i-1][j] == '.' && grid[i-1][j+1] == '^'){
          grid[i][j] = '^';
        }
        else {grid[i][j] = '.';}
      }
    }
    for (int x = 0; x < rows; x++){
      System.out.println(Arrays.toString(grid[x]).replaceAll(",",""));
    }
    return grid;
  }

  public static int countSafe(String input, int rows){
    char[][] grid = makeArray(input, rows);
    int count = 0;
    for (int x = 0; x < grid.length; x++){
      for (int y = 0; y < grid[x].length; y++){
        if (grid[x][y] == '.'){
          count += 1;
        }
      }
    }
    return (count - 2*rows);
  }

}
