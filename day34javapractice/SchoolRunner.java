package day34javapractice;

public class SchoolRunner {

	public static void main(String[] args) {
		Student std = new Student();
		std.setName("Omar");
		std.setLastname("Hayyam");
		std.setId(111);
		std.setDepartmentName(ITDepartment.NAME);
		
		Instructor ins = new Instructor();
		ins.setName("Suleyman");
		ins.setLastname("Alptekin");
		ins.setDepartmentName(ITDepartment.NAME);
		
		std.setInstructor(ins);
		
		ITDepartment it = std;
		System.out.println(it);
	}

}
