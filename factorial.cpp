#include<iostream>
using namespace std;
int main(){
	int number, fact = 1;
	cout << "Enter the number = ";
	cin >> number;
	for(int i = 1; i <= number; i++)
		fact *= i;
	cout << "Factorial = " << fact;
	return 0;
}
