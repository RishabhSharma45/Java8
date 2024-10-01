package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 { // jo kahoge deduga bina return ke

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<List<Integer>> listConsumer = li -> {
			for(Integer i : li) {
				System.out.println(i*100);
			}
		};
		listConsumer.accept(Arrays.asList(1,2,3,4,5));
 
	}

}
