package com.redbee.academy.challenge;

import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    //TODO: Implement me
    var result = [];
    for (int i = 0; i < a.length; i++) { //(5, 1, 5)
      for (int j = 0; j < b.length; i++) { //(1, 5, 1)
        if (i > j ) { // 5 > 1
          result = i;
        } else {
          result = j;
        }
      }
      return result; 5
    }
    return null;
  }



}
