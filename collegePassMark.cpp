#include<iostream>
using namespace std;
int main(){
	int q1, q2, task, midterm, finalExam;
	double proccess = 0;
	cout << "Please, enter the P.S" << endl;
	cin >> q1 >> q2 >> task >> midterm >> finalExam;
	proccess = (double)((q1 * 0.1) + (q2 * 0.1) + (task * 0.1) + (midterm * 0.4) + (finalExam * 0.3));
	cout << "Proccess = " << proccess;
	return 0;
}
