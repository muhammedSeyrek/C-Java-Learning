#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int number;
	cout << "Enter a number = ";
	cin >> number;
	int a, b;
	a = sqrt(number);
	b = a * a;
	cout << ((number == b) ? "Full frame" : "Not full frame");
	return 0;
}
