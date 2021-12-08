import java.util.*;

 public class Test {
     int val = 10;

     public static void main(String[] args) {
     Test t1 = new Test();
     String s1 = "Hello";
     s1 = "is";
         System.out.println(s1);
         System.out.println(t1.val);
         Test.add((float) 10.02,20);

     }
     static void add(int x, float y){
         System.out.println("haha");
     }
     static void add(float x, int y){
         System.out.println("hoho");
     }
 }
