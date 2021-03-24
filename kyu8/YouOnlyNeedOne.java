package kyu8;
public class YouOnlyNeedOne {

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