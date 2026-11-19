package algorithm.Ktds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class A02Test {

    private final A02 solution = new A02();

    @Test
    void example1() {
        int[] prices = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(3, solution.solution(prices));
    }

    @Test
    void example2() {
        int[] prices = {1, 2, 3, 4, 3, 2, 1};
        assertEquals(-3, solution.solution(prices));
    }

    @Test
    void example3() {
        int[] prices = {1, 2, 3, 4};
        assertEquals(0, solution.solution(prices));
    }

    @Test
    void lengthOne() {
        int[] prices = {100};
        assertEquals(0, solution.solution(prices));
    }

    @Test
    void samePricesResetCounter() {
        int[] prices = {5, 5, 5, 5};
        assertEquals(0, solution.solution(prices));
    }

    @Test
    void risingThenSamePriceThenRising() {
        int[] prices = {1, 2, 2, 3, 4};
        assertEquals(0, solution.solution(prices));
    }
}
