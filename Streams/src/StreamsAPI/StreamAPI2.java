package StreamsAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPI2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,10,15,8,9,12,15,49,25,12,98,32);
		//even numbers
		list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		System.out.println();
		//remove duplicates
		list.stream().distinct().forEach(n->System.out.printf(n+" "));
		System.out.println();
		//total count
		long i = list.stream().count();
		System.out.println(i);
		//first element
		list.stream().findFirst().ifPresent(System.out::print);
		System.out.println();
		//sort all elements
		list.stream().sorted().forEach(n->System.out.print(n+" "));
	}

}
