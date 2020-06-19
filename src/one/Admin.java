package one;

public class Admin {
	
	int rank;
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Admin [rank=" + rank + "]";
	}
}