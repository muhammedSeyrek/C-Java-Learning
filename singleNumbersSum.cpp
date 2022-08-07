#include<iostream>
using namespace std;
int main(){
	int sum = 0;
	for(int i = 0; i < 100; i++){
		if(i % 2 == 1)
			sum += i;
	}
	cout << "Sum = " << sum;
	return 0;
}
