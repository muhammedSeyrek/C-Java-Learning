#include<iostream>
#include<cmath>
#define pi 3.14159265358
using namespace std;
int fact(int number){
	int factorial = 1;
	for(int i = number; i >= 1; i--){
		factorial *= i;
	}
	return factorial;
}
int main(){
	int power, counter = 15;
	double result;
	cout << "Angle\tDegree\n";
	for(int i = 0; i < 100; i += 10){
		result = 0;
		double x = (float) i * pi / 180;
		for(int j = 0; j < counter; j++){
			power = 2 * j + 1;
			result = result + pow(-1, j) * pow(x, power) / fact(power);
		}
		printf("%d\t%g\n", i, result);
	}
	return 0;
}
