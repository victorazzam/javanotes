/*

 EXAMPLES                                        OUTPUT
 --------                                        ------


 Variable length arguments
 =========================

 public static void main(String[] args)
 {
   example(1,2,5,3,4,9);                         1 2 5 3 4 9
 }

 public static int example(int... n)
 {
   for (int i: n) System.out.print(i + " ");
 }


 Arrays class
 ============

 import java.util.Arrays;
 int[] example = {4, 1, 5, 3, 2};
 Arrays.sort(example);                           {1, 2, 3, 4, 5}
 Arrays.toString(example);                       "1 2 3 4 5"
 Arrays.equals(example, {1, 9, 5});              false
 Arrays.binarySearch(example, 3);                2
 Arrays.asList("Alice", "Bob", "Cody");          // ... = new ArrayList<>(__USE_HERE__);


 String methods
 ==============

 String a = "Pilot Gear";
 a.length();                                     10
 a.equals("ball");                               false
 a.toLowerCase();                                "pilot gear"
 a.split(" ");                                   {"Pilot", "Gear"}
 "  Abc ".trim();                                "Abc"

*/