#include<iostream>
using std :: cout;
using std :: endl;
int main(){
	int a = 3, b = 6;
	int c = a | b;
	int d = a & b;
	int e = a ^ b;
	int f = ~a & b;
	cout << c << endl << d << endl << e << endl << f;
	return 0;
}
