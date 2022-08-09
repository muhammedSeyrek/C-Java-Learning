#include<iostream>
#include<cstdlib>
using namespace std;
int ackermann(int m, int n){
	if(m == 0)
		return n + 1;
	else if(m > 0 && n == 0)
		return ackermann(m - 1, 1);
	else 
		return ackermann(m - 1, ackermann(m, n - 1));
}
int main(){
	cout << "Enter two numbers = ";
	int number1, number2;
	cin >> number1 >> number2;
	cout << "Result = " << ackermann(number1, number2);
	return 0;
}
