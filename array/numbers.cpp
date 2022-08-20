#include<iostream>
using namespace std;
int main(){
	int array[12];
	for(int i = 0; i <= 11; i++){
		if(i > 5){
			array[i] = 11 - i;
		}
		else{
			array[i] = i;
		}
		cout << array[i] << " ";
	}
	return 0;
}
