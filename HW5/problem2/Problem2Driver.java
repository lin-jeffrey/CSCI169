package problem2;

import java.util.*;

class Driver
{
	//Selection Sort
	static void sort(ArrayList<Fruit> list) 
    { 
        int n = list.size(); 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min = i; 
            for (int j = i+1; j < n; j++) 
                if (list.get(j).compareTo(list.get(min)) == 1) 
                		min = j; 
  
            Collections.swap(list, i, min);
        } 
    } 
	
	public static void main(String args[])
	{
		//declare fruit array
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		//create new fruits
		Date aDate = new Date(300000);
		Fruit a = new Fruit(aDate, "Apple");				//2
		Date bDate = new Date(70000000);
		Fruit b  = new Fruit(bDate, "Banana");			//4
		Date cDate = new Date(5000000);
		Fruit c  = new Fruit(cDate, "Cantaloupe");		//3
		Date dDate = new Date(10000);
		Fruit d  = new Fruit(dDate, "Durian");			//1
		Date eDate = new Date(800000000);
		Fruit e  = new Fruit(eDate, "Elderberry");		//5
		
		//add fruits to 
		fruitList.add(a);
		fruitList.add(b);
		fruitList.add(c);
		fruitList.add(d);
		fruitList.add(e);
	
		//print unsorted arraylist
		System.out.println("Unsorted:");
		for(int i = 0; i < fruitList.size(); i++) {
			System.out.println("Name: " + fruitList.get(i).getFruitName() + "\t Date: " + fruitList.get(i).getRipeTime());
		}
		
		//sortlist
		Driver.sort(fruitList);
		
		//print sorted arraylist
		System.out.println("\nSorted: ");
		for(int i = 0; i < fruitList.size(); i++) {
			System.out.println("Name: " + fruitList.get(i).getFruitName() + "\t Date: " + fruitList.get(i).getRipeTime());
		}
	}
}