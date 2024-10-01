package java8;

import java.util.function.Function;

public class function1 { // kaam krke layega
	
	public static void main(String args[]) {
		Function<String , Integer> function = s -> s.length(); 
		System.out.println(function.apply("xyz"));
		Function<String , String> function1 = s -> s.substring(0,3); 
		System.out.println(function1.apply("qwertyu"));
		
		Function<Integer , Integer> function3 = s -> s*2; 
		Function<Integer , Integer> function4 = s -> s*s;  
		System.out.println(function3.andThen(function4).apply(5));
		System.out.println(function4.andThen(function3).apply(5));
		System.out.println(function3.compose(function4).apply(5));
		
	}

}
