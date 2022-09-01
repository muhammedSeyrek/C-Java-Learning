#include<iostream>
#include<fstream>
using namespace std;
int main(){
	ofstream file("C:\\Users\\Seyrek\\Desktop\\C++\\files\\text.txt");
	string str;
	cout << "Enter a text" << endl;
	cin >> str;
	file << str << endl;
	file.close();
	return 0;
}
