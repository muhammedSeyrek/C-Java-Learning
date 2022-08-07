#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int binary, decimal = 0, counter = 0;
	int size = 0;
	cout << "Enter a binary number = ";
	cin >> binary;
	size = sizeof(binary);
	for(int i = 0; i < size; i++){
		if(binary % 10 == 1){
			decimal += pow(2, counter);
		} 
		counter++;
		binary /= 10;
	}
	cout << "Decimal equivalent = " << decimal;
	return 0;
}
