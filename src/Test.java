import java.util.*;

 public class Test {
     int val = 10;

     public static void main(String[] args) {
//     Test t1 = new Test();
//     String s1 = "Hello";
//     s1 = "is";
//         System.out.println(s1);
//         System.out.println(t1.val);
//         Test.add(10.02,20);
//         Set<Integer> set = new TreeSet<>();
//         set.add(3);
//         set.add((int)3.0);
//         set.add(2);
//         set.add(2);
//         set.add(new Integer(2));
//         set.add(Integer.parseInt("2"));
//         System.out.println(set);
//         List<String> list1 = new ArrayList<>();
//         list1.add("foo");
//
//
//         List<String> list2 = list1;
//         List<String> list3 = new ArrayList<>(list2);
//         list1.clear();
//         list2.add("bar");
//         list3.add("baz");
//         System.out.println(list1);
//         System.out.println(list2);
//         System.out.println(list3);

         String s1 = "a";
         String s2 = "a";
         String s3 = new String("a");
         System.out.println(s1.hashCode());
         System.out.println(s2.hashCode());
         System.out.println(s3.hashCode());

     }
     static void add(int x, int y){
         System.out.println("haha");
     }
     static void add(double x, double y){
         System.out.println("hoho");
     }
 }
