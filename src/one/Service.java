package one;

public interface Service {
	public void join(Student student);
	public void login(Student student);
	public void changePw(Student student);
	public void withdrawal(Student student);
	public void exitstId(String id);
	public void myPage(String id);
	public Student input(Student student);
	
	public void list();
	public Student idSearch(String id);
	public void nameSearch(String name);
	public void count();
	public void sort();
}
