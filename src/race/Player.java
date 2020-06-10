package race;

public class Player {
	
	String name;
	int record;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public void showRecord() {
		System.out.println("이름 : "+name+", 기록 : "+record);
	}
	
}
