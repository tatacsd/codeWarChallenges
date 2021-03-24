package kyu8;

/**
 * 
 * Given an array of integers your solution should find the smallest integer.
For example:
Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class SmallestIntegerFinder {

  public static void main(String[] args) {
    int [] test = new int[]{78,56,232,12,11,43};
    System.out.println(findSmallestInt(test));
  }





  // Methods
  public static int findSmallestInt(int[] args) {
    int min = args[0];
    for(int i = 0; i < args.length; i++){
      if(min > args[i]){
        min = args[i];
      }
    }
    return min;
  }

  
}
