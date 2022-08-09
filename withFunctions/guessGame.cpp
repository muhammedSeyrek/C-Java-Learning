#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int guess(){
	srand(time(0));
	return rand() % 100;
}
int main(){
	int guessN = 1;
	while(guessN != 0){
		int number1, a, b;
 		int	number2 = guess();
 		a = rand() % 5;
 		b = rand() % 5;
		cout << number2 - a << " between " << number2 + b << endl;
		cout << "Enter a number = ";
		cin >> number1;
		guessN = (number1 == number2 ? 0 : 1);
	}
	cout << "Well done";
	return 0;
}
