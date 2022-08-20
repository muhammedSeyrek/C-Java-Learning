#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	srand(time(NULL));
	int array[30];
	int freq[30] = {0};
	for(int i = 0; i < 30; i++){
		array[i] = rand() % 20 + 1;
		freq[array[i] - 1]++;
	}
	for(int i = 0; i < 30; i++){
		cout << (array[i] % 2 == 0 ? "Double = " : "Single = ") << array[i] << " => " << freq[array[i] - 1] << " piece" << endl;
	}
	
	
	
	
	return 0;
}
