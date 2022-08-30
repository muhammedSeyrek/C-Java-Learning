#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
void palindrome(string text){
	string tempT = text;
	reverse(tempT.begin(), tempT.end());
	if(tempT == text){
		cout << "Is palindrom";
	}
	else{
		cout << "Not palindrom";
	}
}
int main(){
	cout << "Enter a text = ";
	string text;
	getline(cin, text);
	palindrome(text);
	return 0;
}
