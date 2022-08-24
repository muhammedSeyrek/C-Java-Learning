#include<iostream>
using namespace std;
int main(){
	int matrix[3][4];
	int transpose[4][3];
	cout << "Enter the number\n";
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 4; j++){
			cin >> matrix[i][j];
			transpose[j][i] = matrix[i][j];
		}
	}
	cout << endl << endl << "Classical Matrix" << endl;
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 4; j++){
			cout << matrix[i][j] << " ";
		}
		cout << endl;
	}
	cout << endl << endl << "Transpose Matrix" << endl;
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 3; j++){
			cout << transpose[i][j] << " ";
		}
		cout << endl;
	}
	return 0;
}
