#include<iostream>
using namespace std;
int factR(int number){
	if(number < 1)
		return 1;
	return factR(number - 1) * number;
}
int main(){
	int number;
	cout << "Enter a number = ";
	cin >> number;
	cout << "Factorial = " << factR(number);
	return 0;
}
