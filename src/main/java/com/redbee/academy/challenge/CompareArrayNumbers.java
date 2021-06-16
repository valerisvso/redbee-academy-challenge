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
    int result[] = new int[];

    for (int i = 0; i < a.size(); i++) { //(5, 1, 5)
      for (int j = 0; j < b.size(); j++) { //(1, 5, 1)
        if (Integer.valueOf(a) > Integer.valueOf(b) ) { // 5 > 1
          result= Integer.valueOf(a);
        } else {
          result= Integer.valueOf(b);
        }
      }
      System.out.println("The result is: " + result); 
    }
    return null;
  }



}
