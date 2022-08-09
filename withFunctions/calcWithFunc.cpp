#include<iostream>
using namespace std;
float sum(int number1, int number2){
	return number1 + number2;
}
float extrac(int number1, int number2){
	return number1 - number2;
} 
float impact(int number1, int number2){
	return number1 * number2;
}
float divide(int number1, int number2){
	return (float) number1 / (float) number2;
}
int main(){
	int decision = 1;
	while(decision != 0){
		float number1, number2;
		cout << "Enter the numbers you will proccess = ";
		cin >> number1 >> number2;
		cout << "1 - Sum\n2 - Extraction\n3 - Impact\n4 - Divide" << endl;
		int proccess;
		cin >> proccess;
		switch(proccess){
			case 1:
				printf("Result = %.2f\n",sum(number1, number2));
				break;
			case 2:
				printf("Result = %.2f\n",extrac(number1, number2));
				break;
			case 3:
				printf("Result = %.2f\n",impact(number1, number2));
				break;
			case 4:
				printf("Result = %.2f\n",divide(number1, number2));
				break;
			default:
				cout << "Enter the number again = ";
				cin >> proccess;
				break;
		}
		cout << "Do you want continue ? (Continue = 1 / Break = 0) = ";
		cin >> decision;
	}
	return 0;
}
