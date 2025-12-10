import java.util.HashMap;
import java.util.Map;

/**
 * 코딩테스트 연습 - Two Sum 문제
 *
 * 문제: 정수 배열 nums와 목표값 target이 주어졌을 때,
 * 두 수의 합이 target이 되는 두 수의 인덱스를 반환하세요.
 *
 * 예제:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * 설명: nums[0] + nums[1] = 2 + 7 = 9
 */
public class Solution {

    /**
     * Two Sum 문제 풀이
     * @param nums 정수 배열
     * @param target 목표 합
     * @return 두 수의 인덱스 배열
     */
    public int[] twoSum(int[] nums, int target) {
        // 여기에 코드를 작성하세요
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found");
    }

    /**
     * 배열의 합 구하기 (연습 문제)
     * @param nums 정수 배열
     * @return 배열의 모든 요소의 합
     */
    public int arraySum(int[] nums) {
        // 여기에 코드를 작성하세요
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
