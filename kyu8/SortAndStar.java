package kyu8;

/*
You will be given a vector of strings. You must sort it alphabetically 
(case-sensitive, and based on the ASCII values of the chars) and then 
return the first value.
The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.
*/

import java.util.Arrays;

public class SortAndStar {

  public static void main(String[] args) {
    System.out.println(twoSort(new String[] {
      "bitcoin", 
      "take", 
      "over", 
      "the", 
      "world", 
      "maybe", 
      "who", 
      "knows", 
      "perhaps"
    }));

    System.out.println(twoSort(new String[] {
      "turns", 
      "out", 
      "random", 
      "test", 
      "cases", 
      "are", 
      "easier", 
      "than", 
      "writing", 
      "out", 
      "basic", 
      "ones"
    }));

  }


  public static String twoSort(String[] s) {
    String delimiter = "***";
    Arrays.sort(s);
    String firstValue = "";
    for(int i = 0; i < s[0].length(); i++){
      if(i == s[0].length()-1){
        firstValue += s[0].charAt(i);
      } else {
        firstValue += s[0].charAt(i) + delimiter;
      }
      
    }
    return firstValue;
  }
  
}



/**
 * Another solution
 *  public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
 * 
*/