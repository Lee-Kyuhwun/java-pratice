package algorithm.Ktds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class A03Test {

    private final A03 solution = new A03();

    @Test
    void example1() {
        int[] a = {12, 34, 5, 101, 20};
        assertEquals(2, solution.solution(a));
    }

    @Test
    void example2() {
        int[] a = {0};
        assertEquals(1, solution.solution(a));
    }

    @Test
    void digitSums() {
        int[] a = {1, 11, 100, 999, 100000};
        assertEquals(3, solution.solution(a));
    }

    @Test
    void allSingleDigits() {
        int[] a = {0, 2, 4, 6, 8};
        assertEquals(5, solution.solution(a));
    }

    @Test
    void oddAndEvenMixed() {
        int[] a = {10, 19, 21, 22, 99};
        assertEquals(2, solution.solution(a));
    }
}
