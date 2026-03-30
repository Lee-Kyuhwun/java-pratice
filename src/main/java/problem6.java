public class problem6 {

    public static void main(String[] args) {

    }

    // 내부 클래스를 정의하려면 괄호()를 제거하고 적절한 이름을 사용해야 합니다.
    // 관례상 클래스명은 대문자로 시작합니다.
    public static class Solution {
        // 내부 클래스 내용

        public int[] solution(int[] arr, int n) {
            int[] answer = new int[n];
            double[] stage_rate = new double[n];
            for(int i =0; i<n; i++){
                int per =0;
                int clear =0;
                for(int j =0; j<arr.length; j++){
                    // 해당 스테이지까지 도달했으면서 해당 스테이지에서 실패한 플레이어 수를 구하기
                    if(arr[j]>=i){
                        per++;
                        // 스테이지 실패한 플레이어 수
                        if(arr[j] == i){
                            clear++;
                        }
                    }
                    if(per == 0){
                        stage_rate[j] = 0;
                    }else{
                        stage_rate[j] = (double) clear/per;
                    }



                }

            }




            return answer;
        }
    }
}
