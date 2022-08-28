#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int main(){
	string names[] = {"Muhammed", "Merve", "Ahmet", "Apocan"};
	for(int i = 0; i < 4; i++){
		cout << *(names + i) << " ";
		cout << "elements of array " << i << endl;
	}
	return 0;
}
