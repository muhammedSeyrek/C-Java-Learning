#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	srand(time(0));
	int array[10];
	for(int i = 0; i < 10; i++){
		array[i] = rand() % 6 + 1;
		cout << array[i] << " ";
	}
	return 0;
}
