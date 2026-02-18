import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Problem4 {

    public static void main(String[] args) {


        int[] result = new int[3];

    }


    int[] solution(int[] arr){
        int[] person1= {1,2,3,4,5};
        int[] person2= {2,1,2,3,2,4,2,5};
        int[] person3 = { 3,3,1,1,2,2,4,4,5,5};
        HashSet<Integer> sums = new HashSet<>();
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        for(int i=0;i < arr.length;i++){
            if(arr[i] == person1[i%5]){
                answer1++;
            }
            if(arr[i] == person2[i%8]){
                answer2++;
            }
            if(arr[i] == person3[i%10]){
                answer3++;
            }

            int max = Math.max(answer1, Math.max(answer2,answer3));

            sums.add(max);
            if(max == answer1){
                sums.add(1);
            }
            if(max == answer2){
                sums.add(2);
            }
            if(max == answer3){
                sums.add(3);
            }
        }

        return sums.stream().mapToInt(Integer::intValue).toArray();
    }
    // 책 정답
    class Solution {

        public static int[] solution(int[] answers){
            int[][]  pattern ={
                    {1,2,3,4,5},
                    {2,1,2,3,2,4,2,5},
                    {3,3,1,1,2,2,4,4,5,5}

            };


            int[] scores = new int[3];

            for(int i =0; i < answers.length; i++){
                for(int j = 0; j < pattern[0].length; j++){
                    if(answers[i] == pattern[j][i % pattern[j].length]){
                        scores[j]++;
                    }

                }

            }

            int max = Arrays.stream(scores).max().getAsInt(); // 가장 높은 점수

            ArrayList<Integer> answer = new ArrayList<>();

            for(int i =0; i < scores.length; i++){

                if (scores[i] == max){
                    answer.add(i+1);
                }

            }

            return answer.stream().mapToInt(Integer:: intValue).toArray();



        }

    }
}

