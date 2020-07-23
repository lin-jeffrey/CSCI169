package problem2;

public class Seafood extends Food{
	//constructors
	public Seafood(){
	}
	public Seafood(String inputName){
		this.setName(inputName);
	}
	
	//functions
	public void prepare() {
		System.out.println("Peel the " + this.getClass().getSimpleName().toLowerCase());
	}
}
