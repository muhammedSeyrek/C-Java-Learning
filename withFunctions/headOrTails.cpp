#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
bool headOrTails(){
	bool money = rand() % 2;
	cout << "Money is " <<((money == false ? "Head" : "Tails"));
	return money;
}
int main(){
	srand(time(0));
	headOrTails();
	return 0;
}
