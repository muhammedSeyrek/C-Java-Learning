#include<iostream>
using namespace std;
int main(){
	int numbers[5][5] = {0};
	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 5; j++){
			if(i == j && (i != 2 && j != 2) || i + j == 4 && (i != 2 && j != 2)){
				numbers[i][j] = i + 1;
			}
			else if(i == 2 && j == 2){
				numbers[i][j] = 6;
			}
			else{
				numbers[i][j] = 0;
			}
		}
	}
	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 5; j++){
			cout << numbers[i][j] << " ";
		}
		cout << endl;
	}
	return 0;
}
