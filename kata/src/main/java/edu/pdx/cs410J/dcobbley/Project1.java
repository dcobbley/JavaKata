package edu.pdx.cs410J.dcobbley;

import edu.pdx.cs410J.AbstractPhoneBill;

import java.util.HashMap;
import java.util.Map;

/**
 * The main class for the CS410J Phone Bill Project
 */
public class Project1 {

  public static void main(String[] args) {

    Map ones = new HashMap<>();
    Map tens = new HashMap<>();


    ones.put("1", "one");
    ones.put("2", "two");
    ones.put("3", "three");
    ones.put("4", "four");
    ones.put("5", "five");
    ones.put("6", "six");
    ones.put("7", "seven");
    ones.put("8", "eight");
    ones.put("9", "nine");

    tens.put("10", "ten");
    tens.put("11", "eleven");
    tens.put("12", "twelve");
    tens.put("13", "thirteen");
    tens.put("14", "fourteen");
    tens.put("15", "fifteen");
    tens.put("16", "sixteen");
    tens.put("17", "seventeen");
    tens.put("18", "eightteen");
    tens.put("19", "nineteen");

    StringBuilder str = new StringBuilder();

    for (String arg : args) {
      if (arg.length() == 1) {
        System.out.println(ones.get(arg));
      } else if(arg.length() == 2) {
        System.out.println(tens.get(arg));
      }

    }

    System.exit(1);
  }

}