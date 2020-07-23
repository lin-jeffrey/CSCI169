#include <iostream>
 
using namespace std;

class Food{
public:
    Food(){
        name = " ";  
        cout << "Food has been created" << endl;
    };
	Food(string input){
		name = input;
		cout << "Food " << name << " has been created" << endl;
	};
	void prepare(){
		cout << "Prepare the " << name << endl;
	};
private:
	string name;
};

class Fruit: public Food{
public:
    Fruit(){
		name = " ";
		ripeDate = " ";
		cout << "The fruit has been created" << endl;
	};
	Fruit(string d, string nameInput){
		name = nameInput;
		ripeDate = d;
		cout << "The fruit " << name << " has been created" << endl;
	};
	void ripeTime(){
		cout << "You can eat it on " << ripeDate << endl;
	};
private:
	string name;
	string ripeDate;
};

class Apple: public Fruit{
public:
    Apple(){
		ripeDate = " ";
		cout << "The apple has been created" << endl;
	};
	Apple(string d){
		ripeDate = d;
		cout << "The apple has been created" << endl;
	};
	void prepare(){
		cout << "Core the apple" << endl;
	};
private:
	string ripeDate;
};

class Orange: public Fruit{
public:
    Orange(){
		ripeDate = " ";
		cout << "The orange has been created" << endl;
	};
	Orange(string d){
		ripeDate = d;
		cout << "The orange has been created" << endl;
	};
	void prepare(){
		cout << "Peel the orange" << endl;
	};
private:
	string ripeDate;
};

class Vegetable: public Food{
public:
    Vegetable(){
		expireDate = " ";
		cout << "The vegetable has been created" << endl;
	};
	Vegetable(string nameInput, string d){
	    name = nameInput;
		expireDate = d;
		cout << "The vegetable has been created" << endl;
	};
	string expireTime(){
		return expireDate;
	};
private:
	string expireDate;
	string name;
};

class Tomato: public Fruit, public Vegtable {
public:
    Tomato(){
		ripeDate = " ";
		expireDate = " ";
		cout << "The tomato has been created" << endl;
	};
	Tomato(string nameInput, string eDate, string rDate){
	    name = nameInput;
		ripeDate = rDate;
		expireDate = eDate;
		cout << "The tomato has been created" << endl;
	};
private:
    string expireDate;
	string ripeDate;
	string name;
};

int main(){
    Tomato tomato("Red Tomato","April 24, 2020", "April 20, 2020");
	return 0;
}
