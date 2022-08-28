#include<iostream>
using namespace std;
int main(){
	string a = "Sakarya";
	cout << a.at(5) << "\t" << a.at(0) << endl;
	cout << (int) a.at(1) << endl;
	cout << a.substr(3) << endl;
	char name[] = "Muhammed";
	cout << name + 3 << endl;
	puts(name);
	return 0;
}
