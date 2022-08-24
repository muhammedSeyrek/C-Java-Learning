#include<iostream>
using namespace std;
int main(){
	int matrix1[3][3] = {{2, 3, 5}, {6, 7, 8}, {9, 10, 11}};
	int matrix2[3][3] = {{1, 2, 7}, {6, 5, 4}, {3, 2, 1}};
	int product[3][3] = {0};
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			for(int k = 0; k < 3; k++){
				product[i][j] += matrix1[i][k] * matrix2[k][j];
			}
		}
	}
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			cout << product[i][j] << " ";
		}
		cout << endl;
	}
	return 0;
}
