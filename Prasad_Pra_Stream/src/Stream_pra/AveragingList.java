package Stream_pra;

import java.util.Arrays;
import java.util.List;

public class AveragingList {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,23,45,67);
		double avg=list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(avg);
		double sum=0.0;
		for(int j=0;j<list.size();j++) {
			sum=sum+list.get(j);
			
		}
		double agg=sum/list.size();
		System.out.println(agg);
	}

}
