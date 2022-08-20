#include<iostream>
using namespace std;
int main(){
	int cardN[16];
	cout << "Enter the 16 digit card number\n";
	for(int i = 0; i < 16; i++){
		cin >> cardN[i];
	}
	int sum = 0;
	for(int i = 0; i < 16; i++){
		if(i % 2 == 0){
			sum += (cardN[i] * 2);
		}
		else{
			sum += cardN[i];
		}
	}
	if(sum % 10 == 0){
		cout << "Is a valid card order";
	}
	else{
		cout << "Not valid card number";
	}
	return 0;
}
