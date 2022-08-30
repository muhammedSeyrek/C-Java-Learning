#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
	char sent[50] = "Bugun sen cok gencsin yavrum";
	int wordC = 0, sentC = 1, i = 0;
	while(sent[i] != '\0'){
		if(isspace(sent[i]) != 0){
			sentC++;
		}
		wordC++;
		i++;
	}
	cout << "Word count = " << wordC << endl;
	cout << "Sentences count = " << sentC << endl;
 	return 0;
}
