#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int main(){
	char name[8] = "Sakarya";
	char nameCp[5];
	strncpy(nameCp, name, 4);
	cout << nameCp;
	return 0;
}
