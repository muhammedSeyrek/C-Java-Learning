#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n, fib = 1, first = 0, second = 1;
	cout << "Enter the n = ";
	cin >> n;
	while(n > 0){
		cout << fib << " ";
		fib = first + second;
		first = second;
		second = fib;
		n--;
	}
	cout << "\n" << "Golden Ratio = " << (float) second / first;
	cout << "\n" << "Equals = " << ((float) second / first) + 1 << " = " << (float) pow((float) second / first, 2);
	return 0;
}
