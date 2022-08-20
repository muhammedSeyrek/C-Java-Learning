#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	srand(time(NULL));
	int numbers[13];
	cout << "Numbers = ";
	for(int i = 0; i < 13; i++){
		numbers[i] = rand() % 99 + 1;
		cout << numbers[i] << " ";
	}
	cout << endl;
	int smaller;
	for(int i = 0; i < 12; i++){
		for(int j = i + 1; j < 13; j++){
			if(numbers[i] < numbers[j]){
				smaller = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = smaller;
			}
		}
	}
	for(int i = 0; i < 13; i++){
		cout << numbers[i] << " ";
	}
	cout << endl;
	cout << "Smaller = " << numbers[0];
	cout << endl << "Bigger = " << numbers[12];
	return 0;
}
