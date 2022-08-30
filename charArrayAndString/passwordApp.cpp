#include<iostream>
#include<string.h>
using namespace std;
int main(){
	string pass;
	int counter = 0;
	while(counter < 3){
		cout << "Enter password = ";
		cin >> pass;
		if(pass.compare("apple") == 0){
			cout << "\nCorrect";
			break;
		}
		else{
			if(counter == 2){
				cout << "\nWrong password";
				break;
			}
			cout << "Try again!\n";
		}
		counter++;
	}
	return 0;
}
