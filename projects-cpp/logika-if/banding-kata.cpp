#include <iostream>
#include <string.h>
using namespace std;
int main()
{

    char a[6];
    char b[5];

    cout << "masukkan kata 1 : ";
    cin >> a;
    cout << "masukkan kata 2 : ";
    cin >> b;

    if (strcmp(a, b) == 0)
    {
        cout << "sama" << endl;
    }
    else
    {
        cout << "tidak sama" << endl;
    }

    return 0;
}