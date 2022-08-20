#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	int vote[7];
	string name[7] = {"Muhammed", "Merve", "Ahmet", "Abdullah", "Hayrettin", "Serafettin", "Yakup"};
	srand(time(NULL));
	for(int i = 0; i < 7; i++){
		vote[i] = rand() % 100 + 1;
		cout << name[i] << " = " << vote[i] << endl;
	}
	int smaller;
	string smallerN;
	for(int i = 0; i < 6; i++){
		for(int j = i + 1; j < 7; j++){
			if(vote[i] > vote[j]){
				smallerN = name[j];
				name[j] = name[i];
				name[i] = smallerN;
				smaller = vote[j];
				vote[j] = vote[i];
				vote[i] = smaller;
			}
		}
	}
	cout << "Sequential votes" << endl;
	for(int i = 0; i < 7; i++){
		cout << name[i] << " = " << vote[i] << endl;
	}
	return 0;	                	
}
