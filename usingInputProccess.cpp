#include<iostream>
using namespace std;
int main(){
	char message[50];
	cout << "Enter the text..:";
	cin.getline(message,6);//takes the first 5 characters
	cout << message << endl;
	return 0;
}
