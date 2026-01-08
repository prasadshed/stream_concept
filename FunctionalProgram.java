package Stream_pra;

import java.util.function.Function;
import java.util.stream.IntStream;

public class FunctionalProgram {

	public static void main(String[] args) {
		Function<String, String> str= t -> t.toUpperCase().concat("Prasad");
		
		System.out.println(str.apply("Sachin"));
		/*
		 * imperative type of programming
		 */
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		/*
		 * declarative type of programming
		 */
		System.out.println(IntStream.range(0,10).sum());
	}
	

}
