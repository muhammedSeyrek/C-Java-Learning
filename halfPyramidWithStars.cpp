#include<iostream>
using namespace std;
int main(){
	int x = 1;
	for(int i = 0; i < 4; i++){
		for(int j = 1; j <= x; j++){
			cout << "* ";
		}
		x += 2;
		cout << endl;
	}
	return 0;
}
