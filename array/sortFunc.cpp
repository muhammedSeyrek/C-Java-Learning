#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int enkenb(const void *a, const void *b){
	return (* (char*) a - * (char*) b);
}
int main(){
	char name[] = {'s', 'e', 'l', 'i', 'm', 'i', 'y', 'e'};
	qsort(name, strlen(name), sizeof(char), enkenb);
	for(int i = 1; i < strlen(name); i++){
		cout << name[i] << " ";
	}
	return 0;
}
