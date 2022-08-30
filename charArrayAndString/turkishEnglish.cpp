#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int main(){
	char tr[][10] = {"Pazatesi", "Sali", "Carsamba", "Persembe", "Cuma",
		"Cumartesi", "Pazar"};
	char en[][10] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
		"Saturday", "Sunday"};
	cout << "Enter a turkish name = ";
	char *word;
	cin >> word;
	int decision = 1;
	int i;
	for(i = 0; i < 7 && decision != 0; i++){
		decision = strcmpi(word, tr[i]);
	}
	cout << "English name = " << en[i - 1];
	return 0;
}
