#include<iostream>
using namespace std;
void trans(float fahn, float celc){
	celc = (fahn - 32) / 1.8;
	printf("Celcius value = %.2f", celc);
}
int main(){
	int fahn, celc;
	cout << "Enter a fahrenheit value = ";
	cin >> fahn;
	trans(fahn, celc);
	return 0;
}
