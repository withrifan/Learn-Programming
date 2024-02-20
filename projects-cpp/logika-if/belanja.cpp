#include <iostream>
using namespace std;

int main()
{
    int total_belanja;
    cout << "Masukkan total belanja : ";
    cin >> total_belanja;

    if (total_belanja >= 10000)
    {
        cout << "Selamat anda mendapatkan diskon 5000" << endl;
        total_belanja = total_belanja - 5000;
    }
    cout << "total belanja : " << total_belanja << endl;
    return 0;
}