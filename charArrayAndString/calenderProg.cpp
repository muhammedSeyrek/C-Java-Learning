#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int main(){
	int calendar[12][31], counter = 0;
	char season[][10] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", 
	"October" ,"November", "December"};
	for(int i = 0; i < 12; i++){
		cout << "\n" << season[i] <<"\n\nMon\tTue\tWed\tThu\tFri\tSat\tSun\n";
		for(int l = 0; l < (counter % 7); l++)
			cout << "\t";
			for(int j = 0; j < 31; j++){
				if((i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11)){
					cout << j + 1 << "\t";
					counter++;
				}
				if(i == 1 && j < 28){
					cout << j + 1 << "\t";
					counter++;
				}
				if((i == 3 || i == 5 || i == 8 || i == 10) && j < 30){
					cout << j + 1 << "\t";
					counter++;
				}
				if(counter % 7 == 0)
					cout << endl;
			}
		cout << endl;
	}
	return 0;
}
