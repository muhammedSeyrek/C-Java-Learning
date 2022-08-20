#include<iostream>
using namespace std;
int main(){
	int prime[100] = {0}, notPrime[100] = {0}, x = 0, y = 0;
	for(int i = 2; i < 100; i++){
		int flag = 1;
		for(int j = 2; j < i; j++){
			if(i % j == 0){
				flag = 0;
			}
		}
		if(flag == 1){
			prime[y] = i;
			y++;
		}
		if(flag == 0){
			notPrime[x] = i;
			x++;
		}
	}
	cout << "Asal sayilar = ";
	for(int i = 0; i < y; i++){
		cout << prime[i] << " ";
	}
	cout << endl;
	int n = 1;
	cout << "Asal olmayan sayilar = ";
	for(int i = 0; i < x; i++){
		cout << notPrime[i] << " ";
		if(i == 20 * n){
			cout << endl;
			n++;
		}
	}
}
