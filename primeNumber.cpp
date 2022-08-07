#include<iostream>
using namespace std;
int main(){
	int number;
	cout << "Enter a number = ";
	cin >> number;
	for(int i = 2; i < number; i++){
		bool flag = true;
		for(int j = 2; j < i; j++){
			if(i % j == 0){
				flag = false;
			}
		}
		if(flag == true){
			cout << "Prime Number = " << i << endl;
		}
	}
	return 0;
}
