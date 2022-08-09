#include<iostream>
using namespace std;
int go(){
	static int a = 9;
	a += 5;
	return a;
}
int main(){
	int b = go();
	cout << "Result = " << b << endl;
	b = go();
	cout << "Result = " << b;
	return 0;
}
