package algorithm.Ktds;

public class A02 {

    /**
     * 2.5 A02. 3연속 상승 매수 / 3연속 하락 매도
     *
     * 가격 배열을 순회하여 다음 규칙을 적용한 뒤 최종 현금을 반환합니다.
     * - 0번째 날은 관찰만 합니다.
     * - 오늘 가격이 어제 가격보다 높으면 상승 카운터를 갱신합니다.
     * - 오늘 가격이 어제 가격보다 낮으면 하락 카운터를 갱신합니다.
     * - 상승 카운터가 3이 되면 오늘 가격으로 1주 매수하고 카운터를 초기화합니다.
     * - 하락 카운터가 3이 되면 보유 주식을 전량 매도하고 카운터를 초기화합니다.
     * - 순회가 끝난 뒤 보유 주식이 남아 있으면 마지막 날 가격으로 전량 매도합니다.
     *
     * @param prices 일별 가격 배열
     * @return 최종 현금
     */
    public int solution(int[] prices) {
        // TODO: 구현

        int cnt = 0;
        int up = 0;
        int down =0;
        int stock = 0;
        int money =0;

        for(int i =1; i< prices.length; i++){
            if(prices[i-1] > prices[i]){
                down++;
        }else if(prices[i-1] < prices[i]){
                up++;
            }

            if(up == 3){
                stock+=1;
                money -= prices[i];
                up =0;
                down =0;
            }
            if(down == 3){
                money += prices[i] * stock;
                stock = 0;
                up=0;
                down =0;
            }
        }
        if(stock != 0){
            money += prices[prices.length-1] * stock;
        }
        System.out.println(money);
        return money;
    }
}
