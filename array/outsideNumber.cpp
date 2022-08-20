#include<iostream>
using namespace std;
int main(){
	int array[5];
	cout << "Please enter 5 numbers" << endl;
	for(int i = 0; i < 5; i++){
		cin >> array[i];
	}
	for(int i = 0; i < 5; i++){
		cout << array[i] << " "; 
	}
	return 0;
}
