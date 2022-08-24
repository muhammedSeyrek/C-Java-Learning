#include<iostream>
using namespace std;
int main(){
	int matrix1[3][3] = {{3, 5, 9}, {4, 6, 1}, {1, 8, 2}};
	int matrix2[3][3] = {{1, 0, 3}, {4, 5, 7}, {2, 3, 6}};
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			cout << matrix1[i][j] + matrix2[i][j] << " ";
		}
		cout << endl;
	}
	return 0;
}
