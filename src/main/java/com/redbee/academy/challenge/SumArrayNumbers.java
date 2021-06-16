package com.redbee.academy.challenge;

import java.util.List;

public class SumArrayNumbers {

  /**
   * Method that receives an array of numbers and
   * returns the sum of each number
   *
   * @param array - Some integer list. ([1,2,3])
   * @return The result of 1 + 2 + 3
   */
  public static Integer sum(List<Integer> array) {
    //TODO: Implement me
    int result = 0;

    for(i = 0; i < array.length; i++) { 
      for(j = i + 1; j < array.length; j++) {
        if(array(i) + array(j) == n) {
          result = array(i) + array(j);
          System.out.println("The sum of " + result);
        }
      }
    }
    return null;
  }
}
