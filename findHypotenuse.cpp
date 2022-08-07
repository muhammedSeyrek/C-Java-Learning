#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int x, y;
	double hypotenuse;
	cout << "Enter the corner = ";
	cin >> x >> y;
	hypotenuse = sqrt(pow(x,2) + pow(y,2));
	cout << "Hypotenuse = " << hypotenuse;
	return 0;
}
