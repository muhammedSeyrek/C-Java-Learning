#include<iostream>
#include<cstdlib>
#include<ctime>
#include<cmath>
using namespace std;
int main(){
	srand(time(NULL));
	int grade[2][7];
	float avarage = 0;
	for(int i = 0; i < 2; i++){
		grade[i][0] = i + 1;
		for(int j = 1; j < 6; j++){
			grade[i][j] = (int) rand() % 100 + 1;
		}
		avarage = ((grade[i][1] * 0.15 + grade[i][2] * 0.15 + grade[i][3] * 0.2 + grade[i][4] * 0.5)
		* 0.3 + grade[i][5] * 0.7);
		grade[i][6] = round(avarage);
	}
	cout << "No\tExam1\tExam2\tHwork\tMidT\tFinal\tSGrade\n\n";
	for(int i = 0; i < 2; i++){
		for(int j = 0; j < 7; j++){
			cout << grade[i][j] << "\t";
		}
		cout << endl;
	}
	return 0;
}
