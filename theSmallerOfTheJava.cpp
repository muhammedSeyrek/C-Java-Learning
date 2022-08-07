#include<iostream>
using namespace std;
int main(){
	int a, b;
	cout << "Please enter two number = " << endl;
	cin >> a >> b;
	if(a > b){
		cout << "Numbers = " << b << " " << a;
	}
	else if(a == b){
		cout << "Numbers = " << endl << a << endl << b;
	}
	else{
		cout << "Number = " << a << " " << b;
	}
	return 0;
}
