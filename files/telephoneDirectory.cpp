#include<iostream>
#include<string.h>
#include<conio.h>
#include<ctype.h>
using namespace std;
struct direct{
	char name[15];
	char surname[15];
	char tel[11];
}record;
FILE *rFile;
void addRecord(){
	int recordNo = 0;
	char ans = 'y';
	rFile = fopen("direct.txt", "ab+");
	do{
		recordNo++;
		cout << "\nPlease enter name\n";
		fflush(stdout);
		gets(record.name);
		cout << "Please enter surname\n";
		fflush(stdout);
		gets(record.surname);
		cout << "Please enter telephone\n";
		fflush(stdout);
		gets(record.tel);
		fseek(rFile, (recordNo - 1) * sizeof(record), SEEK_SET);
		fwrite(&record, sizeof(record), 1, rFile);
		cout << "Move on ? (y/n)\n";
		ans = getche();	
	}while(toupper(ans) == 'y');
	fclose(rFile);
}
void recordList(){
	rFile = fopen("direct.txt", "rb+");
	cout << "Writing records\n";
	cout << "-----------------" << endl;
	while(!feof(rFile)){
		fread(&record, sizeof(record), 1, rFile);
		if(feof(rFile)) 
			break;
		printf("%s\t%s\t%s\n", record.name, record.surname, record.tel);
	}
	cout << "-----------------" << endl;
	fclose(rFile);
}
int main(){
	char ch;
	do{
		cout << "1 - Added record" << endl;
		cout << "2 - List record" << endl;
		cout << "3 - Exit" << endl;
	ch = getche();
	switch(ch){
		case '1' : addRecord(); break;
		case '2' : recordList(); break;
		case '3' : break;
	}
	}while(ch != 3);
	return 0;
}
