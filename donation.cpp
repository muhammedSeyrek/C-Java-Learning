#include<iostream>
using std :: cout;
using std :: cin;
using std :: endl;
int main(){
	int donation;
	int volunteer = 1;
	cin >> donation;
	if(donation > 1000){
		if(volunteer == true){
			cout << "Write the name";
		}
		else{
			cout << "file";
		}
	}
	return 0;
}
