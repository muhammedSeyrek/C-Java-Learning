#include<iostream>
#include<cstring>
using namespace std;
int main(){
	char str[] = "Sana giden yollar kapali. Ustelik sende hicbir zaman sevmedin beni. Ne kadar arada ucurum. Aramizda duvarlar gibi";
	char *pch;
	int i = 0;
	pch = strtok(str, ".");
	while(pch != NULL){
		cout << pch << endl;
		pch = strtok(NULL, ".");
		i++;
	}
	cout << "The sentences count = " << i;
	return 0;
}
