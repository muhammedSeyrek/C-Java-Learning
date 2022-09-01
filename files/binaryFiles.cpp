#include<iostream>
#include<fstream>
using namespace std;
int main(){
	ofstream bFile;
	bFile.open("file.bin", ios :: binary|ios :: out);
	char array[] = {'x', 'y', 'z'};
	bFile.write(array, sizeof(array));
	bFile.close();
	return 0;
}
