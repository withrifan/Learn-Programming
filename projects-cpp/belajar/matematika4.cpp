#include <iostream>
using namespace std;

int main()
{
    int a = 4, b = 5, temp;
    temp = a;
    a = b;
    b = temp;

    cout << temp << endl;
    cout << a << endl;
    cout << b << endl;

    return 0;
}