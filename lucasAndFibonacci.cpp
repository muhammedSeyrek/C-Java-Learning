#include<iostream>
using namespace std;
int main(){
	int fib[20] = {0, 1};
	int lucas[20] = {2, 1};
	for(int i = 2; i < 20; i++){
		fib[i] = fib[i - 1] + fib[i - 2];
		lucas[i] = lucas[i - 1] + lucas[i - 2];
	}
	cout << "Fibonacci = ";
	for(int i = 0; i < 20; i++){
		cout << fib[i] << " ";
	}
	cout << endl;
	cout << "Lucas = ";
	for(int i = 0; i < 20; i++){
		cout << lucas[i] << " ";
	}
	return 0;
}
