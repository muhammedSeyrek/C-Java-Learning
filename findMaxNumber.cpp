#include<iostream>
using namespace std;
int main(){
	int a, b, c;
	cout << "Enter three number = ";
	cin >> a >> b >> c;
	int max;
	max = a;
	if(max < b)
		max = b;
		if(max < c)
			max = c;
	else
		if(max < c)
			max = c;
			
	cout << "Max number = " << max;
	return 0;
}
