package problem2;
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
}
