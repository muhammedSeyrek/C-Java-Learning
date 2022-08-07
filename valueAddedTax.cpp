#include<iostream>
using namespace std;
int main(){
	int price;
	float proccess;
	cout << "Please, enter the price = ";
	cin >> price;
	proccess = price + price * 0.18; 
	cout << "Result = " << proccess;
	return 0;
}
