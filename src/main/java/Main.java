import java.util.*;

/**
 * 코딩테스트 문제를 실행하는 메인 클래스
 */
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[2];

        // 중복값제거
    }

    private static int[] solution(int[] arr) {

        HashSet<Integer> sums = new HashSet<>();


        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                sums.add(arr[i] + arr[j]);
            }
        }

        return sums.stream().mapToInt(Integer::intValue).toArray();//  값들 오름차순으로 정렬하고 배열로 변환
    }



}
