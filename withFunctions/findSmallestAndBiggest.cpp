#include<iostream>
using namespace std;
int smallest(int x, int y){
	if(x > y){
		return y;
	}
	else{
		return x;
	}
}
int biggest(int x, int y){
	if(x > y){
		return x;
	}
	else{
		return y;
	}
}
int main(){
	int x, y;
	cout << "Enter two numbers = ";
	cin >> x >> y;
	int smallN = smallest(x, y);
	int bigN = biggest(x, y);
	cout << "Small number = " << smallN << endl << "Big number = " << bigN;
	return 0;
}
