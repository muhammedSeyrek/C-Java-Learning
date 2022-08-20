#include<iostream>
#include<cstdlib>
#include<algorithm>
#include<vector>
using namespace std;
int main(){	
	int array[] = {2, 13, 4, 6, 17, 12, 34, 67, 89};
	int wanted;
	//diziyi vektore donustur.
	vector < int > vec (array, array + sizeof array / sizeof array[0]);
	//genel bir isaretci olustur.
	vector < int > :: iterator it;
	sort(vec.begin(), vec.end()); //sirala
	for(int i = 0; i < 9; i++){
		cout << vec[i] << " ";
	}
	cout << endl;
	cout << "Number sought = ";
	cin >> wanted;
	//arananin pozisyonunu bul.
	it = find(vec.begin(), vec.end(), wanted);
	if(binary_search(vec.begin(), vec.end(), wanted)){
		cout << "Wanted = " << it - vec.begin() + 1 << ".found steps" << endl;
	}
	else{
		cout << "Not found";
	}
	return 0;
}
