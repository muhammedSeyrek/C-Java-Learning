#include<iostream>
using namespace std;
int main(){
	cout << "Single numbers = ";
	for(int i = 3; i <= 15; i++)
		if(i % 2 == 1)
			cout << i << " ";
	return 0;
}
