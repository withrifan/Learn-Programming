#include <iostream>
using namespace std;
int main()
{
    int x = 7, y = 5;
    x = y;
    y = x;
    cout << x << endl;
    cout << y << endl;
    return 0;
}
