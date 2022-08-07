#include<iostream>
using namespace std;
int main(){
	int number;
	cout << "Enter a note of the student = ";
	cin >> number;
	number /= 10;
	switch(number){
		case 10:
		case 9:
			cout << "AA";
			break;
		case 8:
			cout << "BA";
			break;
		case 7:
			cout << "BB";
			break;
		case 6:
			cout << "CB";
			break;
		case 5:
			cout << "CC";
			break;
		default:
			cout << "FF";
			break;
	}
	return 0;
}
