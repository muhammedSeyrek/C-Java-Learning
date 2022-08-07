#include<iostream>
using namespace std;
int main(){
	char operators;
	cout << "Which do you want make proccess = ";
	cin >> operators;
	float number1, number2, result = 0;
	switch(operators){
		case '+':
			cout << "Enter the numbers = ";
			cin >> number1 >> number2;
			result = number1 + number2;
			break;
		case '-':
			cout << "Number and number to subtract = ";
			cin >> number1 >> number2;
			result = number1 - number2;
			break;
		case '*':
			cout << "Enter the numbers = ";
			cin >> number1 >> number2;
			result = number1 * number2;
			break;
		case '/':
			cout << "Number and number to divide = ";
			cin >> number1 >> number2;
			result = number1 / number2;
	}
	cout << "Result = " << result;
	return 0;
}
