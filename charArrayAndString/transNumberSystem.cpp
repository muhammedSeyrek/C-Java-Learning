#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
	int i = 65;
	char str[50];
	cout << "Binary = " << itoa(i, str, 2) << endl;
	cout << "Octal = " << itoa(i, str, 8) << endl;
	cout << "Hexadecimal = " << itoa(i, str, 16) << endl;
	return 0;
}
