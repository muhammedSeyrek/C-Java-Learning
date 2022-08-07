#include<iostream>
using namespace std;
int main(){
	int i = 10, sum = 0, number;
	while(i > 0){
		cout << "Enter a number = ";
		cin >> number;
		sum += number;
		i--;
	}
	cout << "Sum = " << sum;	
	return 0;
}
