package Stream_pra;

import java.util.Arrays;
import java.util.List;

public class MaxInStream {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(12,45,67,89,4,3,88);
		int max=l.stream().max((o1, o2) -> o1.compareTo(o2)).orElse(0);
		System.out.println(max);
	}

}
