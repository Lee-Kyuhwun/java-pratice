package algorithm.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BFS_pratice {
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int n;
    static int m;
    static int[][] map;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for(int i=0; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<m;j++){
               map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = bfs(0,0);

        System.out.println("answer = " + answer);

    }



    static int bfs(int sr,int sc) {
        int[][] dist = new int[n][m];

        // row들 -1로 채우기
        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }
        dist[0][0] = 0;

        // 좌표들을 담을 큐
        Deque<int[]> q = new ArrayDeque<>();

        //좌표 넣기
        q.offer(new int[]{sr, sc}); // offer은 큐에 값 넣는거

        dist[sr][sc] = 0; // 넣을 때 방문 표시

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int d = 0; d < 4; d++) {

                int nr = cur[0] + dr[d]; // 좌표 이동
                int nc = cur[1] + dc[d];

                if (nr < 0 || nc < 0 || nr >= n || nc >= m) {
                    continue;
                }
                // map : 1 = 길, 0 = 벽

                if (nr < 0 || nc < 0 || dist[nr][nc] != -1) continue; //


                dist[nr][nc] = dist[cur[0]][cur[1]] + 1; // 거리 갱신

                q.offer(new int[]{nr, nc});
            }
        }
        return dist[n - 1][m - 1];
    }


}
