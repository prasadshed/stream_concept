package Stream_pra;

import java.util.function.Function;

public class FunctionalProgram {

	public static void main(String[] args) {
		Function<String, String> str= t -> t.toUpperCase().concat("Prasad");
		
		System.out.println(str.apply("Sachin"));
	}

}
