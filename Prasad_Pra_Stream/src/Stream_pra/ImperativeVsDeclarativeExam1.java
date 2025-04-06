package Stream_pra;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExam1 {

	public static void main(String[] args) {

		List<Integer> in=Arrays.asList(1,1,2,3,4,5,6,3,4,56,78,89);
		///printing given list
		System.out.println(in);
		//imperative style of coding
		Set<Integer> se=new HashSet<Integer>(in);
		System.out.println(se);
		//declarative style of coding
		List<Integer> dup=in.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(dup);
		Map<Integer, Long> dupkey=in.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(dupkey);
	}

}
