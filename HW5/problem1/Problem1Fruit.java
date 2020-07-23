package problem1;
import java.util.Date;

public class Fruit extends Food {
	private Date ripeTime;
	
	//constructors
	public Fruit(){
	}
	public Fruit(Date inputDate,String inputName){
		this.setName(inputName);
		this.setRipeTime(inputDate);
	}
	
	//functions
	public void setRipeTime(Date inputDate) {
		ripeTime = inputDate;
	}
	public void ripeTime() {
		System.out.println("You can eat it on " + ripeTime);
	}
	public int compareTo(Fruit ft) {
		if(ripeTime.compareTo(ft.ripeTime)<0)		//fruit 1 date is earlier than fruit 2
			return 1;
		else if(ripeTime.compareTo(ft.ripeTime)>0)	//fruit 1 date is later than fruit 2
			return -1;
		else											//fruit dates are same
			return 0;
	}
}
