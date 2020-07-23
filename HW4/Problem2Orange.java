package problem2;

import java.util.Date;

public class Orange extends Fruit{
	//constructors
	public Orange(){
	}
	public Orange(Date inputDate){
		this.setRipeTime(inputDate);
	}
	
	//over writing prepare()
	public void prepare() {
		System.out.println("Peel the orange");
	}

}
