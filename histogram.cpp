#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	srand(time(NULL));
	int array[6];  
	cout << "Indis\tElements of array\tHistogram\n";
	for(int i = 0; i < 6; i++){
		array[i] = rand() % 30 + 1;
		cout << i << "\t" << array[i] << "\t\t\t"; 
		for(int j = 0; j < array[i]; j++){
			cout << "*";
		}
		cout << endl;
	}
	return 0;
}
