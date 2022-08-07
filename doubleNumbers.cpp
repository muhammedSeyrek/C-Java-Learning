#include<iostream>
using std :: cout;
int main(){
	int i;
	for(i = 0; i < 12; i++){
		if(i % 2 == 0){
			cout << "Cift sayilar = " << i;
		}
		else{
			cout << " Tek sayilar = " << i;
			cout << "\n";
		}
	}
	return 0;
}
