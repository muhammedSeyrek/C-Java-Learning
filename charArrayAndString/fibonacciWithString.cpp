#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int main(){
	char temp[400] = {0};
	char temp2[400] = {0};
	char fib[500] = {0};
	strcat(temp, "b");
	strcat(temp2, "a");
	int count = 5;
	cout << temp << endl << temp2 << endl;
	strcat(fib, temp2);
	while(count > 0){
		strcat(fib, temp);
		strcpy(temp, temp2);
		strcpy(temp2, fib);
		cout << fib << endl;
		count--;
	}
	return 0;
}
