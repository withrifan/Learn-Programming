#include <iostream>
using namespace std;
int main()
{
    int x = 7;
    cout << int(x = x + 2) << endl;
    cout << x << endl;
    return 0;
}
