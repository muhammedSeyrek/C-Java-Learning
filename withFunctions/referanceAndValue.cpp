#include<iostream>
using namespace std;
int number = 4;
void refFunc(int &number){
	number = 8;
}
void valFunc(int number){
	number = 8;
}
int main(){
	cout << "With value = ";
	valFunc(number);
	cout << number;
	cout << endl;
	cout << "With referance = ";
	refFunc(number);
	cout << number;
	return 0;
}
