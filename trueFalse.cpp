#include<iostream>
using std :: cout;
using std :: cin;
using std :: endl;
int main(){
	int counter;
	counter = false || (((true) || false) && true);
	cout << counter;
	return 0;
}
