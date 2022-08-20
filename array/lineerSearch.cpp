#include<iostream>
using namespace std;
int main(){
	int array[] = {2, 3, 5, 8, 9, 12, 34, 65, 77, 88};
	int wanted, i;
	cout << "Enter a number = ";
	cin >> wanted;
	for(i = 0; i < 10; i++){
		if(wanted == array[i])
			break;
	}
	cout << "Number " << array[i] << " " << i + 1 << " found in step";
 	return 0;
}
