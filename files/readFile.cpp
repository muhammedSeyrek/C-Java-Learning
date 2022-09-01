#include<iostream>
#include<fstream>
using namespace std;
int main(){
	ifstream read("C:\\Users\\Seyrek\\Desktop\\C++\\files\\text.txt");
	string str;
	while(! read.eof()){
		str = read.get();
		if(read.eof())
			break;
		cout << str;
	}
	read.close();
	return 0;
}
