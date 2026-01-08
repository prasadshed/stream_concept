package Stream_pra;

public class Student {

	private String name;
	private String lname; 
	 private int age;
	private String gender;
	private String dept;
	private int year;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private String city;
	
	public Student(String name, String lname, int age, String gender, String dept, int year, String city) {
		super();
		this.name = name;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.year = year;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lname=" + lname + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", year=" + year + ", city=" + city + "]";
	}
	

}
