#include <iostream>
using namespace std;
int main()
{
    int bil;
    cout << "bil genap : " << endl;
    for (int i = 1; i <= 20; i++)
    {
        bil = i % 2;
        if (bil == 0)
        {
            cout << i;
        }
    }
    cout << endl;
    cout << "bil ganjil : " << endl;
    for (int j = 1; j < 20; j++)
    {
        bil = j % 2;
        if (bil != 0)
        {
            cout << j;
        }
    }
    cout << endl;

    return 0;
}