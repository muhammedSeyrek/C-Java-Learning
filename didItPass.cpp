#include<iostream>
using namespace std;
int main(){
	int note;
	cout << "Enter note of the student = ";
	cin >> note;
	if(note >= 50)
		cout << "Pass";
	else
		cout << "left";
	return 0;
}
