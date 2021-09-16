package Algorithms.AlgoExpert.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoNumSumTest {

                // 0, 1, 2, 3, 4, 5,  6,  7,  8,  9,  10, 11, 12
  int[] numbers = {4, 5, 6, 8, 9, 22, 25, 26, 28, 36, 37, 42, 56};

  @Test
  void twoNumSumWithTwoPointers() {
    int[] result = TwoNumSum.twoNumSumWithTwoPointers(numbers, 33);
    assertEquals(1, result[0]);
    assertEquals(8, result[1]);
  }

  @Test
  void twoNumSumWithHashMap() {
    int[] result = TwoNumSum.twoNumSumWithHashMap(numbers, 42);
    assertEquals(9, result[0]);
    assertEquals(2, result[1]);
  }

  @Test
  void twoNumSumBruteForce() {
    int[] result = TwoNumSum.twoNumSumBruteForce(numbers, 51);
    assertEquals(4, result[0]);
    assertEquals(11, result[1]);
  }
}