package day34javapractice;

public class Student implements ITDepartment, LanguageDepartment{
	
	private String name;
	private String lastname;
	private int id;
	private String departmentName;
	private Instructor instructor;
	private String labName;
	
	
	@Override //This method comes from super and parent interfaces
	public String departmentName() {
		
		return this.departmentName;
	}
	@Override //This method comes from super and parent interfaces, so no need to create a getter
	public Instructor instructor() {
		
		return this.instructor;
	}
	@Override //This method comes from super and parent interfaces, so no need to create a getter
	public Student student() {
		
		return this;
	}
	@Override //This method comes from super and parent interfaces, so no need to create a getter
	public String labName() {
		
		return this.labName;
	}
	@Override //This method comes from super and parent interfaces, so no need to create a getter
	public boolean isLabAvailable() {
		
		return false;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastname;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", id=" + id + ", departmentName=" + departmentName
				+ ", instructor=" + instructor + ", labName=" + labName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}