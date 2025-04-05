package Stream_pra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(12,23,45,12,23);
		Set<Integer> dup=li.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println(dup);
	}

}
