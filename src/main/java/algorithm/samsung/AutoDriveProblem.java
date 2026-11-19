package algorithm.samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class AutoDriveProblem {

    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static int[][] map;
    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 다음줄 넘기기
        st =  new StringTokenizer(br.readLine());
        // 0는 북 , 1은 동, 2는 남, 3은 서

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for(int i =0 ; i < n ; i++){
            st= new StringTokenizer(br.readLine());
            for(int j =0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = drive(x, y, d);
        System.out.println(answer);
    }

    static int drive (int x, int y, int d){
        boolean[][] visited = new boolean[n][m];

        visited[x][y] = true;
        int turnCount =0;
        int area = 1; // 출반칸도 면적에 포함
        while(true){
            d = (d+3) % 4;

            int nr = x + dr[d];
            int nc = y + dc[d];

            if(map[nr][nc] == 0  && !visited[nr][nc]){
                x = nr;
                y = nc;
                visited[x][y] = true;
                area++;
                turnCount =0;
            }else{
                turnCount ++;
            }

            // 4방향 모두 회전했으면
            if(turnCount ==4){
                //뒤로 후진
                nr = x - dr[d];
                nc = y - dc[d];

                if(map[nr][nc] == 1){
                    break;
                }
                x = nr;
                y = nc;
                turnCount =0;
            }
        }
        return area;
    }
}
