package algorithm.samsung;


import java.util.*;

public class HashMapPratice {

    public static void main(String[] args) {

        // 값별 개수 세기
        Map<Integer, Integer> cnt = new HashMap<>();
        for(int v : new int[]{1,2,3,4,3,3}){

            cnt.put(v,cnt.getOrDefault(v,0) + 1);
        }

        int c3 = cnt.getOrDefault(3,0); // 3이 없으면 0

        boolean has = cnt.containsKey(3);
        System.out.println("has = " + has);
        System.out.println("c3 = " + c3);

        // 순회 (순서보장 x)

        for(Map.Entry<Integer, Integer> e : cnt.entrySet()){
            int key = e.getKey();
            int count = e.getValue();
        }

        // 가장 많이 나온 갓 찾기 (동률이면 작은 값)
        int bestKey = -1, bestCnt =0;
        // bestKey 지금까지 가장 많이 나온 숫자
        // bestCnt 지금까지 가장 많이 나온 숫자의 개수


        for(Map.Entry<Integer, Integer> e : cnt.entrySet()){
            int k = e.getKey(), c= e.getValue();
            if(c>bestCnt || (c== bestCnt && k < bestKey)){
                bestKey = k;
                bestCnt = c;
            }
        }
    }
}
