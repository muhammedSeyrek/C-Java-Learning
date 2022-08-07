#include<iostream>
using namespace std;
int main(){
	cout << "Is the lights on (1/0)" << endl;
	int lamp, answer;
	cin >> lamp;
	answer = lamp == true ? 1 : 0;
	cout << "Lamp = " << answer;
	return 0;
}
