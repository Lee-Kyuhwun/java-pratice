package algorithm.samsung;

import java.util.*;

public class DataStructure {

    public static void main(String[] args) {

        // ArrayDeque : 큐와 스택 구현 가능
        Deque<int[]> q = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();

        // 제네릭에는 기본형 타입을 사용할 수 없으므로 Integer를 사용해야 한다.
        List<Integer> nums = new ArrayList<>();

        nums.add(3);

        int x = nums.get(0);

        System.out.println("x = " + x);

        // int[]는 객체라서 그대로 넣을 수 있음
        List<int[]> points = new ArrayList<>();
        points.add(new int[]{2,3});

        for(int[] point : points){
            System.out.println(Arrays.toString(point));
        }

    }
}
