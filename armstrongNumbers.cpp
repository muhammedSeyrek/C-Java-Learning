#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int counter = 1;
	for(int i = 100; i < 1000; i++){
		int temp = i, arm = 0;
		while(temp != 0){
			arm += pow(temp % 10, 3);
			temp /= 10;
		}
		if(arm == i){
			cout << counter <<".Armstrong number = " << arm << endl;
			counter++;
		}
	}
	return 0;
}
