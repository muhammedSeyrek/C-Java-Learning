#include<iostream>
using namespace std;
bool decision(int number){
	if(number % 2 == 0)
		return false;
	else
		return true;
}
int main(){
	cout << "Enter a number = ";
	int number;
	cin >> number;
	bool value = decision(number);
	cout << "Odd if the value is 1, double if 0 = " << value;
	return 0;
}
