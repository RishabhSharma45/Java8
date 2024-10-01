package java8;

import java.util.function.Predicate;

public class predicate1 { // condition check krke ayega
   public static void main(String args[]) {
	   Predicate<Integer> predicate = x -> x>100000;
	   System.out.println(predicate.test(50000));
	   Predicate<Integer> predicate1 = x -> x%2 == 0;
	   Predicate<Integer>and = predicate.and(predicate1);
	   Predicate<Integer> or = predicate.or(predicate1);
	   
	   Predicate<Integer> equal = Predicate.isEqual(2);
	   
	   System.out.println(and.test(2000));
	   System.out.println(or.test(2));
	   System.out.println(equal.test(2));
	   
	   
	   
	   
   }
}
