package Stream_pra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DecendingOrderComparator {

	public static void main(String[] args) {
		List<Integer> in=Arrays.asList(12,45,67,87,89,9);
		Collections.sort(in);
		System.out.println(in);
		Collections.sort(in, (o1, o2) -> o1>o2?-1:o1<o2?1:0 );
		
		Comparator<Integer> cm=(o1, o2) -> o1>o2?-1:o1<o2?1:0;
		Collections.sort(in,cm);
		System.out.println(in);
		
		
		
	}

	

}
