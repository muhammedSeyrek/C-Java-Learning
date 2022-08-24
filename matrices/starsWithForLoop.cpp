#include<iostream>
using namespace std;
int main(){
	char stars[5][5] = {0};
	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 5; j++){
			if(i == j || i + j == 4){
				stars[i][j] = '*';
			}
			cout << stars[i][j] << " ";
		}
		cout << endl;
	}
	return 0;
}
