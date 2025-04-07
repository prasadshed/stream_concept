package Stream_pra;

import java.util.Arrays;
import java.util.List;

public class AveragingList {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,23,45,67);
		double avg=list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(avg);
	}

}
