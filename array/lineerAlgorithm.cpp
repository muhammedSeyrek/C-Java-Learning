#include<iostream>
using namespace std;
int main(){
	int array[] = {2, 5, 7, 8, 14, 18, 56, 87, 0};
	int wanted;
	cout << "Enter a number = ";
	cin >> wanted;
	for(int i = 0; i < sizeof(array) / 4; i++){
		if(wanted > array[i] && array[i + 1] > wanted){
			for(int j = sizeof(array) / 4; j >= i + 1; j--){
				array[j] = array[j - 1];
			}
			array[i + 1] = wanted;
		}
	}
	for(int i = 0; i < sizeof(array) / 4; i++){
		cout << array[i] << " ";
	}
	return 0;
}
