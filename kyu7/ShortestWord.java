package kyu7;

/**
 * Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {

  public static void main(String[] args) {
    System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
  }




  public static int findShort(String s) {
    String[] arr = s.split(" ");
    int minLength = arr[0].length();
    for(int i = 1; i < arr.length; i++){
      if(minLength > arr[i].length()){
        minLength = arr[i].length();
      }
    }
    return minLength;
  }
  
}
