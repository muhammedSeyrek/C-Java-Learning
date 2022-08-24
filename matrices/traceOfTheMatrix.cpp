#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	int n;
	cout << "Enter n numbers = ";
	cin >> n;
	int array[n][n] = {0};
	srand(time(0));
	int trace = 0;
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			array[i][j] = rand() % 100 + 1;
			cout << array[i][j] << "\t";
			if(i == 0 && j == 0 || (i == n - 1 && j == n - 1) || (i == 0 && j == n - 1) 
			|| (i == n - 1 && j == 0)){
				trace += array[i][j];
			}		
		}
		cout << endl;
	}
	cout << endl << "Trace of the matrix = " << trace;
	return 0;
}
