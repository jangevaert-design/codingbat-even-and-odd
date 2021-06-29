package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatEvenAndOdd.evenOdd;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatEvenAndOddTest {

  private int[][] evenParams = {
      {1, 0, 1, 0, 0, 1, 1},
      {3, 3, 2},
      {2, 2, 2},
      {3, 2, 2},
      {1, 1, 0, 1, 0},
      {1},
      {1, 2},
      {2, 1},
      {}
  };

  private int[][] evenExpected = {
      {0, 0, 0, 1, 1, 1, 1},
      {2, 3, 3},
      {2, 2, 2},
      {2, 2, 3},
      {0, 0, 1, 1, 1},
      {1},
      {2, 1},
      {2, 1},
      {}
  };

  @Test
  void evenTest() {
    for (int i = 0; i < evenParams.length; i++) {
      String actual = Arrays.toString(evenOdd(evenParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(evenExpected[i]));
    }
  }

}