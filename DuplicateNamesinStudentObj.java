package Stream_pra;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNamesinStudentObj {

	public static void main(String[] args) {
		List<Student> students = List.of(
                new Student("Prasad", "Yadav", 21, "male", "Accounts", 2021, "Delhi"),
                new Student("Prabhakar", "Kashyap", 22, "female", "IT", 2021, "Ranchi"),
                new Student("Shedage", "Mehra", 23, "male", "DM", 2021, "Bangalore"),
                new Student("Prasad", "Singh", 23, "female", "Owner", 2021, "Nasik"),
                new Student("Sachin", "Sharma", 27, "male", "Accounts", 2021, "Ratnagiri"),
                new Student("sachin", "Sharma", 27, "male", "Accounts", 2021, "Ratnagiri")
        );
		List<String> res=students.stream().collect(Collectors.groupingBy(e->e.getName(),Collectors.counting())).entrySet().stream().filter(s->s.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(res);
		Map<String, Long> keyval=students.stream().map(Student::getName).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(keyval);
		Map<String, Long> kv=students.stream().map(Student::getDept).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//kv.forEach(((t, u) -> System.out.println(t+u)));
		System.out.println(kv);
	}

}
