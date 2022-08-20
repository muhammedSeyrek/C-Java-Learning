#include<iostream>
using namespace std;
static int elements = 15;
void takeNotes(int notes[]){
	int pass = 0, stay = 0;
	cout << "Notes = ";
	for(int i = 0; i < elements; i++){
		if(notes[i] < 5){
			stay++;
		}
		else{
			pass++;
		}
		cout << notes[i] << " ";
	}
	cout << "\nPass = " << pass << endl;
	cout << "Stay = " << stay << endl;
}
int main(){
	int notes[elements];
	cout << "Enter notes" << endl;
	for(int i = 0; i < elements; i++){
		cin >> notes[i];
	}
	takeNotes(notes);
	return 0;
}
