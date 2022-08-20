#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
	int n = 8;
	char word[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
	char wordReverse[8];
	for(int i = 0; i < 9; i++){
		wordReverse[i] = word[n - i];
		cout << wordReverse[i] << " ";
	}
}
