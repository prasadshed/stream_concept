package Stream_pra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterCountOfString {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("Prasad","Prabhakar","shedage","Malan");
		Long count=str.stream().filter(e->e.length()>5).count();
		System.out.println(count);
		List<String> res=str.stream().filter(e->e.length()>5).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(res);
	}

}
