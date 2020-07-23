package problem2;
import java.util.Date;

public class Fruit extends Food implements Comparable<Fruit>{
	private Date ripeTime;
	private String fruitName;
	//constructors
	public Fruit(){
	}
	public Fruit(Date inputDate,String inputName){
		this.setFruitName(inputName);
		this.setRipeTime(inputDate);
	}
	
	//functions
	public void setRipeTime(Date inputDate) {
		this.ripeTime = inputDate;
	}
	
	public Date getRipeTime() {
		return ripeTime;
	}
	
	public void ripeTime() {
		System.out.println("You can eat it on " + ripeTime);
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
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
