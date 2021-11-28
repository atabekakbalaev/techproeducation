package day34javapractice;

public class Instructor implements ITDepartment, LanguageDepartment {
	private String name;
	private String lastname;
	private String title;
	private String departmentName;
	private String labName;
	private int id;
	
	@Override
	public String departmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String name) {
		this.departmentName = name;
	}
	@Override
	public Instructor instructor() {
		return this;
	}
	@Override
	public Student student() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String labName() {
		return this.labName;
	}
	public void setLabName(String name) {
		this.labName = name;
	}
	@Override
	public boolean isLabAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", lastname=" + lastname + ", title=" + title + ", departmentName="
				+ departmentName + ", labName=" + labName + ", id=" + id + "]";
	}
	
}
