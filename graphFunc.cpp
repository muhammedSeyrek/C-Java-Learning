#include<iostream>
using namespace std;
int main(){
	double time, result = 0.0;
	cout << "Enter a number = ";
	cin >> time;
	if(time < 0)
		result = 0.0;
	else if(time <= 1 && time > 0)
		result = 1.0;
	else if(time > 1){
		result = time;
	}
	cout << "Result = " << result;
	return 0;
}
