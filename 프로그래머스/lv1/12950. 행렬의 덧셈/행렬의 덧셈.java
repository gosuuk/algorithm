import java.util.Arrays;

class Solution {
  public int[][] solution(int[][] arr1, int[][] arr2) {
      int[][] answer = new int[arr1.length][];
      
      for (int i = 0; i < arr1.length; i++) {
		    answer = arr1.clone();
            for(int j = 0; j < arr1[i].length; j++){
            answer[i][j] += arr2[i][j];
          }
		}
      return answer;
  }
}