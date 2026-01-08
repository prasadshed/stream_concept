package Stream_pra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccuranceInList {

	public static void main(String[] args) {
		List<String> lis=Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		List<String> lis1=lis.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(lis1);
		Map<String, Long> keyval=lis.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(keyval);
		Map<String,Long> lis2=lis.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println(lis2);
	}

}
