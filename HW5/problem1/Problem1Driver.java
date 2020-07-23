package problem1;

import java.util.*;

//import java.util.Date;

class Driver
{
	public static ArrayList<Object> classify(ArrayList<Object> args) {
		ArrayList<Object> newList = new ArrayList <Object>();
		for(int i = 0; i < args.size(); i++) {
			Object element = args.get(i);
			if(element == "Food") {
				String nextString = String.valueOf(args.get(i+1));
				if(nextString != "Food" && nextString != "Fruit" && nextString != "Apple" && nextString != "Orange") {
					Food fd = new Food(nextString);
					newList.add(fd);
					i++;
				}
				else {
					Food fd = new Food();
					newList.add(fd);
				}
			}
			if(element == "Orange") {
				Object nextElement = args.get(i+1);
				String nextString = String.valueOf(args.get(i+1));
				if(nextElement instanceof Integer) {
					Date newDate = new Date((Long) nextElement);
					Orange o = new Orange(newDate);
					newList.add(o);
					i++;
				}
				else if(nextString == "now") {
					Date newDate = new Date();
					Orange o = new Orange(newDate);
					newList.add(o);
					i++;
				}
				else {
					Orange o = new Orange();
					newList.add(o);
				}
			}
			if(element == "Fruit") {
				String nextString = String.valueOf(args.get(i+1));
				Object nextElement = args.get(i+2);
				if(nextString != "Food" && nextString != "Fruit" && nextString != "Apple" && nextString != "Orange" && nextElement instanceof Integer) {
					Integer num = (Integer) args.get(i+2);
					Long l = Long.valueOf(num);
					Date newDate = new Date(l);
					Fruit ft  = new Fruit(newDate, nextString);
					newList.add(ft);
					i += 2;
				}
				else if(nextString != "Food" && nextString != "Fruit" && nextString != "Apple" && nextString != "Orange" && nextElement instanceof String) {
					String date = String.valueOf(args.get(i+2));
					if(date == "now") {
						Date newDate = new Date();
						Fruit ft  = new Fruit(newDate, nextString);
						newList.add(ft);
						i += 2;
					} 
				}
				else {
					Fruit ft = new Fruit();
					newList.add(ft);
				}
				
			}
			if(element == "Apple") {
				Object nextElement = args.get(i+1);
				String nextString = String.valueOf(args.get(i+1));
				if(nextElement instanceof Integer) {
					Date newDate = new Date((Long) nextElement);
					Apple a = new Apple(newDate);
					newList.add(a);
					i++;
				}
				else if(nextString == "now") {
					Date newDate = new Date();
					Apple a = new Apple(newDate);
					newList.add(a);
					i++;
				}
				else {
					Apple a = new Apple();
					newList.add(a);
				}
			}
		}
		return newList;
	};

	public static void main(String args[])
	{
		ArrayList<Object> list = new ArrayList <Object>();
		list.add("Food");
		list.add("Orange");
		list.add("Fruit");
		list.add("Papaya");
		list.add(3932728);
		list.add("Apple");
		list.add("now");
		list.add("Food");
		list.add("sandwich");
		System.out.println("Contents of list: " + list);

		ArrayList<Object> newList = classify(list);
		System.out.println("Contents of list: " + newList);
	}
}