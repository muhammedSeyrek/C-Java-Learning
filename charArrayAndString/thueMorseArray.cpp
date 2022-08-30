#include<iostream>
#include<cstring>
using namespace std;
string thueMorse(int n){
	if(n == 0)
		return string("0");
	string tm = thueMorse(n - 1);
	string tm2;
	for(int i = 0; i < tm.length(); i++){
		if(tm[i] == '0')
			tm2 += "01";
		else
			tm2 += "10";
	}
	return tm2;
}
int main(void){
	for(int i = 0; i < 6; i++)
		cout << thueMorse(i) << endl;
	return 0;
}
