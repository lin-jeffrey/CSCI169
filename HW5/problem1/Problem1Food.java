package problem1;

public class Food {
	private String name;
	
	//constructors
	public Food(){
	}
	public Food(String input){
		this.setName(input);
	}
	
	//functions
	public void setName(String input) {
		name = input;
	}
	public void prepare() {
		System.out.println("Prepare the " + name);
	}
}
