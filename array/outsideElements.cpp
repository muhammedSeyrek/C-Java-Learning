#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
	srand(time(0));
	int elements, sum = 0;
	cout << "Enter a elements = ";
	cin >> elements;
	int array[elements];
	for(int i = 0; i < elements; i++){
		array[i] = rand() % 100 + 1;
		cout << array[i] << " ";
		sum += array[i];
	}
	printf("\nSum = %d", sum);
	return 0;
}
