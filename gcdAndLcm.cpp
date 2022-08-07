#include<iostream>
using namespace std;
int main(){
	int number1, number2 ,lcm = 1, gcd, smallN, bigN;
	cout << "Enter two numbers to find gcd and lcm" << endl;
	cin >> number1 >> number2;
	if(number1 > number2){
		smallN = number2;
		bigN = number1;
	}
	else{
		smallN = number1;
		bigN = number2;
	} 
	bool flag = true;
	for(int i = smallN; i >= 1 && flag; i--){
		if(bigN % i == 0 && smallN % i == 0){
			gcd = i;
			flag = false;
		}
	}
	for(int i = 1; i <= bigN; i++){
		int temp = smallN;
		temp *= i;
		if(temp >= bigN && temp % bigN == 0){
			lcm = temp;
			i *= bigN + 1;
		}
	}
	cout << "Greatest common divisor = " << gcd << endl;
	cout << "Lowest common multiple = " << lcm << endl;
	return 0;
}
