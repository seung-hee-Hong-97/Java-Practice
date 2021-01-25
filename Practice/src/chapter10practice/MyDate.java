package chapter10practice;

public class MyDate {

	public int year;
	public int month;
	public int day;
	
	public MyDate(int year, int month, int day) {
		this.year= year;
		this.month= month;
		this.day= day;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date= (MyDate) obj;
			if(date.year == this.year && date.month == this.month && date.day == this.day) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return day*11 + month * 111 + year * 1111;
	}
	
	
	
	
}
