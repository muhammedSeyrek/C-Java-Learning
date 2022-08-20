#include<iostream>
using namespace std;
int main(){
	float money = 0;
	int freqC[7] = {0};
	int freqP[4] = {0};
	int cash[7] = {200, 100, 50, 20, 10, 5, 1};
	float penny[4] = {0.5, 0.25, 0.1, 0.05};
	cout << "Enter a money = ";
	cin >> money;
	while(money >= 1){
		for(int i = 0; i < 7 && money >= 1; i++){
			money -= cash[i];
			freqC[i]++;
			if(money < 0){
				money += cash[i];
				freqC[i]--;
			}
		}
	}
	while(money > 0.1){
		for(int i = 0; i < 4 && money != 0.001; i++){
			money -= penny[i];
			freqP[i]++;
			if(money < 0.0){
				money += penny[i];
				freqP[i]--;
			}
		}
	}
	for(int i = 0; i < 7; i++){
		cout << freqC[i] << " pieces of " << cash[i] << endl;
	}
	for(int i = 0; i < 4; i++){
		cout << freqP[i] << " pieces of " << penny[i] << endl;
	}
	
	return 0;
}
