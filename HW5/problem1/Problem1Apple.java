package problem1;

import java.util.Date;

public class Apple extends Fruit{
	//constructors
	public Apple(){
	}
	public Apple(Date inputDate){
		this.setRipeTime(inputDate);
	}
	
	//over writing prepare()
	public void prepare() {
		System.out.println("Core the apple");
	}
}
