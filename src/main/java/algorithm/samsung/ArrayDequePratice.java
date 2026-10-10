package algorithm.samsung;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ArrayDequePratice {

    public static void main(String[] args) {

        Deque<int[]> q = new ArrayDeque<>();

        q.offer(new int[]{0,0});
        q.offer(new int[]{0,1});

        int[] first = q.poll();

        int[] next = q.peek();

        System.out.println("next = " + Arrays.toString(next));
        System.out.println("first = " + Arrays.toString(first));
//        System.out.println("q.peek() = " + Arrays.toString(q.peek()));

        // 스택: 나중에 넣은 것이 먼저 나옴

        Deque<Integer> st = new ArrayDeque<>();
        st.push(1);
        st.push(2);

        int top = st.pop();
        int below = st.peek();

        // 거리 단위로 끊어서: 확산 문제에서 1초마다 이런거 있으면
        int time =0;
        while(!q.isEmpty()){
            int sz = q.size(); // 지금 큐에 든것  = 같은 시간에 퍼진 칸

            for(int k =0; k<sz; k++){
                int[] cur = q.poll();
            }
            time++;
        }




    }
}
