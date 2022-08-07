#include<iostream>
#include<cmath>
using namespace std;
int main(){
	double x, proccess = 0;
	cout << "Enter the number = ";
	cin >> x;
	if(x <= 0)
		proccess = pow(x, 2) + 1;
	else if(x >= 1)
		proccess = x;
	else if(0.0 < x && x < 1.0)
		proccess = sqrt(x);
	cout << "Result = " << proccess;
	return 0;
}
