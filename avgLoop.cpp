#include<iostream>
using namespace std;
int main(){
	int counter = 0, number = 1, sum = 0;
	float avg = 0;
	while(number != 0){
		cout << "Enter the number = ";
		cin >> number;
		sum += number;
		counter++;
	}
	counter -= 1;
	avg = ((float)sum / counter);
	printf("%.2f", avg);
	return 0;
}
