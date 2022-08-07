#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int number = 1;
	while(number != 0){
		cout << "Enter a number = ";
		cin >> number;
		cout << "Square = " << pow(number, 2) << endl;
	}
	return 0;
}
