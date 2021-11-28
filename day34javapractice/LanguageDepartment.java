package day34javapractice;

public interface LanguageDepartment extends School{
	
	
	public static final String NAME ="Language Department";
	
	
	public abstract Instructor instructor();
	public abstract Student student();
	
	public String labName();
	
	public boolean isLabAvailable();
	
}
