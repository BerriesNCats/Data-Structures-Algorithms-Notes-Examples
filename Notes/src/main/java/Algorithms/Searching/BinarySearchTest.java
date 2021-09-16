package Algorithms.Searching;

import static Algorithms.Searching.BinarySearch.binarySearch;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

  @Test
  void binarySearchTest1() {
    int[] numbers = {1, 2, 3, 4, 6, 8, 9, 11, 14, 15, 17, 18, 20, 21, 26};

    assertEquals(3, binarySearch(numbers, 4));
    assertEquals(5, binarySearch(numbers, 8));
    assertEquals(-1, binarySearch(numbers, 34));
  }

}