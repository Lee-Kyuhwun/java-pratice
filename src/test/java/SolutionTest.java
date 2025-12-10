import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Solution 클래스의 테스트 코드
 */
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testTwoSum_Example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void testTwoSum_Example2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void testTwoSum_Example3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void testArraySum_PositiveNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 15;

        int result = solution.arraySum(nums);

        assertEquals(expected, result);
    }

    @Test
    void testArraySum_WithNegatives() {
        int[] nums = {-1, 2, -3, 4, -5};
        int expected = -3;

        int result = solution.arraySum(nums);

        assertEquals(expected, result);
    }

    @Test
    void testArraySum_EmptyArray() {
        int[] nums = {};
        int expected = 0;

        int result = solution.arraySum(nums);

        assertEquals(expected, result);
    }
}
