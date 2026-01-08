package Stream_pra;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesFind {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "mango", "banana");
		Set<String> dup=new HashSet<String>(items);
		System.out.println(dup);
		///
		///
		///
		///
		
		Set<String> dupli=
		items.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println(dupli);
		
		
		items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(s->s.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
	}

}
