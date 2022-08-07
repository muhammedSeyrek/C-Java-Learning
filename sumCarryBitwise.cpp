#include<iostream>
using std :: cout;
using std :: endl;
int main(){
	int x = 1, y = 0;
	int get = 0, sum = 0;
	sum = x ^ y;
	get = x & y;
	cout << "X\tY\tSum\tGet" << endl;
	cout << x << "\t" << y << "\t" << sum << "\t" << get;
	return 0;
}
