#include<iostream>
using namespace std;
int fibR(int number){
	if(number == 1)
		return number;
	else if(number == 0)
		return number;
	return fibR(number - 1) + fibR(number - 2);
}
int main(){
	int number;
	cout << "Enter a number = ";
	cin >> number;
	cout << "Fibonacci " << number << ".elements = " << fibR(number);
	return 0;
}
