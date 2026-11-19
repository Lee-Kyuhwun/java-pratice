package algorithm.Ktds;

/**
 * A01. 상승 횟수 세기
 */
public class A01 {

    /**
     * 직전 날보다 가격이 오른 날의 수를 반환합니다.
     *
     * @param prices 일별 가격 배열
     * @return 전날보다 가격이 오른 날의 수
     */
    public int solution(int[] prices) {
        int risingDays = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                risingDays++;
            }
        }

        return risingDays;
    }
}
