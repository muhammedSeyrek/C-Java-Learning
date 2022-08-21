#include<iostream>
using namespace std;
int main(){
	int matrix[3][4], number = 1;
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 4; j++){
			matrix[i][j] = (i * 4) + (j + 1);
			cout << matrix[i][j] << "\t";
		}
		cout << endl;
	}
	return 0;
}
