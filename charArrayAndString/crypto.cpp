#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int main(){
	cout << "Please enter a name = ";
	char name[20];
	gets(name);
	for(int i = 0; i < strlen(name); i++){
		if(name[i] + 13 <= 90){
			name[i] = name[i] + 13;
		}
		else{
			int addF = 0;
			while(name[i] <= 90){
				addF++;
				name[i]++;
			}
			name[i] = 65;
			int addL = 13 - addF;
			name[i] += addL;
		}
	}
	cout << name;
	return 0;
}
