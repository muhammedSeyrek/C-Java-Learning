#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int main(){
	char name[30];
	gets(name);
	for(int i = strlen(name) - 1; i >= 0; i--){
		cout << name[i];
	}
	cout << endl;
	//with Functions
	strrev(name);
	cout << name;
	return 0;
}
