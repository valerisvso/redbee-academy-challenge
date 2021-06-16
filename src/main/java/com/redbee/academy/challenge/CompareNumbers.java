package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    //TODO: Implement me
    if((Integer.valueOf(a) > Integer.valueOf(b)) && (Integer.valueOf(a) > Integer.valueOf(c)) {
      System.out.println("The Max Integer Number is: " + Integer.valueOf(a));
    } else if( (Integer.valueOf(b) > Integer.valueOf(a)) && (Integer.valueOf(b) > Integer.valueOf(c)) ) {
      System.out.println("The Max Integer Number is: " + Integer.valueOf(b));
    } else {
      System.out.println("The Max Integer Number is: " + Integer.valueOf(c));
    }
    return null;
  }
}
