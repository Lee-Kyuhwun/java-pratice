public class problem5 {


    public static void main(String[] args) {

    }


    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1[0].length][arr2[0].length];



            for(int i =0; i<arr1.length; i++){
                for(int j =0; j<arr2.length; j++){
                    answer[i][j] = arr1[i][j]*arr2[j][i];
                }
            }



            return answer;
        }
    }
}


