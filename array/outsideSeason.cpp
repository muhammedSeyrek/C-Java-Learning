#include<iostream>
using namespace std;
int main(){
	char month[][20] = {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz", 
	"Agustos", "Eylul", "Ekim", "Kasim", "Aralik"};
	int choose = 0;
	cout << "Enter a month number = ";
	cin >> choose;
	if(choose > 12){
		cout << "Error";
	}
	else{
		cout << month[choose - 1];
	}
	return 0;
}
