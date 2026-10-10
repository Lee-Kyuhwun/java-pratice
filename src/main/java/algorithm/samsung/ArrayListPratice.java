package algorithm.samsung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPratice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);

        int a = list.get(0);
        System.out.println("a = " + a);
        list.set(1,9);

        // Integer 리스트의 Remove 함정

        list.remove(1); // 1번 인덱스 삭제 -> 즉 9가 삭제된다는거
        list.remove(Integer.valueOf(5)); // 5라는 값 삭제

        // 정렬
        Collections.sort(list); // 오름 차순
        list.sort(Collections.reverseOrder());// 내림차순

        //격자에서 빈칸 좌표 모으기 (조합 후보)

        List<int[]> empties = new ArrayList<>();

//        for(int r =0; r<n; r++){
//            for(int c =0; c<m; c++){
//                if(map[r][c]==0)
//                    empties.add(new int[]{r,c});
//            }
//        }

        int v  =5;
        // 그래프 인접리스트
        List<Integer>[] graph = new ArrayList[v];
        for(int i =0; i < v ; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1); // u에서 v로 가는 간선 추가


        // 순회하면서 지우려면 removeIf
        Integer B = Integer.valueOf(5);
        list.removeIf(b-> B<0);

        // 리스트 -> int 배열
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();




    }
}
