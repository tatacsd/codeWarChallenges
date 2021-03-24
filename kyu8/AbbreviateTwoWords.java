package kyu8;
/**
 * Write a function to convert a name into initials. This kata strictly takes 
two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
Patrick Feeney => P.F
 */

public class AbbreviateTwoWords {
  
  public static void main(String[] args) {
    System.out.println(AbbreviateTwoWords.abbrevName("Sam Harris"));
    System.out.println(AbbreviateTwoWords.abbrevName("Patrick Feenan"));
    System.out.println(AbbreviateTwoWords.abbrevName("P Favuzzi"));
    System.out.println(AbbreviateTwoWords.abbrevName("David Mendieta"));
    System.out.println(AbbreviateTwoWords.abbrevName("Evan Cole"));
  }




  public static String abbrevName(String name) {
    String[] arr = name.split(" ");
    String abbreviation = "";
    for(int i = 0; i < arr.length; i++){
      if(i == arr.length-1) {
        abbreviation += arr[i].toUpperCase().charAt(0);
      } else {
        abbreviation += arr[i].toUpperCase().charAt(0) + ".";
      }
    }
    return abbreviation;
  }
}


/**
 * 
 * public static String abbrevName(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }
 */