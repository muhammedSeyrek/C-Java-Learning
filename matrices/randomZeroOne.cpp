#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	int n;
	srand(time(NULL));
	cout << "Enter n value = ";
	cin >> n;
	int array[n][n], oneZero[2] = {0};
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			array[i][j] = rand() % 2;
			cout << array[i][j] << "\t";
			oneZero[array[i][j]]++;
		}
		cout << "\n";
	}
	cout << endl;
	cout << "Zeros = " << oneZero[0] << endl;
	cout << "Ones = " << oneZero[1];
	return 0;
}
