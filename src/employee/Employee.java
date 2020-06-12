package employee;

public class Employee {
	private int sabun;
	private String name;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [sabun=" + sabun + ", name=" + name + "]";
	}

}
