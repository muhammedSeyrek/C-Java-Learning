#include<iostream>
using namespace std;
int main(){
	int age;
	cout << "Enter a age = ";
	cin >> age;
	if(age <= 2)
		cout << "Baby";
	else if(age <= 13)
		cout << "Childhood";
	else if(age <= 21)
		cout << "Youth";
	else if(age <= 64)
		cout << "Adulthood";
	else
		cout << "Senile";	
	return 0;
}
