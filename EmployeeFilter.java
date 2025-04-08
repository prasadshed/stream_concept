package Stream_pra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeFilter {

	public static void main(String[] args) {
		
		List<Employee> list=Arrays.asList(
				
				new Employee(2128900,"Prasad",29856.78),
				new Employee(2128910,"Prabhakar",28859.89),
				new Employee(2128915,"Shedage",23866.87),
				new Employee(2128920,"Sachin",27656.8),
				new Employee(2128925,"Prasad",30956.78));
		List<Employee>lsemp=list.stream().sorted((o1, o2) -> o1.getSalary()>o2.getSalary()?-1:o1.getSalary()<o2.getSalary()?1:0).collect(Collectors.toList());
		System.out.println(lsemp);
		Map<String,Long> kv=list.stream().map(Employee::getEmpName).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(kv);
		double avg=list.stream().mapToDouble(value -> value.getSalary()).average().orElse(0.0);
		System.out.println(avg);
	}

}
