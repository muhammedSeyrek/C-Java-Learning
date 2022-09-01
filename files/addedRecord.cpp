#include<iostream>
#include<fstream>
using namespace std;
int main(){
	ofstream file("C:\\Users\\Seyrek\\Desktop\\C++\\files\\text.txt", ios :: app);
	file << "\nYalniz senin gozlerini";
	file.close();
	return 0;
}
