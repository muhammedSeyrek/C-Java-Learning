#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int frame(int number){
	return number * number;
}
void random(){
	int number = (int) rand() % 70 + 7;
	cout << "Square of the " << number << " = " << frame(number) << endl;
}
int main(){
	srand(time(NULL));
	for(int i = 0; i < 7; i++){
		random();
	}
	return 0;
}
