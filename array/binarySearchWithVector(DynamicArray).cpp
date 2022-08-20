#include<iostream>
#include<cstdlib>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
	string array[] = {"A", "B", "C"};
	//diziyi vektore donustur
	vector < string > vec(array, array + sizeof array / sizeof array[0]);
	vec.push_back("E");
	vec.push_back("D");
	sort(vec.begin(), vec.end());
	for(int i = 0; i < vec.size(); i++){
		cout << vec[i] << " ";
	}
	if(binary_search(vec.begin(), vec.end(), "E"))
		cout << "\nWanted found" << endl;
	else
		cout << "Not found";
	return 0;
}
