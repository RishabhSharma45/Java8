package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1Creation {

	public static void main(String[] args) {
		
		// Using List
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream = list.stream();
		
		//using array
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr);
		
		//iterate
		Stream.iterate(0, n->n+1).limit(100);
		
		//generate
		Stream.generate(()->(int)Math.random()*100).limit(5);
		
		//stream of
		Stream<Integer> st = Stream.of(1,2,3,4,5);
		
		//operations
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,7,8,5,6,9,4,5);
		List<Integer> listStream = list1.stream().filter(x->x%2==0).map(x->x*100).distinct().sorted((a,b)->b-a).limit(3).skip(1).collect(Collectors.toList());
		System.out.println(listStream);
		
		

	}

}
