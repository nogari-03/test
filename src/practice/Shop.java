package practice;

public class Shop {
	
	String name;
	int phone;
	int tv;
	int computer;
	
	int sum;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getTv() {
		return tv;
	}

	public void setTv(int tv) {
		this.tv = tv;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	public void sum() {
		sum = phone+tv+computer;
		System.out.println("결제하실 총 금액은"+sum+"만원입니다.");
	}
}
