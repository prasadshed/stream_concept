package Stream_pra;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerRealTimeImpl {

	public static void main(String[] args) {
		
		
		List<Student> students = List.of(
                new Student("Prasad", "Yadav", 21, "male", "Accounts", 2021, "Delhi"),
                new Student("Prabhakar", "Kashyap", 22, "female", "IT", 2021, "Ranchi"),
                new Student("Shedage", "Mehra", 23, "male", "DM", 2021, "Bangalore"),
                new Student("Prasad", "Singh", 23, "female", "Owner", 2021, "Nasik"),
                new Student("Sachin", "Sharma", 27, "male", "Accounts", 2021, "Ratnagiri"),
                new Student("sachin", "Sharma", 27, "male", "Accounts", 2021, "Ratnagiri")
        );
		
		Consumer<Student> ci=t -> System.out.println(t);
		students.forEach(ci);
		Consumer<List<Student>> c1=t -> System.out.println(t);
		c1.accept(students);
	}

}
