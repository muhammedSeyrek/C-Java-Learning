#include<iostream>
using namespace std;
int main(){
	int frame[10];
	for(int i = 0; i < 10; i++){
		frame[i] = (i + 1) * (i + 1);
		cout << frame[i] << " ";
	}
	return 0;
}
