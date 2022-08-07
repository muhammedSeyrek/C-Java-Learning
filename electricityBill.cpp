#include<iostream>
using namespace std;
int main(){
	int place, time = 0;
	float price = 0.0;
	cout << "Enter electric location = (1 = Workplace/0 = Domicile) = ";
	cin >> place;
	switch(place){
		case 0:
			cout << "Time spend = ";
			cin >> time;
			price = time * 2;
			break;
		case 1:
			cout << "Time spend = ";
			cin >> time;
			if(time < 50)
				price = time * 1;
			else if(time > 50 && time < 100){
				price = 50 * 1;
				time -= 50;
				price += (time * 2);
			}
			else if(time > 100){
				price += ((time - 100) * 3) + 150;
			}
			break;
		default:
			break;
		}
			cout << "Price = " << price;
	return 0;
}
