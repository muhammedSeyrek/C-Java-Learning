#include<iostream>
#include<fstream>
using namespace std;
int main(){
	ifstream file1("C:\\Users\\Seyrek\\Desktop\\C++\\files\\text.txt");
	ofstream file2("C:\\Users\\Seyrek\\Desktop\\C++\\files\\text2.txt");
	string str;
	while(! file1.eof()){
		str = file1.get();
		if(file1.eof()) 
			break;
		file2 << str;
	}
	file1.close();
	cout << file2;
	file2.close();
	return 0;
}
