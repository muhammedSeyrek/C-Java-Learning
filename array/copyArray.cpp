#include<iostream>
using namespace std;
int main(){
	int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int B[10];
	for(int i = 0; i < 10; i++){
		B[i] = A[i];
		cout << B[i] << " ";
	}
	return 0;
}
