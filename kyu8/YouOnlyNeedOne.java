package kyu8;
public class YouOnlyNeedOne {

  public static void main(String[] args) {
    System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
  }

 

  public static boolean check(Object[] a, Object x) {
      // Your code here
  boolean flag = false;
      for(int i = 0; i < a.length; i++) {
        if(a[i].equals(x)) {
          flag = true;
          break;
        } else { 
          flag = false;
        }
      }	      
      return flag;
    }
}

/**
 * 
 *  public static boolean check(Object[] a, Object x) {
    return java.util.Arrays.asList(a).contains(x);
}
 */