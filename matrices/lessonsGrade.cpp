#include<iostream>
#include<cstdlib>
#include<ctime>
#include<cmath>
using namespace std;
int main(){
	srand(time(0));
	int notes[10][7][3];
	float avarage;
	for(int k = 0; k < 3; k++){
		for(int i = 0; i < 10; i++){
			notes[i][0][k] = i + 1;
			for(int j = 1; j < 6; j++){
				notes[i][j][k] = rand() % 100 + 1;
			}
			avarage = ((notes[i][1][k] * 0.15 + notes[i][2][k] * 0.15 + notes[i][3][k] * 0.2
			+ notes[i][4][k] * 0.5) * 0.3 + + notes[i][5][k] * 0.7);
			notes[i][6][k] = round(avarage);
		}
	}
	cout << "No\tExam1\tExam2\tHwork\tMidT\tFinal\tSGrade\n\n";
	for(int k = 0; k < 3; k++){
		if(k == 0){
			cout << "Math\n\n";
		}
		else if(k == 1){
			cout << "Physics\n\n";
		}
		else{
			cout << "Chemistry\n\n";
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 7; j++){
				cout << notes[i][j][k] << "\t"; 
			}
			cout << endl;
		}
		cout << endl << endl;
	}
	return 0;
}
