#include<iostream>
#include<ctime>
#include<cstdlib>
using namespace std;
void print(int number, int count){
	cout << count << ".Double number = " << number << endl;
}
int main(){
	int a, b, counter = 0, bigN, smallN;
	srand(time(NULL));
	a = rand() % 100;
	b = rand() % 100;
	if(a < b){
		bigN = b;
		smallN = a;
	}
	else{
		bigN = a;
		smallN = b;
	}
	for(int i = smallN; i <= bigN; i++){
		if(i % 2 == 0){
			counter++;
			print(i, counter);
		}
	}
	return 0;
}
