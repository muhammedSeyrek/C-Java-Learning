#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
int main(){
	char name[] = "Sakarya";
	char *p, *r;
	p = strchr(name, 'a');
	cout << "Positions = " << p - name << endl;
	cout << "Found = " << p << endl;
	r = strrchr(name, 'a');
	cout << "Positions = " << r - name << endl;
	cout << "Found = " << r << endl;
	string s1 = "Heme";
	string s2 = "Ezost";
	cout << s1.length() << endl;
	cout << s1.replace(0, 2, s2, 0, 2) << endl;
	cout << s1.compare(0 , 2, s2, 0, 2); 
	return 0;
}
