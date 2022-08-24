#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	srand(time(0));
	int array[3][4], doubleN[12], singleN[12], counterD = 0, counterS = 0;
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 4; j++){
			array[i][j] = rand() % 9 + 1;
			if(array[i][j] % 2 == 0){
				doubleN[counterD] = array[i][j]; counterD++;
			}
			else{
				singleN[counterS] = array[i][j]; counterS++;
			}
				
		}
	}
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 4; j++){
			cout << "[" << i << "," << j << "] = " << array[i][j] << "\t";
		}
		cout << endl;
	}
	cout << "\n\nDouble Array = ";
	for(int i = 0; i < counterD; i++){
		cout << doubleN[i] << " ";
	}
	
	cout << "\nSingle Array = ";
	for(int i = 0; i < counterS; i++){
		cout << singleN[i] << " ";
	}
	return 0;
}
