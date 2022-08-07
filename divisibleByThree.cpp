#include<iostream>
using namespace std;
int main(){
	int n, sum = 0, counter = 0;
	float avg = 0;
	cout << "Enter the number N = ";
	cin >> n;
	for(int i = 1; i < n; i++){
		if(i % 3 == 0){
			sum += i;
			counter++;
		}
	}
	avg = (float) sum / counter;
	printf("Average of numbers divisible by 3 = %.2f", avg);
	return 0;
}
