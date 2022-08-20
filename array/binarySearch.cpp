#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
	int array[] = {1, 5, 8, 14, 56, 78, 104, 112, 120};
	int size = sizeof(array) / 4;
	int wanted, middle, top = size - 1, bottom = 0, counter = 0, ans = 1;
	cout << "Enter a number = ";
	cin >> wanted;
	middle = top / 2;
	for(int i = 0; i < size && ans == 1; i++){
		if(wanted == array[middle]){
			ans = 0;
		}
		else{
			if(wanted > array[middle]){
				bottom = middle;
				middle = (bottom + top) / 2; 
			}
			else{
				top = middle;
				middle = (bottom + top) / 2;
			}
		}
		counter++;
	}
	if(ans == 0){
		cout << counter << ".found steps = " << array[middle];
	}
	else{
		cout << "Not found !";
	}
	return 0;
}
